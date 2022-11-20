// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import java.util.Iterator;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.util.SparseIntArray;
import android.app.Activity;

public class FrameMetricsAggregator
{
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    private static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private final b mInstance;
    
    public FrameMetricsAggregator() {
        this(1);
    }
    
    public FrameMetricsAggregator(final int n) {
        this.mInstance = (b)new a(n);
    }
    
    public void add(final Activity activity) {
        this.mInstance.a(activity);
    }
    
    public SparseIntArray[] getMetrics() {
        return this.mInstance.b();
    }
    
    public SparseIntArray[] remove(final Activity activity) {
        return this.mInstance.c(activity);
    }
    
    public SparseIntArray[] reset() {
        return this.mInstance.d();
    }
    
    public SparseIntArray[] stop() {
        return this.mInstance.e();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }
    
    public static final class a extends b
    {
        public static HandlerThread e;
        public static Handler f;
        public int a;
        public SparseIntArray[] b;
        public final ArrayList<WeakReference<Activity>> c;
        public FrameMetricsAggregator$a$a d;
        
        public a(final int a) {
            this.b = new SparseIntArray[9];
            this.c = new ArrayList<WeakReference<Activity>>();
            this.d = new Window$OnFrameMetricsAvailableListener(this) {
                public final a a;
                
                public final void onFrameMetricsAvailable(final Window window, final FrameMetrics frameMetrics, final int n) {
                    final a a = this.a;
                    if ((a.a & 0x1) != 0x0) {
                        FrameMetricsAggregator.a.f(a.b[0], frameMetrics.getMetric(8));
                    }
                    final a a2 = this.a;
                    if ((a2.a & 0x2) != 0x0) {
                        FrameMetricsAggregator.a.f(a2.b[1], frameMetrics.getMetric(1));
                    }
                    final a a3 = this.a;
                    if ((a3.a & 0x4) != 0x0) {
                        FrameMetricsAggregator.a.f(a3.b[2], frameMetrics.getMetric(3));
                    }
                    final a a4 = this.a;
                    if ((a4.a & 0x8) != 0x0) {
                        FrameMetricsAggregator.a.f(a4.b[3], frameMetrics.getMetric(4));
                    }
                    final a a5 = this.a;
                    if ((a5.a & 0x10) != 0x0) {
                        FrameMetricsAggregator.a.f(a5.b[4], frameMetrics.getMetric(5));
                    }
                    final a a6 = this.a;
                    if ((a6.a & 0x40) != 0x0) {
                        FrameMetricsAggregator.a.f(a6.b[6], frameMetrics.getMetric(7));
                    }
                    final a a7 = this.a;
                    if ((a7.a & 0x20) != 0x0) {
                        FrameMetricsAggregator.a.f(a7.b[5], frameMetrics.getMetric(6));
                    }
                    final a a8 = this.a;
                    if ((a8.a & 0x80) != 0x0) {
                        FrameMetricsAggregator.a.f(a8.b[7], frameMetrics.getMetric(0));
                    }
                    final a a9 = this.a;
                    if ((a9.a & 0x100) != 0x0) {
                        FrameMetricsAggregator.a.f(a9.b[8], frameMetrics.getMetric(2));
                    }
                }
            };
            this.a = a;
        }
        
        public static void f(final SparseIntArray sparseIntArray, final long n) {
            if (sparseIntArray != null) {
                final int n2 = (int)((500000L + n) / 1000000L);
                if (n >= 0L) {
                    sparseIntArray.put(n2, sparseIntArray.get(n2) + 1);
                }
            }
        }
        
        @Override
        public final void a(final Activity activity) {
            if (FrameMetricsAggregator.a.e == null) {
                ((Thread)(FrameMetricsAggregator.a.e = new HandlerThread("FrameMetricsAggregator"))).start();
                FrameMetricsAggregator.a.f = new Handler(FrameMetricsAggregator.a.e.getLooper());
            }
            for (int i = 0; i <= 8; ++i) {
                final SparseIntArray[] b = this.b;
                if (b[i] == null && (this.a & 1 << i) != 0x0) {
                    b[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener((Window$OnFrameMetricsAvailableListener)this.d, FrameMetricsAggregator.a.f);
            this.c.add(new WeakReference<Activity>(activity));
        }
        
        @Override
        public final SparseIntArray[] b() {
            return this.b;
        }
        
        @Override
        public final SparseIntArray[] c(final Activity activity) {
            for (final WeakReference weakReference : this.c) {
                if (weakReference.get() == activity) {
                    this.c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener((Window$OnFrameMetricsAvailableListener)this.d);
            return this.b;
        }
        
        @Override
        public final SparseIntArray[] d() {
            final SparseIntArray[] b = this.b;
            this.b = new SparseIntArray[9];
            return b;
        }
        
        @Override
        public final SparseIntArray[] e() {
            int size = this.c.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final WeakReference weakReference = this.c.get(n);
                final Activity activity = (Activity)weakReference.get();
                size = n;
                if (weakReference.get() == null) {
                    continue;
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((Window$OnFrameMetricsAvailableListener)this.d);
                this.c.remove(n);
                size = n;
            }
            return this.b;
        }
    }
    
    public static class b
    {
        public void a(final Activity activity) {
            throw null;
        }
        
        public SparseIntArray[] b() {
            throw null;
        }
        
        public SparseIntArray[] c(final Activity activity) {
            throw null;
        }
        
        public SparseIntArray[] d() {
            throw null;
        }
        
        public SparseIntArray[] e() {
            throw null;
        }
    }
}
