package com.davidebove.android.accessibilitylogger;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * @author Davide Bove <davide.bove@fau.de>
 */

public class LoggerService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        String PREFIX = "[] ";
        if (event.getPackageName() != null)
            PREFIX = "[" + event.getPackageName() + "] ";

        Log.v("onAccessibilityEvent", PREFIX + AccessibilityEvent.eventTypeToString(event.getEventType()));

        if (!event.getText().isEmpty())
            Log.i("onAccessibilityEvent", PREFIX + "event.getText(): " + String.valueOf(event.getText()));
        if (event.getContentDescription() != null)
            Log.i("onAccessibilityEvent", PREFIX + "event.getContentDescription(): " + event.getContentDescription());
        if (event.getSource() != null && event.getSource().getText() != null) {
            Log.i("onAccessibilityEvent", PREFIX + "event.getSource().getText(): " + event.getSource().getText());
        }
    }

    @Override
    public void onInterrupt() {}
}
