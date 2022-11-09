// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.CountDownLatch;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.SystemClock;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import android.os.Handler;

public abstract class 160<D> extends 0CQ<D>
{
    public volatile a LIZ;
    public volatile a LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public Handler LJ;
    public final Executor LJFF;
    
    static {
        Covode.recordClassIndex(1294);
    }
    
    public 160(final Context context) {
        this(context, 0CY.LIZJ);
    }
    
    public 160(final Context context, final Executor ljff) {
        super(context);
        this.LIZLLL = -10000L;
        this.LJFF = ljff;
    }
    
    @Override
    public final void LIZ() {
        super.LIZ();
        this.LJIIJ();
        this.LIZ = new a();
        this.LIZJ();
    }
    
    public final void LIZ(final a a, final D n) {
        this.LIZ(n);
        if (this.LIZIZ == a) {
            if (super.LJIJJ) {
                this.LJIILJJIL();
            }
            this.LIZLLL = SystemClock.uptimeMillis();
            this.LIZIZ = null;
            this.LIZJ();
        }
    }
    
    public void LIZ(final D n) {
    }
    
    @Override
    public void LIZ(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.LIZ(s, fileDescriptor, printWriter, array);
        if (this.LIZ != null) {
            printWriter.print(s);
            printWriter.print("mTask=");
            printWriter.print(this.LIZ);
            printWriter.print(" waiting=");
            printWriter.println(this.LIZ.LIZ);
        }
        if (this.LIZIZ != null) {
            printWriter.print(s);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.LIZIZ);
            printWriter.print(" waiting=");
            printWriter.println(this.LIZIZ.LIZ);
        }
        if (this.LIZJ != 0L) {
            printWriter.print(s);
            printWriter.print("mUpdateThrottle=");
            07V.LIZ(this.LIZJ, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            final long lizlll = this.LIZLLL;
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (lizlll == 0L) {
                printWriter.print("--");
            }
            else {
                07V.LIZ(lizlll - uptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }
    
    @Override
    public final boolean LIZIZ() {
        if (this.LIZ == null) {
            return false;
        }
        if (!super.LJIILLIIL) {
            super.LJIJI = true;
        }
        if (this.LIZIZ != null) {
            if (this.LIZ.LIZ) {
                this.LIZ.LIZ = false;
                this.LJ.removeCallbacks((Runnable)this.LIZ);
            }
            this.LIZ = null;
            return false;
        }
        if (this.LIZ.LIZ) {
            this.LIZ.LIZ = false;
            this.LJ.removeCallbacks((Runnable)this.LIZ);
            this.LIZ = null;
            return false;
        }
        final a liz = this.LIZ;
        liz.LJFF.set(true);
        final boolean cancel = liz.LIZLLL.cancel(false);
        if (cancel) {
            this.LIZIZ = this.LIZ;
            this.LJ();
        }
        this.LIZ = null;
        return cancel;
    }
    
    public final void LIZJ() {
        if (this.LIZIZ == null && this.LIZ != null) {
            if (this.LIZ.LIZ) {
                this.LIZ.LIZ = false;
                this.LJ.removeCallbacks((Runnable)this.LIZ);
            }
            if (this.LIZJ > 0L && SystemClock.uptimeMillis() < this.LIZLLL + this.LIZJ) {
                this.LIZ.LIZ = true;
                this.LJ.postAtTime((Runnable)this.LIZ, this.LIZLLL + this.LIZJ);
                return;
            }
            this.LIZ.LIZ(this.LJFF);
        }
    }
    
    public abstract D LIZLLL();
    
    public void LJ() {
    }
    
    public final class a extends 0CY<Void, Void, D> implements Runnable
    {
        public boolean LIZ;
        public final CountDownLatch LJII;
        
        static {
            Covode.recordClassIndex(1295);
        }
        
        public a() {
            this.LJII = new CountDownLatch(1);
        }
        
        private D LIZIZ() {
            try {
                return 160.this.LIZLLL();
            }
            catch (final 06a 06a) {
                if (super.LJFF.get()) {
                    return null;
                }
                throw 06a;
            }
        }
        
        @Override
        public final void LIZ(final D n) {
            try {
                final 160 liziz = 160.this;
                if (liziz.LIZ != this) {
                    liziz.LIZ(this, n);
                }
                else if (liziz.LJIIZILJ) {
                    liziz.LIZ(n);
                }
                else {
                    liziz.LJIJJ = false;
                    liziz.LIZLLL = SystemClock.uptimeMillis();
                    liziz.LIZ = null;
                    liziz.LIZIZ(n);
                }
            }
            finally {
                this.LJII.countDown();
            }
        }
        
        @Override
        public final void LIZIZ(final D n) {
            try {
                160.this.LIZ(this, n);
            }
            finally {
                this.LJII.countDown();
            }
        }
        
        @Override
        public final void run() {
            this.LIZ = false;
            160.this.LIZJ();
        }
    }
}
