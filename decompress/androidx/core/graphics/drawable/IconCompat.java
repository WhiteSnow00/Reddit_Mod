// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.graphics.drawable;

import X.0II;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import android.net.Uri;
import java.io.InputStream;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.graphics.drawable.Icon;
import com.bytedance.covode.number.Covode;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    public static final PorterDuff$Mode LJII;
    public int LIZ;
    public Object LIZIZ;
    public byte[] LIZJ;
    public Parcelable LIZLLL;
    public int LJ;
    public int LJFF;
    public ColorStateList LJI;
    public PorterDuff$Mode LJIIIIZZ;
    public String LJIIIZ;
    
    static {
        Covode.recordClassIndex(889);
        LJII = PorterDuff$Mode.SRC_IN;
    }
    
    public IconCompat() {
        this.LIZ = -1;
        this.LJIIIIZZ = IconCompat.LJII;
    }
    
    public IconCompat(final byte b) {
        this.LIZ = -1;
        this.LJIIIIZZ = IconCompat.LJII;
        this.LIZ = 2;
    }
    
    public static int LIZ(final Icon icon) {
        if (Build$VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return (int)icon.getClass().getMethod("getType", (Class<?>[])new Class[0]).invoke(icon, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return -1;
        }
    }
    
    public static Resources LIZ(final Context context, final String s) {
        if ("android".equals(s)) {
            return Resources.getSystem();
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final Context liz = NQO.LJJ.LIZ();
            if (6Tl.LJIIIZ) {
                TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName());
            }
            if (6Tl.LJIIIZ) {
                TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName());
            }
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static Bitmap LIZ(final Bitmap bitmap) {
        final int n = (int)(Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(3);
        final float n2 = n * 0.5f;
        paint.setColor(-16777216);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(bitmap, clamp, clamp);
        final Matrix localMatrix = new Matrix();
        localMatrix.setTranslate((float)(-(bitmap.getWidth() - n) / 2), (float)(-(bitmap.getHeight() - n) / 2));
        shader.setLocalMatrix(localMatrix);
        paint.setShader((Shader)shader);
        canvas.drawCircle(n2, n2, 0.9166667f * n2, paint);
        canvas.setBitmap((Bitmap)null);
        return bitmap2;
    }
    
    public static IconCompat LIZ(final Context context, final int n) {
        if (context != null) {
            return LIZ(context.getResources(), context.getPackageName(), n);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }
    
    public static IconCompat LIZ(final Resources resources, final String liziz, final int lj) {
        if (liziz == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (lj != 0) {
            final IconCompat iconCompat = new IconCompat((byte)0);
            iconCompat.LJ = lj;
            if (resources != null) {
                try {
                    iconCompat.LIZIZ = resources.getResourceName(lj);
                    return iconCompat;
                }
                catch (final Resources$NotFoundException ex) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            iconCompat.LIZIZ = liziz;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
    
    public static String LIZIZ(final Icon icon) {
        if (Build$VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String)icon.getClass().getMethod("getResPackage", (Class<?>[])new Class[0]).invoke(icon, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
    }
    
    public static int LIZJ(final Icon icon) {
        if (Build$VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return (int)icon.getClass().getMethod("getResId", (Class<?>[])new Class[0]).invoke(icon, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return 0;
        }
    }
    
    private String LIZJ() {
        if (this.LIZ == -1 && Build$VERSION.SDK_INT >= 23) {
            return LIZIZ((Icon)this.LIZIZ);
        }
        if (this.LIZ == 2) {
            return ((String)this.LIZIZ).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
    }
    
    private void LIZJ(final Context context) {
        if (this.LIZ == 2) {
            final String s = (String)this.LIZIZ;
            if (!s.contains(":")) {
                return;
            }
            final String s2 = s.split(":", -1)[1];
            final String s3 = s2.split("/", -1)[0];
            final String s4 = s2.split("/", -1)[1];
            final String s5 = s.split(":", -1)[0];
            final int identifier = LIZ(context, s5).getIdentifier(s4, s3, s5);
            if (this.LJ != identifier) {
                this.LJ = identifier;
            }
        }
    }
    
    private Drawable LIZLLL(final Context context) {
    Label_0174_Outer:
        while (true) {
            while (true) {
                switch (this.LIZ) {
                    case 4: {
                        break Label_0174_Outer;
                    }
                    case 6: {
                        break Label_0174_Outer;
                    }
                    case 2: {
                        String s;
                        if (TextUtils.isEmpty((CharSequence)(s = this.LIZJ()))) {
                            s = context.getPackageName();
                        }
                    }
                    case 1: {
                        Label_0155: {
                            break Label_0155;
                            final String s;
                            final Resources liz = LIZ(context, s);
                            try {
                                return liz.getDrawable(this.LJ, context.getTheme());
                                final InputStream lj = this.LJ(context);
                                iftrue(Label_0044:)(lj == null);
                                return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(lj));
                                return (Drawable)new BitmapDrawable(context.getResources(), LIZ((Bitmap)this.LIZIZ));
                                final InputStream lj2 = this.LJ(context);
                                iftrue(Label_0044:)(lj2 == null);
                                iftrue(Label_0228:)(Build$VERSION.SDK_INT < 26);
                                return (Drawable)new AdaptiveIconDrawable((Drawable)null, (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(lj2)));
                                Label_0228: {
                                    return (Drawable)new BitmapDrawable(context.getResources(), LIZ(BitmapFactory.decodeStream(lj2)));
                                }
                                return (Drawable)new BitmapDrawable(context.getResources(), (Bitmap)this.LIZIZ);
                                return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[])this.LIZIZ, this.LJ, this.LJFF));
                            }
                            catch (final RuntimeException ex) {
                                break;
                            }
                        }
                        break;
                    }
                    case 3: {
                        continue;
                    }
                    case 5: {
                        continue Label_0174_Outer;
                    }
                }
                break;
            }
            break;
        }
        Label_0044: {
            return null;
        }
    }
    
    private Uri LIZLLL() {
        if (this.LIZ == -1 && Build$VERSION.SDK_INT >= 23) {
            return LIZLLL((Icon)this.LIZIZ);
        }
        final int liz = this.LIZ;
        if (liz == 4 || liz == 6) {
            return Uri.parse((String)this.LIZIZ);
        }
        throw new IllegalStateException("called getUri() on ".concat(String.valueOf(this)));
    }
    
    public static Uri LIZLLL(final Icon icon) {
        if (Build$VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri)icon.getClass().getMethod("getUri", (Class<?>[])new Class[0]).invoke(icon, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
    }
    
    private InputStream LJ(final Context context) {
        final Uri lizlll = this.LIZLLL();
        final String scheme = lizlll.getScheme();
        Label_0057: {
            if ("content".equals(scheme) || "file".equals(scheme)) {
                break Label_0057;
            }
            try {
                return new FileInputStream(new File((String)this.LIZIZ));
                return context.getContentResolver().openInputStream(lizlll);
            }
            catch (final FileNotFoundException ex) {
                return null;
            }
        }
    }
    
    public final int LIZ() {
        if (this.LIZ == -1 && Build$VERSION.SDK_INT >= 23) {
            return LIZJ((Icon)this.LIZIZ);
        }
        if (this.LIZ == 2) {
            return this.LJ;
        }
        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
    }
    
    public final Icon LIZ(final Context context) {
        Icon icon = null;
        switch (this.LIZ) {
            default: {
                throw new IllegalArgumentException("Unknown type");
            }
            case -1: {
                return (Icon)this.LIZIZ;
            }
            case 1: {
                icon = Icon.createWithBitmap((Bitmap)this.LIZIZ);
                break;
            }
            case 2: {
                icon = Icon.createWithResource(this.LIZJ(), this.LJ);
                break;
            }
            case 3: {
                icon = Icon.createWithData((byte[])this.LIZIZ, this.LJ, this.LJFF);
                break;
            }
            case 4: {
                icon = Icon.createWithContentUri((String)this.LIZIZ);
                break;
            }
            case 5: {
                if (Build$VERSION.SDK_INT >= 26) {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap)this.LIZIZ);
                    break;
                }
                icon = Icon.createWithBitmap(LIZ((Bitmap)this.LIZIZ));
                break;
            }
            case 6: {
                if (context == null) {
                    final StringBuilder sb = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    sb.append(this.LIZLLL());
                    throw new IllegalArgumentException(sb.toString());
                }
                final InputStream lj = this.LJ(context);
                if (lj == null) {
                    final StringBuilder sb2 = new StringBuilder("Cannot load adaptive icon from uri: ");
                    sb2.append(this.LIZLLL());
                    throw new IllegalStateException(sb2.toString());
                }
                if (Build$VERSION.SDK_INT >= 26) {
                    icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(lj));
                    break;
                }
                icon = Icon.createWithBitmap(LIZ(BitmapFactory.decodeStream(lj)));
                break;
            }
        }
        final ColorStateList lji = this.LJI;
        if (lji != null) {
            icon.setTintList(lji);
        }
        final PorterDuff$Mode ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != IconCompat.LJII) {
            icon.setTintMode(ljiiiizz);
        }
        return icon;
    }
    
    public final Drawable LIZIZ(final Context context) {
        this.LIZJ(context);
        if (Build$VERSION.SDK_INT >= 23) {
            return this.LIZ(context).loadDrawable(context);
        }
        final Drawable lizlll = this.LIZLLL(context);
        if (lizlll != null && (this.LJI != null || this.LJIIIIZZ != IconCompat.LJII)) {
            lizlll.mutate();
            lizlll.setTintList(this.LJI);
            lizlll.setTintMode(this.LJIIIIZZ);
        }
        return lizlll;
    }
    
    public final Bundle LIZIZ() {
        final Bundle bundle = new Bundle();
        switch (this.LIZ) {
            default: {
                throw new IllegalArgumentException("Invalid icon");
            }
            case -1: {
                bundle.putParcelable("obj", (Parcelable)this.LIZIZ);
                break;
            }
            case 1:
            case 5: {
                bundle.putParcelable("obj", (Parcelable)this.LIZIZ);
                break;
            }
            case 2:
            case 4:
            case 6: {
                bundle.putString("obj", (String)this.LIZIZ);
                break;
            }
            case 3: {
                bundle.putByteArray("obj", (byte[])this.LIZIZ);
                break;
            }
        }
        bundle.putInt("type", this.LIZ);
        bundle.putInt("int1", this.LJ);
        bundle.putInt("int2", this.LJFF);
        final ColorStateList lji = this.LJI;
        if (lji != null) {
            bundle.putParcelable("tint_list", (Parcelable)lji);
        }
        final PorterDuff$Mode ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != IconCompat.LJII) {
            bundle.putString("tint_mode", ljiiiizz.name());
        }
        return bundle;
    }
    
    @Override
    public String toString() {
        if (this.LIZ == -1) {
            return String.valueOf(this.LIZIZ);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        String s = null;
        switch (this.LIZ) {
            default: {
                s = "UNKNOWN";
                break;
            }
            case 1: {
                s = "BITMAP";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
        }
        sb.append(s);
        switch (this.LIZ) {
            case 1:
            case 5: {
                sb.append(" size=");
                sb.append(((Bitmap)this.LIZIZ).getWidth());
                sb.append("x");
                sb.append(((Bitmap)this.LIZIZ).getHeight());
                break;
            }
            case 2: {
                sb.append(" pkg=");
                sb.append(this.LIZJ());
                sb.append(" id=");
                sb.append(0II.LIZ("0x%08x", new Object[] { this.LIZ() }));
                break;
            }
            case 3: {
                sb.append(" len=");
                sb.append(this.LJ);
                if (this.LJFF != 0) {
                    sb.append(" off=");
                    sb.append(this.LJFF);
                    break;
                }
                break;
            }
            case 4:
            case 6: {
                sb.append(" uri=");
                sb.append(this.LIZIZ);
                break;
            }
        }
        if (this.LJI != null) {
            sb.append(" tint=");
            sb.append(this.LJI);
        }
        if (this.LJIIIIZZ != IconCompat.LJII) {
            sb.append(" mode=");
            sb.append(this.LJIIIIZZ);
        }
        sb.append(")");
        return sb.toString();
    }
}
