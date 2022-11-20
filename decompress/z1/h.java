// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import n1.c;
import android.os.Build$VERSION;
import vl.a;
import ng2.e;
import android.view.MotionEvent;
import java.util.ArrayList;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;

public final class h
{
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public int e;
    public int f;
    
    public h() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = -1;
        this.f = -1;
    }
    
    public final r a(final MotionEvent motionEvent, final y y) {
        ng2.e.f((Object)motionEvent, "motionEvent");
        ng2.e.f((Object)y, "positionCalculator");
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
            final float pressure = motionEvent.getPressure(i);
            long t = vl.a.T(motionEvent.getX(i), motionEvent.getY(i));
            long y2 = 0L;
            Label_0607: {
                long n;
                long n2;
                if (i == 0) {
                    n = vl.a.T(motionEvent.getRawX(), motionEvent.getRawY());
                    n2 = y.j(n);
                }
                else {
                    if (Build$VERSION.SDK_INT < 29) {
                        y2 = y.y(t);
                        break Label_0607;
                    }
                    n = z1.i.a.a(motionEvent, i);
                    n2 = y.j(n);
                }
                final long n3 = n;
                t = n2;
                y2 = n3;
            }
            final int toolType2 = motionEvent.getToolType(i);
            int n4 = 0;
            Label_0674: {
                if (toolType2 != 0) {
                    if (toolType2 == 1) {
                        n4 = 1;
                        break Label_0674;
                    }
                    if (toolType2 == 2) {
                        n4 = 3;
                        break Label_0674;
                    }
                    if (toolType2 == 3) {
                        n4 = 2;
                        break Label_0674;
                    }
                    if (toolType2 == 4) {
                        n4 = 4;
                        break Label_0674;
                    }
                }
                n4 = 0;
            }
            final ArrayList<z1.e> list = new ArrayList<z1.e>();
            for (int historySize = motionEvent.getHistorySize(), j = 0; j < historySize; ++j) {
                final float historicalX = motionEvent.getHistoricalX(i, j);
                final float historicalY = motionEvent.getHistoricalY(i, j);
                if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && (!Float.isInfinite(historicalY) && !Float.isNaN(historicalY))) {
                    list.add(new z1.e(motionEvent.getHistoricalEventTime(j), vl.a.T(historicalX, historicalY)));
                }
            }
            long n5;
            if (motionEvent.getActionMasked() == 8) {
                n5 = vl.a.T(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9) + 0.0f);
            }
            else {
                n5 = n1.c.b;
            }
            d.add(new s(value, motionEvent.getEventTime(), y2, t, b5, pressure, n4, this.c.get(motionEvent.getPointerId(i), false), list, n5));
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
        Label_0992:
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
                            continue Label_0992;
                        }
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        motionEvent.getEventTime();
        return new r(this.d, motionEvent);
    }
}
