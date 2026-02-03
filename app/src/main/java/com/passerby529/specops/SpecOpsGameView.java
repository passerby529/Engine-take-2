package com.passerby529.specops;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SpecOpsGameView extends View {

    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public SpecOpsGameView(Context context) {
        super(context);
        paint.setTextSize(48f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.rgb(10, 12, 18));
        paint.setColor(Color.WHITE);
        canvas.drawText("SpecOps Engine - Boot OK", 60, 120, paint);
        canvas.drawText("Next: Title UI / Loadout / Mission Select", 60, 190, paint);
    }
}
