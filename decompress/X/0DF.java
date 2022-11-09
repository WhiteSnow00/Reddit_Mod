// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.n.z;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Path$Direction;
import kotlin.jvm.internal.n;
import android.graphics.Bitmap$Config;
import android.content.res.Configuration;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint;
import android.widget.LinearLayout;

public final class 0df extends LinearLayout
{
    public static int LIZJ;
    public static int LIZLLL;
    public static float LJ;
    public static float LJFF;
    public static float LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public float LIZ;
    public int LIZIZ;
    public float LJIIIZ;
    public final Paint LJIIJ;
    public final Path LJIIJJI;
    public final Path LJIIL;
    public RectF LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public final Path LJIILLIIL;
    public final RectF LJIIZILJ;
    public int LJIJ;
    public Matrix LJIJI;
    public Bitmap LJIJJ;
    public Canvas LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    
    static {
        Covode.recordClassIndex(5877);
    }
    
    public 0df(final Context context) {
        CTM.LIZ((Object)context);
        this(context, (byte)0);
    }
    
    public 0df(final Context context, final byte b) {
        CTM.LIZ((Object)context);
        this(context, '\0');
    }
    
    public 0df(final Context context, final char c) {
        CTM.LIZ((Object)context);
        super(context, (AttributeSet)null, 0);
        MethodCollector.i(12556);
        this.LJIIIZ = 12.0f;
        final Path ljiilliil = new Path();
        this.LJIILLIIL = ljiilliil;
        this.LJIIZILJ = new RectF();
        this.LJJI = -16777216;
        this.LIZ = 0.75f;
        this.LIZIZ = 1;
        this.LJJII = true;
        this.LJJIIJ = true;
        this.LJJIIJZLJL = true;
        this.LJJIIZ = true;
        this.LJIJ = (int)I4y.LIZIZ(context, 0.7f);
        0df.LIZJ = (int)I4y.LIZIZ(context, 7.0f);
        0df.LJ = 2.0f;
        0df.LJFF = I4y.LIZIZ(context, 8.0f);
        0df.LJI = I4y.LIZIZ(context, 3.0f);
        0df.LJII = (int)I4y.LIZIZ(context, 40.0f);
        0df.LJIIIIZZ = (int)I4y.LIZIZ(context, 56.0f);
        final Paint ljiij = new Paint();
        this.LJIIJ = ljiij;
        this.LJIIJJI = new Path();
        final Path ljiil = new Path();
        this.LJIIL = ljiil;
        ljiij.setStyle(Paint$Style.FILL);
        ljiij.setStrokeCap(Paint$Cap.BUTT);
        ljiij.setAntiAlias(true);
        ljiij.setStrokeWidth(0df.LJ);
        ljiij.setStrokeJoin(Paint$Join.MITER);
        this.LJIL = this.getResources().getColor(2131100924);
        this.LJJ = this.getResources().getColor(2131100891);
        ljiij.setColor(this.LJIL);
        this.setLayerType(1, ljiij);
        if (this.LJJIFFI) {
            ljiij.setShadowLayer(2.0f, 2.0f, 5.0f, this.LJJI);
        }
        ljiil.moveTo(0.0f, 0.0f);
        final int lizj = 0df.LIZJ;
        ljiil.lineTo((float)lizj, (float)(-lizj));
        final int lizj2 = 0df.LIZJ;
        ljiil.lineTo((float)lizj2, (float)lizj2);
        ljiil.close();
        ljiilliil.moveTo(0.0f, 0.0f);
        ljiilliil.lineTo((float)(0df.LIZJ + this.LJIJ * Math.sqrt(2.0)), (float)(-0df.LIZJ - this.LJIJ * Math.sqrt(2.0)));
        ljiilliil.lineTo((float)(0df.LIZJ + this.LJIJ * Math.sqrt(2.0)), (float)(0df.LIZJ + this.LJIJ * Math.sqrt(2.0)));
        ljiilliil.close();
        this.setBackgroundColor(0);
        this.setClipChildren(false);
        MethodCollector.o(12556);
    }
    
