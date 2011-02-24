package org.nick.wwwjdic;

import java.util.regex.Pattern;

import org.nick.wwwjdic.history.HistoryDbHelper;
import org.nick.wwwjdic.utils.IntentSpan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.ClipboardManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public abstract class DetailActivity extends Activity implements
        OnCheckedChangeListener, OnLongClickListener {

    protected static final Pattern CROSS_REF_PATTERN = Pattern
            .compile("^.*\\(See (\\S+)\\).*$");

    private static final int ITEM_ID_HOME = 0;

    protected HistoryDbHelper db;
    protected WwwjdicEntry wwwjdicEntry;
    protected boolean isFavorite;

    protected DetailActivity() {
        db = new HistoryDbHelper(this);
    }

    protected void addToFavorites() {
        long favoriteId = db.addFavorite(wwwjdicEntry);
        wwwjdicEntry.setId(favoriteId);
    }

    protected void removeFromFavorites() {
        db.deleteFavorite(wwwjdicEntry.getId());
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            addToFavorites();
        } else {
            removeFromFavorites();
        }
    }

    @Override
    public boolean onLongClick(View v) {
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(wwwjdicEntry.getHeadword());
        String messageTemplate = getResources().getString(
                R.string.copied_to_clipboard);
        Toast t = Toast.makeText(this,
                String.format(messageTemplate, wwwjdicEntry.getHeadword()),
                Toast.LENGTH_SHORT);
        t.show();

        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, ITEM_ID_HOME, 0, R.string.home).setIcon(
                android.R.drawable.ic_menu_compass);

        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
        case ITEM_ID_HOME:
            Intent intent = new Intent(this, Wwwjdic.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            setHomeActivityExtras(intent);

            startActivity(intent);
            finish();

            return true;
        default:
            // do nothing
        }

        return super.onMenuItemSelected(featureId, item);
    }

    protected abstract void setHomeActivityExtras(Intent homeActivityIntent);

    protected WwwjdicApplication getApp() {
        return (WwwjdicApplication) getApplication();
    }

    protected void makeClickable(TextView textView, int start, int end,
            Intent intent) {
        SpannableString str = SpannableString.valueOf(textView.getText());
        str.setSpan(new IntentSpan(this, intent), start, end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(str);
        textView.setLinkTextColor(Color.WHITE);
        MovementMethod m = textView.getMovementMethod();
        if ((m == null) || !(m instanceof LinkMovementMethod)) {
            if (textView.getLinksClickable()) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }
}