// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import n1.c;
import android.os.Build$VERSION;
import yd.a;
import ah2.f;
import android.view.MotionEvent;
import java.util.ArrayList;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;

public final class g
{
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public int e;
    public int f;
    
    public g() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }
    
    public final q a(final MotionEvent motionEvent, final w w) {
        ah2.f.f((Object)motionEvent, "motionEvent");
        ah2.f.f((Object)w, "positionCalculator");
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            final int toolType = motionEvent.getToolType(0);
            final int source = motionEvent.getSource();
            if (toolType != this.e || source != this.f) {
                this.e = toolType;
                this.f = source;
                this.c.clear();
                this.b.clear();
            }
        }
        final int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 0 && actionMasked2 != 5) {
            if (actionMasked2 == 9) {
                final int pointerId = motionEvent.getPointerId(0);
                if (this.b.indexOfKey(pointerId) < 0) {
                    this.b.put(pointerId, this.a++);
                }
            }
        }
        else {
            final int actionIndex = motionEvent.getActionIndex();
            final int pointerId2 = motionEvent.getPointerId(actionIndex);
            if (this.b.indexOfKey(pointerId2) < 0) {
                final SparseLongArray b = this.b;
                final long a = this.a;
                this.a = 1L + a;
                b.put(pointerId2, a);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.c.put(pointerId2, true);
                }
            }
        }
        final boolean b2 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        final boolean b3 = actionMasked == 8;
        if (b2) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex2;
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex2 = -1;
            }
            else {
                actionIndex2 = motionEvent.getActionIndex();
            }
        }
        else {
            actionIndex2 = 0;
        }
        this.d.clear();
        final int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        final boolean b4 = b2;
        while (i < pointerCount) {
            final ArrayList d = this.d;
            final boolean b5 = !b4 && i != actionIndex2 && (!b3 || motionEvent.getButtonState() != 0);
            final int pointerId3 = motionEvent.getPointerId(i);
            final int indexOfKey = this.b.indexOfKey(pointerId3);
            long value;
            if (indexOfKey >= 0) {
                value = this.b.valueAt(indexOfKey);
            }
            else {
                value = this.a++;
                this.b.put(pointerId3, value);
            }
            long y0 = yd.a.y0(motionEvent.getX(i), motionEvent.getY(i));
            long x = 0L;
            Label_0588: {
                long n;
                long n2;
                if (i == 0) {
                    n = yd.a.y0(motionEvent.getRawX(), motionEvent.getRawY());
                    n2 = w.i(n);
                }
                else {
                    if (Build$VERSION.SDK_INT < 29) {
                        x = w.x(y0);
                        break Label_0588;
                    }
                    n = h.a.a(motionEvent, i);
                    n2 = w.i(n);
                }
                final long n3 = n;
                y0 = n2;
                x = n3;
            }
            final int toolType2 = motionEvent.getToolType(i);
            int n4 = 0;
            Label_0655: {
                if (toolType2 != 0) {
                    if (toolType2 == 1) {
                        n4 = 1;
                        break Label_0655;
                    }
                    if (toolType2 == 2) {
                        n4 = 3;
                        break Label_0655;
                    }
                    if (toolType2 == 3) {
                        n4 = 2;
                        break Label_0655;
                    }
                    if (toolType2 == 4) {
                        n4 = 4;
                        break Label_0655;
                    }
                }
                n4 = 0;
            }
            final ArrayList<e> list = new ArrayList<e>();
            for (int historySize = motionEvent.getHistorySize(), j = 0; j < historySize; ++j) {
                final float historicalX = motionEvent.getHistoricalX(i, j);
                final float historicalY = motionEvent.getHistoricalY(i, j);
                if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && (!Float.isInfinite(historicalY) && !Float.isNaN(historicalY))) {
                    list.add(new e(motionEvent.getHistoricalEventTime(j), yd.a.y0(historicalX, historicalY)));
                }
            }
            long n5;
            if (motionEvent.getActionMasked() == 8) {
                n5 = yd.a.y0(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
            }
            else {
                n5 = n1.c.b;
            }
            d.add(new r(value, motionEvent.getEventTime(), x, y0, b5, n4, this.c.get(motionEvent.getPointerId(i), false), list, n5));
            ++i;
        }
        final int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            final int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId4, false)) {
                this.b.delete(pointerId4);
                this.c.delete(pointerId4);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            int n6 = this.b.size() - 1;
        Label_0970:
            while (-1 < n6) {
                final int key = this.b.keyAt(n6);
                while (true) {
                    for (int pointerCount2 = motionEvent.getPointerCount(), k = 0; k < pointerCount2; ++k) {
                        if (motionEvent.getPointerId(k) == key) {
                            final boolean b6 = true;
                            if (!b6) {
                                this.b.removeAt(n6);
                                this.c.delete(key);
                            }
                            --n6;
                            continue Label_0970;
                        }
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        motionEvent.getEventTime();
        return new q(this.d, motionEvent);
    }
}
