package com.specopsfps.app;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Ultra-stable minimal renderer.
 *
 * Uses OpenGL ES 2.0 only (GLES20) for maximum device compatibility.
 * We'll layer more rendering features later once the launcher is stable.
 */
public final class SpecOpsRenderer implements GLSurfaceView.Renderer {

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Clear to near-black.
        GLES20.glClearColor(0.02f, 0.02f, 0.02f, 1.0f);
        // Enable basic states we may rely on later.
        GLES20.glDisable(GLES20.GL_DITHER);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
}
