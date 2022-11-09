// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.os.BaseBundle;
import android.os.Process;
import com.amazonaws.ivs.net.NetworkLinkInfo;
import com.amazonaws.ivs.net.HttpClientFactory;
import com.amazonaws.ivs.net.HttpClient;
import java.util.Iterator;
import android.media.MediaFormat;
import android.view.Display$Mode;
import java.util.UUID;
import java.util.EnumSet;
import java.nio.ByteBuffer;
import java.math.BigDecimal;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import android.content.Context;

public class Platform
{
    public static final String LIBRARY_NAME = "playercore";
    private static ErrorListener errorListener;
    private AudioTrackRenderer audioRenderer;
    private final Context context;
    private Map<String, String> deviceProperties;
    private ConcurrentLinkedQueue<Throwable> pendingExceptions;
    private SurfaceRenderer surfaceRenderer;
    private WeakReference<VideoRenderer.VideoSizeListener> videoSizeListener;
    
    public Platform(final Context context) {
        this(context, null);
    }
    
    public Platform(final Context context, final VideoRenderer.VideoSizeListener videoSizeListener) {
        this.context = context;
        this.pendingExceptions = new ConcurrentLinkedQueue<Throwable>();
        this.deviceProperties = new HashMap<String, String>();
        if (videoSizeListener != null) {
            this.videoSizeListener = new WeakReference<VideoRenderer.VideoSizeListener>(videoSizeListener);
        }
        final Map<String, String> deviceProperties = this.deviceProperties;
        final StringBuilder k = a.k("android-");
        k.append(Build$VERSION.SDK_INT);
        deviceProperties.put("device_software", k.toString());
        this.deviceProperties.put("device_os_version", Build$VERSION.RELEASE);
        this.deviceProperties.put("device_model", Build.MODEL);
        this.deviceProperties.put("device_manufacturer", Build.MANUFACTURER);
        this.deviceProperties.put("device_diagonal", this.getDeviceDiagonalSize());
        if (context != null && context.getPackageManager() != null) {
            try {
                final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null) {
                        final String string = ((BaseBundle)metaData).getString("com.amazonaws.ivs.player.FRAMEWORK_NAME");
                        final String string2 = ((BaseBundle)applicationInfo.metaData).getString("com.amazonaws.ivs.player.FRAMEWORK_VERSION");
                        if (string != null && !string.isEmpty()) {
                            this.deviceProperties.put("player_framework", string);
                        }
                        if (string2 != null && !string2.isEmpty()) {
                            this.deviceProperties.put("player_framework_version", string2);
                        }
                    }
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.d("AmazonIVS", "Unable to find package", (Throwable)ex);
            }
        }
    }
    
    private String getDeviceDiagonalSize() {
        final WindowManager windowManager = (WindowManager)this.context.getSystemService("window");
        if (windowManager != null) {
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            return new BigDecimal(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0))).setScale(1, 4).toString();
        }
        return "0.0";
    }
    
    public static ByteBuffer[] getSupportedProtectionSystemUUIDs() {
        final EnumSet<ProtectionSystem> supported = ProtectionSystem.getSupported();
        int i = 0;
        final ProtectionSystem[] array = (ProtectionSystem[])supported.toArray((Object[])new ProtectionSystem[0]);
        final ByteBuffer[] array2 = new ByteBuffer[array.length];
        while (i < array.length) {
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16);
            final UUID uuid = array[i].getUUID();
            allocateDirect.putLong(uuid.getMostSignificantBits());
            allocateDirect.putLong(uuid.getLeastSignificantBits());
            array2[i] = allocateDirect;
            ++i;
        }
        return array2;
    }
    
    public static void setErrorListener(final ErrorListener errorListener) {
        Platform.errorListener = errorListener;
    }
    
    private void updateDeviceDisplayMode() {
        final WindowManager windowManager = (WindowManager)this.context.getSystemService("window");
        int n = 0;
        int i = 0;
        int n2;
        if (windowManager != null) {
            final Display$Mode[] supportedModes = windowManager.getDefaultDisplay().getSupportedModes();
            final int length = supportedModes.length;
            n = (n2 = 0);
            while (i < length) {
                final Display$Mode display$Mode = supportedModes[i];
                final int physicalWidth = display$Mode.getPhysicalWidth();
                final int physicalHeight = display$Mode.getPhysicalHeight();
                int n3 = n;
                int n4 = n2;
                if (physicalWidth * physicalHeight > n * n2) {
                    n4 = physicalHeight;
                    n3 = physicalWidth;
                }
                ++i;
                n = n3;
                n2 = n4;
            }
        }
        else {
            n2 = 0;
        }
        if (n > 0 && n2 > 0) {
            this.deviceProperties.put("display_width", Integer.toString(n));
            this.deviceProperties.put("display_height", Integer.toString(n2));
        }
    }
    
    public MediaDecoder createDecoder(final MediaFormat mediaFormat) {
        final String string = mediaFormat.getString("mime");
        final boolean startsWith = string.startsWith("video");
        final MediaDecoder mediaDecoder = null;
        VideoRenderer.VideoSizeListener videoSizeListener = null;
        if (startsWith) {
            if (this.surfaceRenderer == null) {
                final WeakReference<VideoRenderer.VideoSizeListener> videoSizeListener2 = this.videoSizeListener;
                if (videoSizeListener2 != null) {
                    videoSizeListener = (VideoRenderer.VideoSizeListener)videoSizeListener2.get();
                }
                this.surfaceRenderer = new SurfaceRenderer(this.context, videoSizeListener);
            }
            return (MediaDecoder)new MediaCodecDecoder(mediaFormat, this.surfaceRenderer);
        }
        Object o = mediaDecoder;
        if (string.startsWith("audio")) {
            final AudioTrackRenderer audioRenderer = this.audioRenderer;
            if (audioRenderer != null) {
                audioRenderer.release();
            }
            this.audioRenderer = new AudioTrackRenderer();
            o = new MediaCodecDecoder(mediaFormat, (MediaRenderer)this.audioRenderer);
        }
        return (MediaDecoder)o;
    }
    
    public PlayerException createException(final String s, final int n, final int n2, final String s2) {
        final ErrorType fromInt = ErrorType.fromInt(n);
        final Throwable t = this.pendingExceptions.poll();
        PlayerException ex;
        if (t != null) {
            ex = new PlayerException(t, s, fromInt, n2, s2);
            if (this.pendingExceptions.size() > 1) {
                Log.w("AmazonIVS", "Errored with multiple exceptions");
                final Iterator<Throwable> iterator = this.pendingExceptions.iterator();
                while (iterator.hasNext()) {
                    Log.w("AmazonIVS", (Throwable)iterator.next());
                }
            }
            this.pendingExceptions.clear();
        }
        else {
            ex = new PlayerException(s, fromInt, n2, s2);
        }
        return ex;
    }
    
    public HttpClient createHttpClient() {
        return HttpClientFactory.create(this.context);
    }
    
    public NetworkLinkInfo createNetworkLinkInfo() {
        return new NetworkLinkInfo(this.context);
    }
    
    public MediaRenderer createRenderer(final MediaFormat mediaFormat) {
        synchronized (this) {
            final String string = mediaFormat.getString("mime");
            if (string.startsWith("audio")) {
                return (MediaRenderer)this.audioRenderer;
            }
            if (string.startsWith("video")) {
                return (MediaRenderer)this.surfaceRenderer;
            }
            return null;
        }
    }
    
    public int getAudioSessionId() {
        final AudioTrackRenderer audioRenderer = this.audioRenderer;
        int audioSessionId;
        if (audioRenderer == null) {
            audioSessionId = -1;
        }
        else {
            audioSessionId = audioRenderer.getAudioSessionId();
        }
        return audioSessionId;
    }
    
    public Map<String, String> getDeviceProperties() {
        this.updateDeviceDisplayMode();
        return this.deviceProperties;
    }
    
    public String getStringOrientation() {
        final int orientation = this.context.getResources().getConfiguration().orientation;
        if (orientation == 1) {
            return "portrait";
        }
        if (orientation != 2) {
            return "unknown";
        }
        return "landscape";
    }
    
    public VideoCapabilities getVideoDecoderCapabilities(final String s) {
        return VideoCapabilities.getCapabilities(MediaType.removeParameters(s));
    }
    
    public void handleDecoderException(final Throwable t) {
        if (t != null) {
            Log.w("AmazonIVS", t);
            this.pendingExceptions.add(t);
            final ErrorListener errorListener = Platform.errorListener;
            if (errorListener != null) {
                errorListener.onError(t);
            }
        }
    }
    
    public void handleRendererException(final Throwable t) {
        if (t != null) {
            Log.w("AmazonIVS", t);
            this.pendingExceptions.add(t);
            final ErrorListener errorListener = Platform.errorListener;
            if (errorListener != null) {
                errorListener.onError(t);
            }
        }
    }
    
    public void onThreadCreated(final String name) {
        try {
            Process.setThreadPriority(-2);
        }
        catch (final Exception ex) {
            Log.w("AmazonIVS", (Throwable)ex);
        }
        if (name != null && !name.isEmpty()) {
            Thread.currentThread().setName(name);
        }
    }
    
    public interface ErrorListener
    {
        void onError(final Throwable p0);
    }
}
