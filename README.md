# Accessibility Logger
Android logging utility to detect and capture any Accessibility events.

This application uses an Accessibility service to detect and capture any Accessibility events from other applications.
The information is logged to logcat with the tag **onAccessibilityEvent** and the log levels _verbose_ and _info_.

A launcher app is included that opens the Accessibility settings page.

## Sample output
```
03-06 13:57:11.239 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:11.240 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:11.248 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_STATE_CHANGED
03-06 13:57:11.338 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:12.640 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_STATE_CHANGED
03-06 13:57:12.640 I/onAccessibilityEvent: [com.davidebove.android.testactivity] event.getText(): [TestActivity]
03-06 13:57:12.839 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:13.013 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:13.114 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
03-06 13:57:15.693 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_VIEW_TEXT_SELECTION_CHANGED
03-06 13:57:15.694 I/onAccessibilityEvent: [com.davidebove.android.testactivity] event.getText(): [EditField1]
03-06 13:57:15.694 I/onAccessibilityEvent: [com.davidebove.android.testactivity] event.getSource().getText(): EditField1
03-06 13:57:15.721 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_VIEW_CLICKED
03-06 13:57:15.722 I/onAccessibilityEvent: [com.davidebove.android.testactivity] event.getText(): [EditField1]
03-06 13:57:15.722 I/onAccessibilityEvent: [com.davidebove.android.testactivity] event.getSource().getText(): EditField1
03-06 13:57:15.739 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_STATE_CHANGED
03-06 13:57:15.837 V/onAccessibilityEvent: [com.davidebove.android.testactivity] TYPE_WINDOW_CONTENT_CHANGED
```
