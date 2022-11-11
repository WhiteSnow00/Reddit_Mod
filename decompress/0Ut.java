// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.SystemClock;
import android.hardware.Camera$PreviewCallback;
import java.util.Iterator;
import android.os.Build;
import java.util.Comparator;
import java.util.Collections;
import android.hardware.Camera$Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import android.hardware.Camera$Parameters;
import com.bytedance.covode.number.Covode;
import android.hardware.Camera$CameraInfo;
import android.hardware.Camera;

public final class 0Ut
{
    public Camera LIZ;
    public Camera$CameraInfo LIZIZ;
    public 0Uf LIZJ;
    public boolean LIZLLL;
    public 0Uv LJ;
    public 0Uy LJFF;
    public 0V2 LJI;
    public 0V2 LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public float LJIIJ;
    public final a LJIIJJI;
    public String LJIIL;
    
    static {
        Covode.recordClassIndex(4750);
    }
    
    public 0Ut() {
        this.LJ = new 0Uv();
        this.LJIIIIZZ = -1;
        this.LJIIJ = 1.0f;
        this.LJIIJJI = new a();
    }
    
    public final void LIZ(final int n) {
        final Camera liz = this.LIZ;
        if (liz == null) {
            return;
        }
        final Camera$Parameters parameters = liz.getParameters();
        if (n >= 0 && n < parameters.getMaxZoom()) {
            final 0Uf lizj = this.LIZJ;
            if (lizj != null) {
                lizj.LIZLLL();
            }
            if (parameters.isSmoothZoomSupported()) {
                this.LIZ.startSmoothZoom(n);
            }
            else {
                int i = this.LIZ.getParameters().getZoom();
                if (i < n) {
                    while (i <= n) {
                        parameters.setZoom(i);
                        this.LIZ.setParameters(parameters);
                        ++i;
                    }
                }
                else if (i > n) {
                    while (i >= n) {
                        parameters.setZoom(i);
                        this.LIZ.setParameters(parameters);
                        --i;
                    }
                }
            }
            final 0Uf lizj2 = this.LIZJ;
            if (lizj2 != null) {
                lizj2.LIZIZ();
            }
        }
    }
    
    public final void LIZ(final boolean b) {
        final Camera$Parameters parameters = this.LIZ.getParameters();
        final String ljiil = this.LJIIL;
        if (ljiil == null) {
            this.LJIIL = parameters.flatten();
        }
        else {
            parameters.unflatten(ljiil);
        }
        final 0Uv.a lji = this.LJ.LJI;
        final List supportedFocusModes = parameters.getSupportedFocusModes();
        final 0V2 0v2 = null;
        Label_0131: {
            String focusMode = null;
            Label_0113: {
                String s2 = null;
                Label_0106: {
                    Label_0086: {
                        String s3;
                        if (b || lji == 0Uv.a.AUTO) {
                            final String s = s2 = 0V8.LIZ(supportedFocusModes, "auto");
                            if (b) {
                                break Label_0106;
                            }
                            s3 = s;
                        }
                        else if (lji == 0Uv.a.CONTINUOUS) {
                            s3 = 0V8.LIZ(supportedFocusModes, "continuous-picture", "continuous-video", "auto");
                        }
                        else if (lji == 0Uv.a.INFINITY) {
                            s3 = 0V8.LIZ(supportedFocusModes, "infinity");
                        }
                        else {
                            if (lji != 0Uv.a.MACRO) {
                                break Label_0086;
                            }
                            s3 = 0V8.LIZ(supportedFocusModes, "macro");
                        }
                        focusMode = s3;
                        if (s3 != null) {
                            break Label_0113;
                        }
                    }
                    s2 = 0V8.LIZ(supportedFocusModes, "macro", "edof");
                }
                if (s2 == null) {
                    break Label_0131;
                }
                focusMode = s2;
            }
            if (!focusMode.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(focusMode);
            }
        }
        if (!b) {
            0V8.LIZ(parameters, false);
            if (this.LJ.LIZIZ && !"negative".equals(parameters.getColorEffect())) {
                final String liz = 0V8.LIZ(parameters.getSupportedColorEffects(), "negative");
                if (liz != null) {
                    parameters.setColorEffect(liz);
                }
            }
            if (this.LJ.LIZJ && !"barcode".equals(parameters.getSceneMode())) {
                final String liz2 = 0V8.LIZ(parameters.getSupportedSceneModes(), "barcode");
                if (liz2 != null) {
                    parameters.setSceneMode(liz2);
                }
            }
            if (this.LJ.LIZLLL) {
                if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
                    parameters.setVideoStabilization(true);
                }
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas((List)0V8.LIZ());
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas((List)0V8.LIZ());
                }
            }
        }
        final List supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        final ArrayList list = new ArrayList();
        if (supportedPreviewSizes == null) {
            final Camera$Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                list.add(new 0V2(previewSize.width, previewSize.height));
            }
        }
        else {
            for (final Camera$Size camera$Size : supportedPreviewSizes) {
                list.add(new 0V2(camera$Size.width, camera$Size.height));
            }
        }
        if (list.size() == 0) {
            this.LJI = null;
        }
        else {
            final 0Uy ljff = this.LJFF;
            final boolean liz3 = this.LIZ();
            0V2 0v3;
            if (ljff.LIZ == null) {
                0v3 = 0v2;
            }
            else if (liz3) {
                0v3 = ljff.LIZ.LIZ();
            }
            else {
                0v3 = ljff.LIZ;
            }
            final 0V1 lizj = ljff.LIZJ;
            if (0v3 != null) {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new 0V0(lizj, 0v3));
            }
            final 0V2 lji2 = (0V2)list.get(0);
            this.LJI = lji2;
            parameters.setPreviewSize(lji2.LIZ, this.LJI.LIZIZ);
        }
        if ("glass-1".equals(Build.DEVICE)) {
            0V8.LIZ(parameters);
        }
        parameters.setPreviewFormat(17);
        this.LIZ.setParameters(parameters);
    }
    
    public final boolean LIZ() {
        final int ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != -1) {
            return ljiiiizz % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }
    
    public final class a implements Camera$PreviewCallback
    {
        public 0Uz LIZ;
        public 0V2 LIZIZ;
        
        static {
            Covode.recordClassIndex(4751);
        }
        
        public final void onPreviewFrame(final byte[] array, Camera liz) {
            final 0V2 liziz = this.LIZIZ;
            liz = (Camera)this.LIZ;
            if (liziz != null) {
                if (liz == null) {
                    return;
                }
                Label_0087: {
                    if (array == null) {
                        break Label_0087;
                    }
                    try {
                        ((0Uz)liz).LIZ(new 0VN(array, liziz.LIZ, liziz.LIZIZ));
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - 0Ut.this.LJIIIZ < 200L) {
                            return;
                        }
                        0Ut.this.LJIIIZ = elapsedRealtime;
                        return;
                        throw new NullPointerException("No preview data received");
                    }
                    finally {
                        new Exception("parse data error");
                        ((0Uz)liz).LIZ();
                        return;
                    }
                }
            }
            if (liz != null) {
                new Exception("No resolution available");
                ((0Uz)liz).LIZ();
            }
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(4752);
        }
    }
}
