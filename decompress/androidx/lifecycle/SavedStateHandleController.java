// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Iterator;
import X.0Bw;
import X.0Bx;
import X.17e;
import X.0CG;
import X.0CH;
import X.0CC;
import X.0GO;
import X.0Bq;
import com.bytedance.covode.number.Covode;
import X.0Bl;
import X.15t;

public final class SavedStateHandleController implements 15t
{
    public boolean LIZ;
    public final 0Bl LIZIZ;
    public final String LIZJ;
    
    static {
        Covode.recordClassIndex(1210);
    }
    
    public SavedStateHandleController(final String lizj, final 0Bl liziz) {
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
    }
    
    public static void LIZ(final 0Bq 0Bq, final 0GO 0go, final 0CC 0cc) {
        final SavedStateHandleController savedStateHandleController = 0Bq.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.LIZ) {
            savedStateHandleController.LIZ(0go, 0cc);
            LIZIZ(0go, 0cc);
        }
    }
    
    public static void LIZIZ(final 0GO 0go, final 0CC 0cc) {
        final 0CC.b liz = 0cc.LIZ();
        if (liz == 0CC.b.INITIALIZED || liz.isAtLeast(0CC.b.STARTED)) {
            0go.LIZ((Class<? extends 0GO.a>)a.class);
            return;
        }
        0cc.LIZ(new 15t() {
            static {
                Covode.recordClassIndex(1211);
            }
            
            @Override
            public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
                if (a == 0CC.a.ON_START) {
                    0cc.LIZIZ(this);
                    0go.LIZ((Class<? extends 0GO.a>)a.class);
                }
            }
        });
    }
    
    public final void LIZ(final 0GO 0go, final 0CC 0cc) {
        if (!this.LIZ) {
            this.LIZ = true;
            0cc.LIZ(this);
            0go.LIZ(this.LIZJ, this.LIZIZ.LIZJ);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.LIZ = false;
            0ch.getLifecycle().LIZIZ(this);
        }
    }
    
    public static final class a implements 0GO.a
    {
        static {
            Covode.recordClassIndex(1212);
        }
        
        @Override
        public final void LIZ(final 17e 17e) {
            if (17e instanceof 0Bx) {
                final 0Bw viewModelStore = ((0Bx)17e).getViewModelStore();
                final 0GO savedStateRegistry = 17e.getSavedStateRegistry();
                final Iterator iterator = 0Bw.LIZ(viewModelStore).iterator();
                while (iterator.hasNext()) {
                    SavedStateHandleController.LIZ(0Bw.LIZ(viewModelStore, (String)iterator.next()), savedStateRegistry, 17e.getLifecycle());
                }
                if (!0Bw.LIZ(viewModelStore).isEmpty()) {
                    savedStateRegistry.LIZ((Class<? extends 0GO.a>)a.class);
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }
}
