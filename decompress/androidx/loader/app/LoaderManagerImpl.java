// 
// Decompiled by Procyon v0.6.0
// 

package androidx.loader.app;

import X.0Bf;
import X.15z;
import X.051;
import X.0Bq;
import X.07P;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Looper;
import java.lang.reflect.Modifier;
import X.0CQ;
import android.os.Bundle;
import X.0Bu;
import X.0Bw;
import com.bytedance.covode.number.Covode;
import X.0CH;
import X.0Ca;

public final class LoaderManagerImpl extends 0Ca
{
    public final 0CH LIZ;
    public final LoaderViewModel LIZIZ;
    
    static {
        Covode.recordClassIndex(1309);
    }
    
    public LoaderManagerImpl(final 0CH liz, final 0Bw 0Bw) {
        this.LIZ = liz;
        this.LIZIZ = new 0Bu(0Bw, LoaderViewModel.LIZ).LIZ(LoaderViewModel.class);
    }
    
    private <D> 0CQ<D> LIZIZ(final int n, final Bundle bundle, final 0Ca.a<D> a) {
        try {
            this.LIZIZ.LIZJ = true;
            final 0CQ<D> liz = a.LIZ(bundle);
            if (liz == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (!liz.getClass().isMemberClass() || Modifier.isStatic(liz.getClass().getModifiers())) {
                final a a2 = new a<D>(n, bundle, (0CQ<Object>)liz);
                this.LIZIZ.LIZIZ.LIZIZ(n, a2);
                this.LIZIZ.LIZJ = false;
                return a2.LIZ(this.LIZ, a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(liz)));
        }
        finally {
            this.LIZIZ.LIZJ = false;
        }
    }
    
    @Override
    public final <D> 0CQ<D> LIZ(final int n, final Bundle bundle, final 0Ca.a<D> a) {
        if (this.LIZIZ.LIZJ) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        final a liz = this.LIZIZ.LIZ(n);
        if (liz == null) {
            return (0CQ<D>)this.LIZIZ(n, bundle, (0Ca.a<Object>)a);
        }
        return ((a<D>)liz).LIZ(this.LIZ, a);
    }
    
    @Override
    public final void LIZ() {
        final LoaderViewModel liziz = this.LIZIZ;
        for (int liziz2 = liziz.LIZIZ.LIZIZ(), i = 0; i < liziz2; ++i) {
            ((a)liziz.LIZIZ.LIZLLL(i)).LIZ();
        }
    }
    
    @Override
    public final void LIZ(final int n) {
        if (this.LIZIZ.LIZJ) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            final a liz = this.LIZIZ.LIZ(n);
            if (liz != null) {
                ((a)liz).LIZIZ();
                this.LIZIZ.LIZIZ.LIZIZ(n);
            }
            return;
        }
        throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    
    @Override
    public final void LIZ(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final LoaderViewModel liziz = this.LIZIZ;
        if (liziz.LIZIZ.LIZIZ() > 0) {
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            final String string = sb.toString();
            for (int i = 0; i < liziz.LIZIZ.LIZIZ(); ++i) {
                final a a = liziz.LIZIZ.LIZLLL(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(liziz.LIZIZ.LIZJ(i));
                printWriter.print(": ");
                printWriter.println(((a)a).toString());
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(a.LIZ);
                printWriter.print(" mArgs=");
                printWriter.println(a.LIZIZ);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(a.LIZJ);
                final 0CQ<D> lizj = a.LIZJ;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("  ");
                lizj.LIZ(sb2.toString(), fileDescriptor, printWriter, array);
                if (a.LIZLLL != null) {
                    printWriter.print(string);
                    printWriter.print("mCallbacks=");
                    printWriter.println(a.LIZLLL);
                    final b lizlll = (b)a.LIZLLL;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("  ");
                    printWriter.print(sb3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(lizlll.LIZ);
                }
                printWriter.print(string);
                printWriter.print("mData=");
                final Object value = a.getValue();
                final StringBuilder sb4 = new StringBuilder(64);
                07P.LIZ(value, sb4);
                sb4.append("}");
                printWriter.println(sb4.toString());
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.println(a.hasActiveObservers());
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        07P.LIZ(this.LIZ, sb);
        sb.append("}}");
        return sb.toString();
    }
    
    public static class LoaderViewModel extends 0Bq
    {
        public static final 0Bu.b LIZ;
        public 051<a> LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(1310);
            LIZ = new 0Bu.b() {
                static {
                    Covode.recordClassIndex(1311);
                }
                
                @Override
                public final <T extends 0Bq> T LIZ(final Class<T> clazz) {
                    return (T)new LoaderViewModel();
                }
            };
        }
        
        public LoaderViewModel() {
            this.LIZIZ = new 051<a>();
            this.LIZJ = false;
        }
        
        public final <D> a<D> LIZ(final int n) {
            return this.LIZIZ.LIZ(n, null);
        }
        
        @Override
        public void onCleared() {
            super.onCleared();
            for (int liziz = this.LIZIZ.LIZIZ(), i = 0; i < liziz; ++i) {
                this.LIZIZ.LIZLLL(i).LIZIZ();
            }
            this.LIZIZ.LIZJ();
        }
    }
    
    public static final class a<D> extends 15z<D> implements 0CQ.b<D>
    {
        public final int LIZ;
        public final Bundle LIZIZ;
        public final 0CQ<D> LIZJ;
        public LoaderManagerImpl.b<D> LIZLLL;
        public 0CH LJ;
        public 0CQ<D> LJFF;
        
        static {
            Covode.recordClassIndex(1312);
        }
        
        public a(final int n, final Bundle liziz, final 0CQ<D> lizj) {
            this.LIZ = n;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LJFF = null;
            if (lizj.LJIILJJIL == null) {
                lizj.LJIILJJIL = (0CQ.b<D>)this;
                lizj.LJIILIIL = n;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }
        
        public final 0CQ<D> LIZ(final 0CH lj, final 0Ca.a<D> a) {
            final LoaderManagerImpl.b lizlll = new LoaderManagerImpl.b((0CQ<D>)this.LIZJ, (0Ca.a<D>)a);
            this.observe(lj, lizlll);
            final LoaderManagerImpl.b<D> lizlll2 = this.LIZLLL;
            if (lizlll2 != null) {
                this.removeObserver(lizlll2);
            }
            this.LJ = lj;
            this.LIZLLL = lizlll;
            return this.LIZJ;
        }
        
        public final void LIZ() {
            final 0CH lj = this.LJ;
            final LoaderManagerImpl.b<D> lizlll = this.LIZLLL;
            if (lj != null && lizlll != null) {
                super.removeObserver(lizlll);
                this.observe(lj, lizlll);
            }
        }
        
        @Override
        public final void LIZ(final D value) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.setValue(value);
                return;
            }
            this.postValue(value);
        }
        
        public final 0CQ<D> LIZIZ() {
            this.LIZJ.LJIIJ();
            this.LIZJ.LJIIZILJ = true;
            final LoaderManagerImpl.b<D> lizlll = this.LIZLLL;
            if (lizlll != null) {
                this.removeObserver(lizlll);
                lizlll.LIZ();
            }
            this.LIZJ.LIZ((0CQ.b<D>)this);
            this.LIZJ.LJIILIIL();
            return this.LJFF;
        }
        
        @Override
        public final void onActive() {
            this.LIZJ.LJIIIZ();
        }
        
        @Override
        public final void onInactive() {
            this.LIZJ.LJIIL();
        }
        
        @Override
        public final void removeObserver(final 0Bf<? super D> 0Bf) {
            super.removeObserver(0Bf);
            this.LJ = null;
            this.LIZLLL = null;
        }
        
        @Override
        public final void setValue(final D value) {
            super.setValue(value);
            final 0CQ<D> ljff = this.LJFF;
            if (ljff != null) {
                ljff.LJIILIIL();
                this.LJFF = null;
            }
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.LIZ);
            sb.append(" : ");
            07P.LIZ(this.LIZJ, sb);
            sb.append("}}");
            return sb.toString();
        }
    }
}
