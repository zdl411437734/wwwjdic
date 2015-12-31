# Changelog #
  * v2.3.8.1 (2014/6/15)
    * Fixed preferences display on Android 4.4+ tablets.
  * v2.3.8 (2014/6/12)
    * Use Kanji Recognizer for handwriting recognition
  * v2.3.7 (2014/3/21)
    * Scale stroke annotations
    * Handwriting recognition fixes for some devices
  * v2.3.6 (2014/3/18)
    * Bug fixes
  * v2.3.5 (2014/2/28)
    * Added new Germany mirror
  * v2.3.4 (2013/12/24) Backup file selection
    * Android 4.4 support
    * Added backup file selection dialog (4.4+)
  * v2.3.3 (2013/8/12) Force Japanese font
    * Use Japanese font on non-Japanese locales (4.2+)
    * Added action to share Anki deck
    * Bug fixes
  * v2.3.2 (2013/6/25) Widget improvements
    * White text for transparent widget
    * Widget layout adjustments
    * Search UI improvements
  * v2.3.1 (2013/6/10) Anki 2.0 support
    * Support for Anki 2.0 export pacakges (.apkg)
    * Improved landscape support for widget
    * Bug fixes
  * v2.3.0 (2013/5/29) Resizable widget
    * Widget text scaling on resize (4.1+)
    * Added transparent widget option
    * Added 'Create flashcard' menu (requires Anki 2.0+)
    * Support DTalker TTS
    * UI improvements
    * Removed analytics and update check
    * Bug fixes
  * v2.2.5 (2012/11/19) New Japan mirror
    * New Japan mirror support
    * Nexus 7 support
    * Direct search from soft keyboard
    * Bug fixes
  * v2.2.4 (2012/7/25) Jelly Bean support
    * Jelly Bean (4.1) support
    * Toggle keyboard popup on startup
    * Persist search type for each tab
    * Bug fixes
  * v2.2.3 (2012/3/28) Bug fix release
    * Avoid OCR crash on devices without flash
    * Don't clear translation query string for OCR
    * Fixed typos
  * v2.2.2 (2012/3/25) Bug fix release
    * Fixed widget detailed layout bug
  * v2.2.1 (2012/3/24) Bug fix
    * Use larger action bar tab and menu font for Japanese
  * v2.2 (2012/3/24) New UI and dictionaries
    * Improved UI and icons
    * Italian, Wordnet and Combined dictionaries
    * Share action
    * Sequential mode for widget
    * Widget preferences in Settings
    * Performance optimizations
    * Handle WWWJDIC maintenance
  * v2.1.1 (2011/11/7) Bugfix release
    * Fixed Japanese TTS bug
    * Avoid crash when opening Settings in landscape mode
    * Improved error reporting
  * v2.1 (2011/11/6) TTS improvements and ICS support
    * Text-to-speech for example sentences
    * Multiple Japanese TTS engines support (Settings)
    * Android 4.0 (ICS) consistent UI
    * ICS support
    * Bug fixes
  * v2.0 (2011/9/30) Tablet support
    * Tablet support
    * New UI
    * Japanese text-to-speech support (install [N2 TTS](https://market.android.com/details?id=jp.kddilabs.n2tts) from Market to enable)
    * Removed Google account permissions and Google Docs export
    * Various improvements and bug fixes
    * Dropped Android 1.6 support. The lowest supported version is now 2.1 (Eclair).
  * v1.8.7 (2011/8/17) New example search
    * Use new example search: automatically matches inflected, differently spelled words
    * Support OCR for gallery images
    * Bug fixes
  * v1.8.6 (2011/7/31) New Sweden mirror
    * Use new Sweden mirror site
    * Updated third-party libraries
  * v1.8.5 (2011/7/22) Performance optimization and bug fixes
    * Fix for empty search results on some mobile networks
    * Performance optimizations
    * Bug fixes
  * v1.8.4 (2011/6/29) New Japan mirror
    * Switched to new Japan mirror
    * Properly display kanji grade in kanji details
    * Bug fixes
  * v1.8.3.2
    * moved JLPT kanji to class file to avoid resource array restriction on pre-Gingerbread devices.
  * v1.8.3.1
    * Temporary disabled JLPT support. Pre-Gingerbread device can't handle resource arrays with more than 512 elements.
  * v1.8.3 (2011/6/6) New JLPT levels support.
    * Kanji of the day can now be limited to specified JLPT level
    * Display new JLPT level in kanji details
    * Search by English meaning now returns all relevant results
    * Bug fixes
  * v1.8.2 (2011/5/22) Support new WWWJDIC dictionary codes. Stability improvements
    * Use new WWWJDIC dictionary codes
    * Save TTS languae in history/favorites
    * OCR error handling improvements
    * Automatically refresh widget after network connectivity is restored
    * Performance improvements
    * Various bug fixes
  * v1.8.1 (2011/5/15) App maintenance features
    * Added automatic error reporting
    * Added automatic update check
    * Mobile friendly FAQ page
    * Bug fixes
  * v1.8 (2011/5/8) Text to speech
    * Added text-to-speech for kanji (English) and dictionary entry translations (English/German/French/Spanish)
  * v1.73 (2011/4/30) Bug fixes
    * Tapping kanji widget when in error state will now trigger manual update
    * Added recent search suggestions to search widget
    * Improved camera handling for OCR, now supports Toshiba Regza
    * Imporved OCR error handling
    * History/favorites bug fixes
  * v1.72 (2011/4/9) Various improvements.
    * Link to the Kanji Recognizer app if online recognition is unavailable.
    * Made Japan the default mirror.
    * Improved widget error handling.
    * Bug fixes.
  * v1.71 (2011/3/5) Context menus
    * Added 'lookup kanji' menu to dictionary entries.
    * Added context menus to dictionary/kanji search results.
    * Display Shift-JIS code.
    * Layout adjustments.
  * v1.7 (2011/2/25) Multi-radical search
    * Added multi-radical kanji search.
    * Added 'Home' menu to detail screens.
    * Bug fixes.
  * v1.63 (2011/2/4) Animated strokes and global search
    * Restored Australia mirror.
    * Animated stroke drawing.
    * You can now search WWWJDIC directly from the Android search widget.
  * v1.62 (2011/2/1) Bug fixes
    * Temporarily replaced Australia mirror(currently offline) with Japan one.
    * Fixed mirror auto select.
    * Various bug fixes.
  * v1.61 (2010/12/22) Widget improvements
    * Added configuration for widget
      * Option to display only frequently used kanji
      * Option to display reading/meaning
      * Configurable update time
    * New widget layout/background.
    * Fast scroll in search results
    * Bug fixes.
  * v1.6 (2010/12/03) Favorites Anki export
    * Favorites Anki export.
    * Cross references in dictionary details.
    * Added multiple meanings separator character setting (for CSV export).
    * History/Favorites performance optimizations.
    * Added link to FAQ in About.
  * v1.55 (2010/11/27)  Kanji compound search
    * Added compound search to kanji details
    * Added update date to widget
    * Better widget update handling
    * Use new EU mirror URL
    * Various bug fixes
  * v1.52 (2010/11/21)
    * Updated to use new kanji recognizer URL
  * v1.51 (2010/11/18)
    * Bug fix: automatic encoding recognition with Excel 2007
  * v1.5 (2010/11/17)  Widget and favorites export
    * Kanji of the day widget
    * Favorites export to local CSV and Google Docs
    * Automatic mirror selection
    * Android 2.2 (Froyo) support
    * Install to SD card support
  * v1.41 (2010/11/03)  UI improvements
    * Added backup URL for kanji recognizer web service.
    * Added context menu (details/copy/append) to recognition candidates.
    * Added usage tips.
    * Changed shortcut name.
  * v1.4 (2010/09/03)  Japanese sentence translation support
    * Short Japanese sentence translation (word breakdown) support.
    * Added default dictionary setting.
    * Display kanji nanori readings.
    * Display kanji radical name readings.
    * Display multiple pinyin/Korean readings properly.
    * New (smaller) icon.
  * v1.31 (2010/08/15)  Bugfixes
    * Kanji Recognizer binding bugfixes
  * v1.3 (2010/08/15)  Kanji Recognizer integration
    * Offline kanji recognition via the Kanji Recognizer app
    * Links to history/favorites in each tab
    * Added 'delete stroke' button to kanji draw view
  * v1.21 (2010/07/29)  Bug fixes
    * fixed crash on CyanogenMod 5 DS ([Issue 12](https://code.google.com/p/wwwjdic/issues/detail?id=12))
    * better OCR paremeters (auto instead of line)
    * Replaced about dialog with activity (for better scrolling)
    * set size limits to number input fields
  * v1.2 (2010/07/23)  History import/export, handwritten recognition improvments
    * Direct search option for OCR ([Issue 15](https://code.google.com/p/wwwjdic/issues/detail?id=15))
    * History/favorites filtering
    * History/favorites CSV import/export
    * Smoother kanji drawing (Bezier curve based, like stroke order diagrams)
    * OCR-based handwritten kanji recognition (does not depend on stroke order)
    * Fixed OCR crash ([Issue 16](https://code.google.com/p/wwwjdic/issues/detail?id=16))
    * Layout adjustments ([Issue 14](https://code.google.com/p/wwwjdic/issues/detail?id=14))
    * Collect anonymous usage data using Flurry Analytics
  * v1.1 (2010/07/04)  Japanese localization
    * layout adjustments
    * bugfixes
  * v1.0 (2010/07/02)  Example search
    * new example search tab
      * please use 'exact match' for short English words
    * 'Ex.' button in dictionary detail view to find examples for current word
      * disabled for single-word kanji (WWWJDIC gives spurious results)
    * example sentence breakdown
      * deinflects and breaks down into words
      * word translation
    * long press for context menu in example search results
      * break down
      * look up all kanji
      * copy English/Japanese
  * v0.91 (2010/06/25)  Better OCR preview size/picture size handling
    * fixes crash on MyTouch Slide and HTC Legend, ([Issue 8](https://code.google.com/p/wwwjdic/issues/detail?id=8))
    * OCR cropping no longer depends on the default Camera app, ([Issue 9](https://code.google.com/p/wwwjdic/issues/detail?id=9))
  * v0.9 (2010/06/18)  Stroke order diagrams and search history/favorites
    * Animated stroke order diagrams using [KanjiVG](http://kanjivg.tagaini.net) data
      * use 'Stroke order' button in kanji detail view
      * served off Google App Engine, so first access may be a little slow
      * adjust animation delay in settings
    * Search history and favorites ([Issue 7](https://code.google.com/p/wwwjdic/issues/detail?id=7))
      * press menu to access
      * use star icon in detail view to add to favorites
    * Dictionary/kanji headword copy
      * long press on headword in detail view to copy
  * v0.81 (2010/05/28)  Bugfix release. Improved handwritten kanji annotation.
    * tested on Froyo
    * fixes ([Issue 6](https://code.google.com/p/wwwjdic/issues/detail?id=6))
    * added options to control kanji annotation
    * ensure annotation numbers are inside drawing area
  * v0.8 (2010/05/18)  Hand written kanji recognition.
    * Hand written character recognition using the kanji recognizer at [kanji.sljfaq.org](http://kanji.sljfaq.org/kanji16/draw-canvas.html)
      * The kanji recognizer is still experimental and may change/break at any time. (I will likely release an updates version if it does, though).
      * If it gets too much traffic from this app, access may be throttled/blocked without notice. Please be gentle :)
      * The 'look ahead' checkbox enables searching for matching kanji with more strokes than drawn. If you don't get a result for simple kanji (radical level), try disabling it.
    * support flash for OCR
      * Touch the flash icon to enable
      * Works only on Android versions that let you control the flash (Eclair). Disabled for all others.
  * v0.7 (2010/05/10)  Added settings. Bug fixes.
    * Select WWWJDIC mirror. Use the one closest to your location for better response times.
    * Select WeOCR server. Use the backup server only if the main one is offline.
    * Specify HTTP timeout
    * Option to dump cropped image to sdcard
  * v0.6 (2010/05/02)  OCR support using [WeOCR](http://weocr.ocrgrid.org/). Tested on Nexus One.
    * ~~OCR depends (for now) on the default Camera/Gallery app. If you phone doesn't have it, OCR will not work.~~ : fixed in 0.91
    * Capture tested on HTC Magic and Nexus One. If it doesn't work on your device, report it (include logcat).
    * OCR is backed by [nhocr](http://code.google.com/p/nhocr/), so it's only as good as nhocr is. Check their site for current limitations. The good news is that it will get better as nhocr does :)
    * Try to take a close up (as much as your autofocus allows) for better results.
  * v0.5 (2010/03/29)  Minor update. Display radical in kanji detail. Proper scrolling for entries with many meanings.
  * v0.4 (2010/03/19)  Added radical table and (optional) stroke count to kanji lookup. Select 'Radical number' as search type to enable. The top number is the radical number, the bottom one -- stroke count (see screenshot).
  * v0.3 (2010/03/15)  Support all WWWJDIC languages (French, Russian, Swedish, Hungarian, Spanish, Dutch, Slovenian)
  * v0.2 (2010/03/13)  New icon
  * v0.1 (2010/03/12)  Initial release