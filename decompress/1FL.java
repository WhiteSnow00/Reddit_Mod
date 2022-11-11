// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.IntentSender;
import android.os.Trace;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import java.util.Iterator;
import androidx.lifecycle.af;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import androidx.activity.ImmLeaksCleaner;
import android.os.Build$VERSION;
import androidx.activity.ComponentActivity;
import com.bytedance.covode.number.Covode;
import androidx.activity.OnBackPressedDispatcher;
import java.util.concurrent.atomic.AtomicInteger;

public class 1fL extends 146 implements 12K, 01q, 0Bx, 0C7, 17e
{
    public final 01p mActivityResultRegistry;
    public int mContentLayoutId;
    public final 01d mContextAwareHelper;
    public 0Bu.b mDefaultFactory;
    public final 15u mLifecycleRegistry;
    public final AtomicInteger mNextLocalRequestCode;
    public final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final 0GP mSavedStateRegistryController;
    public 0Bw mViewModelStore;
    
    static {
        Covode.recordClassIndex(211);
    }
    
    public 1fL() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/146.<init>:()V
        //     4: aload_0        
        //     5: new             LX/01d;
        //     8: dup            
        //     9: invokespecial   X/01d.<init>:()V
        //    12: putfield        X/1fL.mContextAwareHelper:LX/01d;
        //    15: aload_0        
        //    16: new             LX/15u;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   X/15u.<init>:(LX/0CH;)V
        //    24: putfield        X/1fL.mLifecycleRegistry:LX/15u;
        //    27: aload_0        
        //    28: aload_0        
        //    29: invokestatic    X/0GP.LIZ:(LX/17e;)LX/0GP;
        //    32: putfield        X/1fL.mSavedStateRegistryController:LX/0GP;
        //    35: aload_0        
        //    36: new             Landroidx/activity/OnBackPressedDispatcher;
        //    39: dup            
        //    40: new             LX/01g;
        //    43: dup            
        //    44: aload_0        
        //    45: invokespecial   X/01g.<init>:(LX/1fL;)V
        //    48: invokespecial   androidx/activity/OnBackPressedDispatcher.<init>:(Ljava/lang/Runnable;)V
        //    51: putfield        X/1fL.mOnBackPressedDispatcher:Landroidx/activity/OnBackPressedDispatcher;
        //    54: aload_0        
        //    55: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //    58: dup            
        //    59: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:()V
        //    62: putfield        X/1fL.mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;
        //    65: aload_0        
        //    66: new             LX/12H;
        //    69: dup            
        //    70: aload_0        
        //    71: invokespecial   X/12H.<init>:(LX/1fL;)V
        //    74: putfield        X/1fL.mActivityResultRegistry:LX/01p;
        //    77: aload_0        
        //    78: invokevirtual   X/146.getLifecycle:()LX/0CC;
        //    81: ifnull          182
        //    84: aload_0        
        //    85: invokevirtual   X/146.getLifecycle:()LX/0CC;
        //    88: new             Landroidx/activity/ComponentActivity$3;
        //    91: dup            
        //    92: aload_0        
        //    93: invokespecial   androidx/activity/ComponentActivity$3.<init>:(LX/1fL;)V
        //    96: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //    99: aload_0        
        //   100: invokevirtual   X/146.getLifecycle:()LX/0CC;
        //   103: new             Landroidx/activity/ComponentActivity$4;
        //   106: dup            
        //   107: aload_0        
        //   108: invokespecial   androidx/activity/ComponentActivity$4.<init>:(LX/1fL;)V
        //   111: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //   114: aload_0        
        //   115: invokevirtual   X/146.getLifecycle:()LX/0CC;
        //   118: new             Landroidx/activity/ComponentActivity$5;
        //   121: dup            
        //   122: aload_0        
        //   123: invokespecial   androidx/activity/ComponentActivity$5.<init>:(LX/1fL;)V
        //   126: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //   129: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   132: bipush          23
        //   134: if_icmpgt       152
        //   137: aload_0        
        //   138: invokevirtual   X/146.getLifecycle:()LX/0CC;
        //   141: new             Landroidx/activity/ImmLeaksCleaner;
        //   144: dup            
        //   145: aload_0        
        //   146: invokespecial   androidx/activity/ImmLeaksCleaner.<init>:(Landroid/app/Activity;)V
        //   149: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //   152: aload_0        
        //   153: invokevirtual   X/1fL.getSavedStateRegistry:()LX/0GO;
        //   156: ldc             "android:support:activity-result"
        //   158: new             LX/12I;
        //   161: dup            
        //   162: aload_0        
        //   163: invokespecial   X/12I.<init>:(LX/1fL;)V
        //   166: invokevirtual   X/0GO.LIZ:(Ljava/lang/String;LX/0GN;)V
        //   169: aload_0        
        //   170: new             LX/12J;
        //   173: dup            
        //   174: aload_0        
        //   175: invokespecial   X/12J.<init>:(LX/1fL;)V
        //   178: invokevirtual   X/1fL.addOnContextAvailableListener:(LX/01e;)V
        //   181: return         
        //   182: new             Ljava/lang/IllegalStateException;
        //   185: dup            
        //   186: ldc             "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
        //   188: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   191: athrow         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public 1fL(final int mContentLayoutId) {
        this();
        this.mContentLayoutId = mContentLayoutId;
    }
    
    public static Bundle INVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private void initViewTreeOwners() {
        this.getWindow().getDecorView().setTag(2131374252, (Object)this);
        this.getWindow().getDecorView().setTag(2131374254, (Object)this);
        this.getWindow().getDecorView().setTag(2131374253, (Object)this);
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    public final void addOnContextAvailableListener(final 01e 01e) {
        final 01d mContextAwareHelper = this.mContextAwareHelper;
        if (mContextAwareHelper.LIZIZ != null) {
            final Context liziz = mContextAwareHelper.LIZIZ;
            01e.LIZ();
        }
        mContextAwareHelper.LIZ.add(01e);
    }
    
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            final a a = (a)this.getLastNonConfigurationInstance();
            if (a != null) {
                this.mViewModelStore = a.LIZIZ;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new 0Bw();
            }
        }
    }
    
    @Override
    public final 01p getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }
    
    @Override
    public 0Bu.b getDefaultViewModelProviderFactory() {
        if (this.getApplication() != null) {
            if (this.mDefaultFactory == null) {
                final Application application = this.getApplication();
                Bundle invokevirtual_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
                if (this.getIntent() != null) {
                    invokevirtual_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.getIntent());
                }
                else {
                    invokevirtual_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = null;
                }
                this.mDefaultFactory = new 1g7(application, this, invokevirtual_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    public Object getLastCustomNonConfigurationInstance() {
        final a a = (a)this.getLastNonConfigurationInstance();
        if (a != null) {
            return a.LIZ;
        }
        return null;
    }
    
    @Override
    public 0CC getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }
    
    @Override
    public final 0GO getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZ;
    }
    
    @Override
    public 0Bw getViewModelStore() {
        if (this.getApplication() != null) {
            this.ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (!this.mActivityResultRegistry.LIZ(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.LIZ();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.mSavedStateRegistryController.LIZ(bundle);
        final 01d mContextAwareHelper = this.mContextAwareHelper;
        mContextAwareHelper.LIZIZ = (Context)this;
        final Iterator<01e> iterator = mContextAwareHelper.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
        super.onCreate(bundle);
        af.LIZ(this);
        final int mContentLayoutId = this.mContentLayoutId;
        if (mContentLayoutId != 0) {
            this.setContentView(mContentLayoutId);
        }
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (!this.mActivityResultRegistry.LIZ(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2)) && Build$VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    public final Object onRetainNonConfigurationInstance() {
        final Object onRetainCustomNonConfigurationInstance = this.onRetainCustomNonConfigurationInstance();
        0Bw mViewModelStore;
        final 0Bw 0Bw = mViewModelStore = this.mViewModelStore;
        Label_0052: {
            if (0Bw == null) {
                final a a = (a)this.getLastNonConfigurationInstance();
                mViewModelStore = 0Bw;
                if (a != null) {
                    final 0Bw liziz = a.LIZIZ;
                    if ((mViewModelStore = liziz) != null) {
                        break Label_0052;
                    }
                    mViewModelStore = liziz;
                }
                if (onRetainCustomNonConfigurationInstance == null) {
                    return null;
                }
            }
        }
        final a a2 = new a();
        a2.LIZ = onRetainCustomNonConfigurationInstance;
        a2.LIZIZ = mViewModelStore;
        return a2;
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        final 0CC lifecycle = this.getLifecycle();
        if (lifecycle instanceof 15u) {
            ((15u)lifecycle).LIZIZ(0CC.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZIZ(bundle);
    }
    
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.LIZIZ;
    }
    
    public final <I, O> 01m<I> registerForActivityResult(final 01k<I, O> 01k, final 01l<O> 01l) {
        return this.registerForActivityResult(01k, this.mActivityResultRegistry, 01l);
    }
    
    public final <I, O> 01m<I> registerForActivityResult(final 01k<I, O> 01k, final 01p 01p, final 01l<O> 01l) {
        final StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.mNextLocalRequestCode.getAndIncrement());
        final String string = sb.toString();
        final 0CC lifecycle = this.getLifecycle();
        if (!lifecycle.LIZ().isAtLeast(0CC.b.STARTED)) {
            final int liziz = 01p.LIZIZ(string);
            Object o;
            if ((o = 01p.LJ.get(string)) == null) {
                o = new 01p.b(lifecycle);
            }
            final 15t 15t = new 15t(01p, string, 01l, 01k) {
                static {
                    Covode.recordClassIndex(222);
                }
                
                @Override
                public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
                    if (0CC.a.ON_START.equals(a)) {
                        this.LIZLLL.LJI.put(this.LIZ, new 01p.a<Object>(this.LIZIZ, this.LIZJ));
                        if (this.LIZLLL.LJII.containsKey(this.LIZ)) {
                            final Object value = this.LIZLLL.LJII.get(this.LIZ);
                            this.LIZLLL.LJII.remove(this.LIZ);
                            this.LIZIZ.LIZ(value);
                        }
                        final ActivityResult activityResult = (ActivityResult)this.LIZLLL.LJIIIIZZ.getParcelable(this.LIZ);
                        if (activityResult != null) {
                            this.LIZLLL.LJIIIIZZ.remove(this.LIZ);
                            this.LIZIZ.LIZ(this.LIZJ.LIZ(activityResult.LIZ, activityResult.LIZIZ));
                        }
                        return;
                    }
                    if (0CC.a.ON_STOP.equals(a)) {
                        this.LIZLLL.LJI.remove(this.LIZ);
                        return;
                    }
                    if (0CC.a.ON_DESTROY.equals(a)) {
                        this.LIZLLL.LIZ(this.LIZ);
                    }
                }
            };
            ((01p.b)o).LIZ.LIZ(15t);
            ((01p.b)o).LIZIZ.add(15t);
            01p.LJ.put(string, (01p.b)o);
            return (01m<I>)new 12L(01p, string, liziz, 01k);
        }
        final StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
        sb2.append(this);
        sb2.append(" is attempting to register while current state is ");
        sb2.append(lifecycle.LIZ());
        sb2.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void removeOnContextAvailableListener(final 01e 01e) {
        this.mContextAwareHelper.LIZ.remove(01e);
    }
    
    public void reportFullyDrawn() {
        try {
            if (0DI.LIZ()) {
                final StringBuilder sb = new StringBuilder("reportFullyDrawn() for ");
                sb.append(this.getComponentName());
                Trace.beginSection(sb.toString());
            }
            super.reportFullyDrawn();
        }
        finally {
            Trace.endSection();
        }
    }
    
    public void setContentView(final int contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.setContentView(view, viewGroup$LayoutParams);
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        super.startActivityForResult(intent, n);
    }
    
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        super.startActivityForResult(intent, n, bundle);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static final class a
    {
        public Object LIZ;
        public 0Bw LIZIZ;
        
        static {
            Covode.recordClassIndex(217);
        }
    }
}
