package com.specopsfps.app;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;

/**
 * GLSurfaceView wrapper.
 *
 * Stability first:
 * - Forces OpenGL ES 2.0 context.
 * - Chooses RGBA8888 + 16-bit depth.
 */
public final class SpecOpsGLSurfaceView extends GLSurfaceView {

    private static final String TAG = "SpecOpsGLSurfaceView";

    public SpecOpsGLSurfaceView(Context context) {
        super(context);

        try {
            // Force ES 2.0 for max compatibility.
            setEGLContextClientVersion(2);

            // RGBA8888 + depth16 (no stencil for now).
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);

            setRenderer(new SpecOpsRenderer());
            setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        } catch (Throwable t) {
            // If GL init fails, log it clearly.
            Log.e(TAG, "Failed to initialize GLSurfaceView", t);
            // Re-throw so the crash log is obvious.
            throw t;
        }
    }
}