    public final float getBubbleOffset() {
        final float max = Math.max(this.LIZ, 0df.LJI);
        final int liziz = this.LIZIZ;
        float n;
        if (liziz != 0) {
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        n = 0.0f;
                    }
                    else {
                        n = Math.min(max, this.LJIILJJIL - 0df.LJI);
                    }
                }
                else {
                    n = Math.min(max, this.LJIILL - 0df.LJI);
                }
            }
            else {
                n = Math.min(max, this.LJIILL - 0df.LJI);
            }
        }
        else {
            n = Math.min(max, this.LJIILJJIL - 0df.LJI);
        }
        return n;
    }
    
    public final int getMBgColor() {
        return this.LJIL;
    }
    
    public final int getMBorderColor() {
        return this.LJJ;
    }
    
    public final RectF getMBorderRoundRect() {
        return this.LJIIZILJ;
    }
    
    public final int getMBorderWidth() {
        return this.LJIJ;
    }
    
    public final Path getMBubbleArrowPath() {
        return this.LJIIL;
    }
    
    public final Paint getMFillPaint() {
        return this.LJIIJ;
    }
    
    public final float getMHeight() {
        return this.LJIILL;
    }
    
    public final boolean getMNeedAddColor() {
        return this.LJJIIJZLJL;
    }
    
    public final boolean getMNeedArrow() {
        return this.LJJIIJ;
    }
    
    public final boolean getMNeedPath() {
        return this.LJJII;
    }
    
    public final boolean getMNeedPressFade() {
        return this.LJJIII;
    }
    
    public final boolean getMNeedShadow() {
        return this.LJJIFFI;
    }
    
    public final float getMPadding() {
        return this.LJIIIZ;
    }
    
    public final Path getMPath() {
        return this.LJIIJJI;
    }
    
    public final int getMShadowColor() {
        return this.LJJI;
    }
    
    public final float getMWidth() {
        return this.LJIILJJIL;
    }
    
    public final int getPADDING() {
        return 0df.LIZJ / 2;
    }
    
    public final boolean getUseDefaultView() {
        return this.LJJIIZ;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        CTM.LIZ((Object)configuration);
        super.onConfigurationChanged(configuration);
    }
    
    public final void onDraw(final Canvas canvas) {
        MethodCollector.i(11282);
        CTM.LIZ((Object)canvas);
        if (this.LJIJJ == null) {
            this.LJIJJ = Bitmap.createBitmap(this.getMeasuredWidth(), this.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
            final Bitmap ljijj = this.LJIJJ;
            if (ljijj == null) {
                n.LIZIZ();
            }
            this.LJIJJLI = new Canvas(ljijj);
        }
        final float ljiiljjil = this.LJIILJJIL;
        final float ljiill = this.LJIILL;
        final float max = Math.max(this.LIZ, 0df.LJI);
        final Matrix matrix = new Matrix();
        this.LJIJI = new Matrix();
        final int liziz = this.LIZIZ;
        if (liziz != 0) {
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz == 3) {
                        final float min = Math.min(max, ljiiljjil - 0df.LJI);
                        matrix.postRotate(270.0f);
                        final Matrix ljiji = this.LJIJI;
                        if (ljiji != null) {
                            ljiji.postRotate(270.0f);
                        }
                        final Matrix ljiji2 = this.LJIJI;
                        if (ljiji2 != null) {
                            final int ljij = this.LJIJ;
                            ljiji2.postTranslate(ljij * 3 / 2 + min - 0df.LIZJ * 3 / 2, ljij * 2 + ljiill);
                        }
                        this.setPadding(0, 0, 0, 0df.LIZJ);
                        this.setGravity(17);
                        this.LJIILIIL = new RectF(0.0f, 0.0f, this.LJIILJJIL, this.LJIILL - 0df.LIZJ);
                        final int ljij2 = this.LJIJ;
                        matrix.postTranslate(min + ljij2 * 3 / 2 - 0df.LIZJ * 3 / 2, ljiill + ljij2 * 3 / 2);
                    }
                }
                else {
                    final float min2 = Math.min(max, ljiill - 0df.LJI);
                    matrix.postRotate(180.0f);
                    final Matrix ljiji3 = this.LJIJI;
                    if (ljiji3 != null) {
                        ljiji3.postRotate(180.0f);
                    }
                    final Matrix ljiji4 = this.LJIJI;
                    if (ljiji4 != null) {
                        final int ljij3 = this.LJIJ;
                        ljiji4.postTranslate(ljij3 * 2 + ljiiljjil, ljij3 * 2 + min2 - 0df.LIZJ * 3 / 2);
                    }
                    this.setPadding(0, 0, 0df.LIZJ, 0);
                    this.setGravity(17);
                    this.LJIILIIL = new RectF(0.0f, 0.0f, this.LJIILJJIL - 0df.LIZJ, this.LJIILL);
                    final int ljij4 = this.LJIJ;
                    matrix.postTranslate(ljiiljjil + ljij4 * 3 / 2, min2 + ljij4 * 2 - 0df.LIZJ * 3 / 2);
                }
            }
            else {
                final float min3 = Math.min(max, ljiill - 0df.LJI);
                this.setPadding(0df.LIZJ, 0, 0, 0);
                this.setGravity(17);
                final Matrix ljiji5 = this.LJIJI;
                if (ljiji5 != null) {
                    final int ljij5 = this.LJIJ;
                    ljiji5.postTranslate(ljij5 + 0.0f, ljij5 * 2 + min3 - 0df.LIZJ * 3 / 2);
                }
                this.LJIILIIL = new RectF((float)0df.LIZJ, 0.0f, this.LJIILJJIL, this.LJIILL);
                final int ljij6 = this.LJIJ;
                matrix.postTranslate(ljij6 * 3 / 2 + 0.0f, min3 + ljij6 * 2 - 0df.LIZJ * 3 / 2);
            }
        }
        else {
            final float min4 = Math.min(max, ljiiljjil - 0df.LJI);
            matrix.postRotate(90.0f);
            final Matrix ljiji6 = this.LJIJI;
            if (ljiji6 != null) {
                ljiji6.postRotate(90.0f);
            }
            final Matrix ljiji7 = this.LJIJI;
            if (ljiji7 != null) {
                final int ljij7 = this.LJIJ;
                ljiji7.postTranslate(ljij7 * 3 / 2 + min4 - 0df.LIZJ * 3 / 2, ljij7 + 0.0f);
            }
            this.setPadding(0, 0df.LIZJ, 0, 0);
            this.setGravity(17);
            this.LJIILIIL = new RectF(0.0f, (float)0df.LIZJ, this.LJIILJJIL, this.LJIILL);
            final int ljij8 = this.LJIJ;
            matrix.postTranslate(min4 + ljij8 * 3 / 2 - 0df.LIZJ * 3 / 2, ljij8 * 3 / 2 + 0.0f);
        }
        final RectF ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            n.LIZ("");
        }
        ljiiliil.left += this.LJIJ * 3 / 2;
        final RectF ljiiliil2 = this.LJIILIIL;
        if (ljiiliil2 == null) {
            n.LIZ("");
        }
        ljiiliil2.top += this.LJIJ * 3 / 2;
        final RectF ljiiliil3 = this.LJIILIIL;
        if (ljiiliil3 == null) {
            n.LIZ("");
        }
        ljiiliil3.right += this.LJIJ * 3 / 2;
        final RectF ljiiliil4 = this.LJIILIIL;
        if (ljiiliil4 == null) {
            n.LIZ("");
        }
        ljiiliil4.bottom += this.LJIJ * 3 / 2;
        final RectF ljiizilj = this.LJIIZILJ;
        final RectF ljiiliil5 = this.LJIILIIL;
        if (ljiiliil5 == null) {
            n.LIZ("");
        }
        ljiizilj.left = ljiiliil5.left - this.LJIJ / 2;
        final RectF ljiizilj2 = this.LJIIZILJ;
        final RectF ljiiliil6 = this.LJIILIIL;
        if (ljiiliil6 == null) {
            n.LIZ("");
        }
        ljiizilj2.top = ljiiliil6.top - this.LJIJ / 2;
        final RectF ljiizilj3 = this.LJIIZILJ;
        final RectF ljiiliil7 = this.LJIILIIL;
        if (ljiiliil7 == null) {
            n.LIZ("");
        }
        ljiizilj3.right = ljiiliil7.right + this.LJIJ / 2;
        final RectF ljiizilj4 = this.LJIIZILJ;
        final RectF ljiiliil8 = this.LJIILIIL;
        if (ljiiliil8 == null) {
            n.LIZ("");
        }
        ljiizilj4.bottom = ljiiliil8.bottom + this.LJIJ / 2;
        if (this.LJJIFFI) {
            this.LJIIJ.setShadowLayer(2.0f, 2.0f, 5.0f, this.LJJI);
        }
        if (this.LJJII) {
            this.LJIIJ.setColor(this.LJJ);
            this.LJIIJ.setStyle(Paint$Style.STROKE);
            this.LJIIJ.setStrokeWidth((float)this.LJIJ);
            this.LJIIJJI.reset();
            final Path ljiijji = this.LJIIJJI;
            final RectF ljiizilj5 = this.LJIIZILJ;
            final float ljff = 0df.LJFF;
            final int ljij9 = this.LJIJ;
            ljiijji.addRoundRect(ljiizilj5, ljij9 / 2 + ljff, ljff + ljij9 / 2, Path$Direction.CW);
            if (this.LJJIIJ) {
                final Matrix ljiji8 = this.LJIJI;
                if (ljiji8 != null) {
                    this.LJIIJJI.addPath(this.LJIILLIIL, ljiji8);
                }
            }
            final Canvas ljijjli = this.LJIJJLI;
            if (ljijjli == null) {
                n.LIZ("");
            }
            ljijjli.drawPath(this.LJIIJJI, this.LJIIJ);
            if (this.LJJIIJZLJL) {
                this.LJIIJ.setColor(this.getResources().getColor(2131100926));
                this.LJIIJ.setStyle(Paint$Style.STROKE);
                this.LJIIJJI.reset();
                if (this.LJJIIJ) {
                    final Matrix ljiji9 = this.LJIJI;
                    if (ljiji9 != null) {
                        this.LJIIJJI.addPath(this.LJIILLIIL, ljiji9);
                    }
                }
                final Path ljiijji2 = this.LJIIJJI;
                final RectF ljiizilj6 = this.LJIIZILJ;
                final float ljff2 = 0df.LJFF;
                final int ljij10 = this.LJIJ;
                ljiijji2.addRoundRect(ljiizilj6, ljij10 / 2 + ljff2, ljff2 + ljij10 / 2, Path$Direction.CW);
                final Canvas ljijjli2 = this.LJIJJLI;
                if (ljijjli2 == null) {
                    n.LIZ("");
                }
                ljijjli2.drawPath(this.LJIIJJI, this.LJIIJ);
            }
        }
        this.LJIIJ.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        this.LJIIJ.setColor(this.LJIL);
        this.LJIIJ.setStyle(Paint$Style.FILL);
        this.LJIIJJI.reset();
        final Path ljiijji3 = this.LJIIJJI;
        final RectF ljiiliil9 = this.LJIILIIL;
        if (ljiiliil9 == null) {
            n.LIZ("");
        }
        final float ljff3 = 0df.LJFF;
        ljiijji3.addRoundRect(ljiiliil9, ljff3, ljff3, Path$Direction.CW);
        if (this.LJJIIJ) {
            this.LJIIJJI.addPath(this.LJIIL, matrix);
        }
        final Canvas ljijjli3 = this.LJIJJLI;
        if (ljijjli3 == null) {
            n.LIZ("");
        }
        ljijjli3.drawPath(this.LJIIJJI, this.LJIIJ);
        this.LJIIJ.setXfermode((Xfermode)null);
        final Bitmap ljijj2 = this.LJIJJ;
        if (ljijj2 == null) {
            n.LIZIZ();
        }
        canvas.drawBitmap(ljijj2, 0df.LIZJ - I4y.LIZIZ(this.getContext(), 1.4f), 0df.LIZJ - I4y.LIZIZ(this.getContext(), 1.3f), (Paint)null);
        MethodCollector.o(11282);
    }
    
    public final void onMeasure(int n, int ljiiiizz) {
        MethodCollector.i(9908);
        super.onMeasure(n, ljiiiizz);
        0df.LIZLLL = (int)I4y.LIZIZ(this.getContext(), this.LJIIIZ + 5.0f);
        TextView textView;
        if (this.getChildAt(0) instanceof TextView) {
            final View child = this.getChildAt(0);
            if (child == null) {
                final NullPointerException ex = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(9908);
                throw ex;
            }
            textView = (TextView)child;
        }
        else {
            textView = null;
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(ljiiiizz);
        final int size2 = View$MeasureSpec.getSize(ljiiiizz);
        int measuredWidth;
        if (textView != null) {
            if ((int)textView.getPaint().measureText(textView.getText().toString()) > I4y.LIZIZ(this.getContext(), 197.0f)) {
                ljiiiizz = (int)I4y.LIZIZ(this.getContext(), 197.0f);
                final String string = textView.getText().toString();
                n = ljiiiizz;
                if (z.LJ((CharSequence)string, (CharSequence)"\n")) {
                    final TextPaint paint = textView.getPaint();
                    n = z.LIZ((CharSequence)string, "\n", 0, false, 6);
                    if (string == null) {
                        final NullPointerException ex2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.o(9908);
                        throw ex2;
                    }
                    final String substring = string.substring(0, n);
                    n.LIZIZ((Object)substring, "");
                    final int n2 = (int)paint.measureText(substring);
                    if (n2 < (n = ljiiiizz)) {
                        n = n2;
                    }
                }
                final int n3 = 2;
                ljiiiizz = n;
                n = n3;
            }
            else {
                ljiiiizz = (int)textView.getPaint().measureText(textView.getText().toString());
                n = 1;
            }
            measuredWidth = ljiiiizz + textView.getPaddingLeft() + textView.getPaddingRight();
            ljiiiizz = n;
        }
        else {
            measuredWidth = this.getMeasuredWidth();
            ljiiiizz = 0;
        }
        if (this.LJJIIZ) {
            n = this.LIZIZ;
            if (n == 2 || n == 1) {
                if (measuredWidth > (n = 0df.LJII)) {
                    n = 0df.LIZLLL * 2 + measuredWidth;
                }
                n += 0df.LIZJ;
            }
            else if (measuredWidth > (n = 0df.LJII)) {
                n = 0df.LIZLLL * 2 + measuredWidth;
            }
            if (ljiiiizz == 1) {
                ljiiiizz = 0df.LJIIIIZZ;
            }
            else {
                ljiiiizz = 0df.LJIIIIZZ + 19;
            }
        }
        else {
            final PopupWindow popupWindow = new PopupWindow(this.getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            final View contentView = popupWindow.getContentView();
            n.LIZIZ((Object)contentView, "");
            n = contentView.getMeasuredWidth() + 0df.LIZJ * 3 + 0df.LIZLLL;
            final View contentView2 = popupWindow.getContentView();
            n.LIZIZ((Object)contentView2, "");
            ljiiiizz = contentView2.getMeasuredHeight() + 0df.LIZJ * 3 + 0df.LIZLLL;
        }
        final int ljij = this.LJIJ;
        n += ljij * 3;
        ljiiiizz += ljij * 3;
        while (true) {
            Label_0381: {
                if (mode == Integer.MIN_VALUE) {
                    if (mode2 != Integer.MIN_VALUE) {
                        break Label_0381;
                    }
                    this.setMeasuredDimension(n, ljiiiizz);
                }
                else {
                    if (mode == Integer.MIN_VALUE) {
                        break Label_0381;
                    }
                    if (mode2 == Integer.MIN_VALUE) {
                        this.setMeasuredDimension(size, ljiiiizz);
                    }
                }
                this.LJIILJJIL = (float)(this.getMeasuredWidth() - 0df.LIZJ * 2);
                this.LJIILL = (float)(this.getMeasuredHeight() - 0df.LIZJ * 2);
                MethodCollector.o(9908);
                return;
            }
            this.setMeasuredDimension(n, size2);
            continue;
        }
    }
    
    public final void setBubbleOrientation(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    public final void setMBgColor(final int ljil) {
        this.LJIL = ljil;
    }
    
    public final void setMBorderColor(final int ljj) {
        this.LJJ = ljj;
    }
    
    public final void setMBorderWidth(final int ljij) {
        this.LJIJ = ljij;
    }
    
    public final void setMHeight(final float ljiill) {
        this.LJIILL = ljiill;
    }
    
    public final void setMNeedAddColor(final boolean ljjiijzljl) {
        this.LJJIIJZLJL = ljjiijzljl;
    }
    
    public final void setMNeedArrow(final boolean ljjiij) {
        this.LJJIIJ = ljjiij;
    }
    
    public final void setMNeedPath(final boolean ljjii) {
        this.LJJII = ljjii;
    }
    
    public final void setMNeedPressFade(final boolean ljjiii) {
        this.LJJIII = ljjiii;
    }
    
    public final void setMNeedShadow(final boolean ljjiffi) {
        this.LJJIFFI = ljjiffi;
    }
    
    public final void setMPadding(final float ljiiiz) {
        this.LJIIIZ = ljiiiz;
    }
    
    public final void setMShadowColor(final int ljji) {
        this.LJJI = ljji;
    }
    
    public final void setMWidth(final float ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
    }
    
    public final void setNeedAddColor(final boolean ljjiijzljl) {
        this.LJJIIJZLJL = ljjiijzljl;
    }
    
    public final void setUseDefaultView(final boolean ljjiiz) {
        this.LJJIIZ = ljjiiz;
    }
}
