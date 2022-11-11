// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import java.util.Map;
import java.util.List;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Parcelable;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.View;
import android.app.SharedElementCallback;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import android.content.IntentSender;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import com.bytedance.covode.number.Covode;

public final class 144 extends 06x
{
    public static b LIZ;
    
    static {
        Covode.recordClassIndex(677);
    }
    
    public static void LIZ(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        Q0z.LIZ(intent, (Object)activity);
        LIZIZ(activity, intent, n, bundle);
    }
    
    public static void LIZ(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static void LIZ(final Activity activity, final String[] array, final int n) {
        public final class 05t implements Runnable
        {
            public final /* synthetic */ String[] LIZ;
            public final /* synthetic */ Activity LIZIZ;
            public final /* synthetic */ int LIZJ;
            
            static {
                Covode.recordClassIndex(678);
            }
            
            public 05t(final String[] liz, final Activity liziz, final int lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                final int[] array = new int[this.LIZ.length];
                final PackageManager packageManager = this.LIZIZ.getPackageManager();
                final String packageName = this.LIZIZ.getPackageName();
                for (int length = this.LIZ.length, i = 0; i < length; ++i) {
                    array[i] = packageManager.checkPermission(this.LIZ[i], packageName);
                }
                ((a)this.LIZIZ).onRequestPermissionsResult(this.LIZJ, this.LIZ, array);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_3        
        //     5: ifnull          18
        //     8: aload_3        
        //     9: invokeinterface X/05w.LIZ:()Z
        //    14: ifeq            18
        //    17: return         
        //    18: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    21: bipush          23
        //    23: if_icmplt       50
        //    26: aload_0        
        //    27: instanceof      LX/05x;
        //    30: ifeq            43
        //    33: aload_0        
        //    34: checkcast       LX/05x;
        //    37: iload_2        
        //    38: invokeinterface X/05x.validateRequestPermissionsRequestCode:(I)V
        //    43: aload_0        
        //    44: aload_1        
        //    45: iload_2        
        //    46: invokestatic    X/144.LIZIZ:(Landroid/app/Activity;[Ljava/lang/String;I)V
        //    49: return         
        //    50: aload_0        
        //    51: instanceof      LX/05v;
        //    54: ifeq            81
        //    57: new             Landroid/os/Handler;
        //    60: dup            
        //    61: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    64: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    67: new             LX/05t;
        //    70: dup            
        //    71: aload_1        
        //    72: aload_0        
        //    73: iload_2        
        //    74: invokespecial   X/05t.<init>:([Ljava/lang/String;Landroid/app/Activity;I)V
        //    77: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    80: pop            
        //    81: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public static boolean LIZ(final Activity activity, final String s) {
        return Build$VERSION.SDK_INT >= 23 && activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static void LIZIZ(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        0Qu.LIZ(intent, activity);
        activity.startActivityForResult(intent, n, bundle);
    }
    
    public static void LIZIZ(final Activity activity, final String[] array, final int n) {
        if (new 5aq().LIZ(102600, "android/app/Activity", "requestPermissions", (Object)activity, new Object[] { array, n }, "void", new 5dv(false)).LIZ) {
            return;
        }
        activity.requestPermissions(array, n);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(680);
        }
        
        void onRequestPermissionsResult(final int p0, final String[] p1, final int[] p2);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(681);
        }
        
        boolean LIZ();
        
        boolean LIZIZ();
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(682);
        }
        
        void validateRequestPermissionsRequestCode(final int p0);
    }
    
    public static final class d extends SharedElementCallback
    {
        public final 06Q LIZ;
        
        static {
            Covode.recordClassIndex(683);
        }
        
        public d(final 06Q liz) {
            this.LIZ = liz;
        }
        
        public final Parcelable onCaptureSharedElementSnapshot(final View view, final Matrix matrix, final RectF rectF) {
            final 06Q liz = this.LIZ;
            if (view instanceof ImageView) {
                final ImageView imageView = (ImageView)view;
                final Drawable drawable = imageView.getDrawable();
                final Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    final int intrinsicWidth = drawable.getIntrinsicWidth();
                    final int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        final float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        Bitmap bitmap;
                        if (drawable instanceof BitmapDrawable && min == 1.0f) {
                            bitmap = ((BitmapDrawable)drawable).getBitmap();
                        }
                        else {
                            final int n = (int)(intrinsicWidth * min);
                            final int n2 = (int)(intrinsicHeight * min);
                            bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                            final Canvas canvas = new Canvas(bitmap);
                            final Rect bounds = drawable.getBounds();
                            final int left = bounds.left;
                            final int top = bounds.top;
                            final int right = bounds.right;
                            final int bottom = bounds.bottom;
                            drawable.setBounds(0, 0, n, n2);
                            drawable.draw(canvas);
                            drawable.setBounds(left, top, right, bottom);
                        }
                        if (bitmap != null) {
                            final Bundle bundle = new Bundle();
                            bundle.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)bitmap);
                            bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                            if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                                final Matrix imageMatrix = imageView.getImageMatrix();
                                final float[] array = new float[9];
                                imageMatrix.getValues(array);
                                bundle.putFloatArray("sharedElement:snapshot:imageMatrix", array);
                            }
                            return (Parcelable)bundle;
                        }
                    }
                }
            }
            final int round = Math.round(rectF.width());
            final int round2 = Math.round(rectF.height());
            Parcelable parcelable;
            if (round > 0 && round2 > 0) {
                final float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                final int n3 = (int)(round * min2);
                final int n4 = (int)(round2 * min2);
                if (liz.LIZ == null) {
                    liz.LIZ = new Matrix();
                }
                liz.LIZ.set(matrix);
                liz.LIZ.postTranslate(-rectF.left, -rectF.top);
                liz.LIZ.postScale(min2, min2);
                final Bitmap bitmap2 = Bitmap.createBitmap(n3, n4, Bitmap$Config.ARGB_8888);
                final Canvas canvas2 = new Canvas(bitmap2);
                canvas2.concat(liz.LIZ);
                view.draw(canvas2);
                parcelable = (Parcelable)bitmap2;
            }
            else {
                parcelable = null;
            }
            return parcelable;
        }
        
        public final View onCreateSnapshotView(final Context context, final Parcelable parcelable) {
            final boolean b = parcelable instanceof Bundle;
            Object o = null;
            if (b) {
                final Bundle bundle = (Bundle)parcelable;
                final Bitmap imageBitmap = (Bitmap)bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (imageBitmap == null) {
                    return null;
                }
                final ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(imageBitmap);
                imageView.setScaleType(ImageView$ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                o = imageView;
                if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                    final float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    final Matrix imageMatrix = new Matrix();
                    imageMatrix.setValues(floatArray);
                    imageView.setImageMatrix(imageMatrix);
                    o = imageView;
                }
            }
            else if (parcelable instanceof Bitmap) {
                final Bitmap imageBitmap2 = (Bitmap)parcelable;
                o = new ImageView(context);
                ((ImageView)o).setImageBitmap(imageBitmap2);
            }
            return (View)o;
        }
        
        public final void onMapSharedElements(final List<String> list, final Map<String, View> map) {
        }
        
        public final void onRejectSharedElements(final List<View> list) {
        }
        
        public final void onSharedElementEnd(final List<String> list, final List<View> list2, final List<View> list3) {
        }
        
        public final void onSharedElementStart(final List<String> list, final List<View> list2, final List<View> list3) {
        }
        
        public final void onSharedElementsArrived(final List<String> list, final List<View> list2, final SharedElementCallback$OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener) {
            public final class 143 implements 06Q.a
            {
                public final /* synthetic */ SharedElementCallback$OnSharedElementsReadyListener LIZ;
                
                static {
                    Covode.recordClassIndex(684);
                }
                
                public 143(final SharedElementCallback$OnSharedElementsReadyListener liz) {
                    this.LIZ = liz;
                }
                
                @Override
                public final void LIZ() {
                    this.LIZ.onSharedElementsReady();
                }
            }
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: dup            
            //     4: aload_3        
            //     5: invokespecial   X/143.<init>:(Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V
            //     8: invokevirtual   X/143.LIZ:()V
            //    11: return         
            //    Signature:
            //  (Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Landroid/view/View;>;Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;)V
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
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
}
