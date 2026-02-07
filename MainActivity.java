package com.specopsfps.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Entry point.
 *
 * If GL init fails on a device, we display an error view instead of silently crashing,
 * so the logcat contains a clear stacktrace and the user sees something on-screen.
 */
public final class MainActivity extends Activity {

    private static final String TAG = "SpecOpsMainActivity";

    private SpecOpsGLSurfaceView glView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            glView = new SpecOpsGLSurfaceView(this);
            setContentView(glView);
        } catch (Throwable t) {
            Log.e(TAG, "GL init failed - showing fallback screen", t);
            TextView tv = new TextView(this);
            tv.setText("SpecOpsFPS failed to start (OpenGL init error).\n\n" +
                    "Open logcat and search for: 'Failed to initialize GLSurfaceView'\n" +
                    "Then share the stacktrace.");
            tv.setPadding(32, 32, 32, 32);
            setContentView(tv);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (glView != null) glView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (glView != null) glView.onResume();
    }
}
