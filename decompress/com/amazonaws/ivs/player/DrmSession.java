// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm$ProvisionRequest;
import android.media.MediaDrm$KeyRequest;
import android.media.MediaFormat;
import android.media.NotProvisionedException;
import java.nio.ByteBuffer;
import android.media.UnsupportedSchemeException;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import java.util.UUID;
import java.util.Map;
import android.media.MediaDrm$OnEventListener;

class DrmSession implements Releasable, MediaDrm$OnEventListener
{
    private static final Map<UUID, DrmSession> sessions;
    private final String SECURITY_LEVEL;
    private final String SESSION_SHARING;
    private final MediaDrm drm;
    private final DrmSession.DrmSession$Listener listener;
    private final Map<DrmPssh, MediaCrypto> mediaCrypto;
    private byte[] session;
    private boolean sessionSharing;
    private final UUID systemUUID;
    
    static {
        sessions = new ConcurrentHashMap<UUID, DrmSession>();
    }
    
    private DrmSession(final UUID systemUUID, final DrmSession.DrmSession$Listener listener) {
        this.SECURITY_LEVEL = "securityLevel";
        this.SESSION_SHARING = "sessionSharing";
        this.systemUUID = systemUUID;
        this.listener = listener;
        this.mediaCrypto = new HashMap<DrmPssh, MediaCrypto>();
        try {
            final MediaDrm drm = new MediaDrm(systemUUID);
            (this.drm = drm).setOnEventListener((MediaDrm$OnEventListener)this);
            if (systemUUID.equals(ProtectionSystem.WIDEVINE.getUUID())) {
                if (this.sessionSharing) {
                    try {
                        drm.setPropertyString("sessionSharing", "enable");
                    }
                    catch (final IllegalStateException ex) {
                        ex.printStackTrace();
                    }
                }
                try {
                    if ("L1".equals(this.drm.getPropertyString("securityLevel"))) {
                        this.setWidevineSecurityLevel("L3");
                    }
                }
                catch (final Exception ex2) {
                    Log.w("AmazonIVS", "Failed to set security level", (Throwable)ex2);
                }
            }
            DrmSession.sessions.put(systemUUID, this);
        }
        catch (final UnsupportedSchemeException ex3) {
            ((Throwable)ex3).printStackTrace();
            throw new RuntimeException((Throwable)ex3);
        }
    }
    
    public static DrmSession create(final ByteBuffer byteBuffer, final long n) {
        return create(getUUID(byteBuffer), (DrmSession.DrmSession$Listener)new DrmListener(n));
    }
    
    public static DrmSession create(final UUID uuid, final DrmSession.DrmSession$Listener drmSession$Listener) {
        if (MediaDrm.isCryptoSchemeSupported(uuid)) {
            return new DrmSession(uuid, drmSession$Listener);
        }
        return null;
    }
    
    private void createSession(final boolean b) {
        final byte[] session = this.session;
        if (session != null) {
            this.drm.closeSession(session);
            this.session = null;
        }
        try {
            this.session = this.drm.openSession();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            this.listener.onError(ex.getMessage());
        }
        catch (final NotProvisionedException ex2) {
            ((Throwable)ex2).printStackTrace();
            if (!b) {
                this.listener.onProvisionRequested();
            }
            else {
                this.listener.onError(((Throwable)ex2).getMessage());
            }
        }
    }
    
    public static DrmSession get(final MediaFormat mediaFormat) {
        int n = 0;
        while (true) {
            final StringBuilder sb = new StringBuilder();
            sb.append("drm-");
            sb.append(n);
            final ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return null;
            }
            final UUID systemId = new DrmPssh(byteBuffer).getSystemId();
            if (systemId != null) {
                final Map<UUID, DrmSession> sessions = DrmSession.sessions;
                if (sessions.containsKey(systemId)) {
                    return sessions.get(systemId);
                }
            }
            ++n;
        }
    }
    
    private static UUID getUUID(final ByteBuffer byteBuffer) {
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }
    
    private void setWidevineSecurityLevel(final String s) {
        if (this.systemUUID.equals(ProtectionSystem.WIDEVINE.getUUID()) && !this.drm.getPropertyString("securityLevel").equals(s)) {
            this.drm.setPropertyString("securityLevel", s);
        }
    }
    
    private void unprovision() {
        try {
            this.drm.provideProvisionResponse("unprovision".getBytes());
        }
        catch (final Exception ex) {
            Log.w("AmazonIVS", "Un-provision failed", (Throwable)ex);
        }
    }
    
    public DrmSession.DrmSession$OpaqueRequest generateKeyRequest(final byte[] array) {
        try {
            final MediaDrm$KeyRequest keyRequest = this.drm.getKeyRequest(this.session, array, "cenc", 1, (HashMap)null);
            final DrmSession.DrmSession$OpaqueRequest drmSession$OpaqueRequest = new DrmSession.DrmSession$OpaqueRequest();
            drmSession$OpaqueRequest.url = keyRequest.getDefaultUrl();
            drmSession$OpaqueRequest.data = keyRequest.getData();
            return drmSession$OpaqueRequest;
        }
        catch (final NotProvisionedException ex) {
            this.listener.onProvisionRequested();
            ((Throwable)ex).printStackTrace();
            return null;
        }
    }
    
    public DrmSession.DrmSession$OpaqueRequest generateProvisionRequest() {
        final MediaDrm$ProvisionRequest provisionRequest = this.drm.getProvisionRequest();
        final DrmSession.DrmSession$OpaqueRequest drmSession$OpaqueRequest = new DrmSession.DrmSession$OpaqueRequest();
        drmSession$OpaqueRequest.url = provisionRequest.getDefaultUrl();
        drmSession$OpaqueRequest.data = provisionRequest.getData();
        return drmSession$OpaqueRequest;
    }
    
    public MediaCrypto getMediaCrypto(final MediaFormat mediaFormat) {
        int n = 0;
        DrmPssh drmPssh = null;
        while (true) {
            final StringBuilder sb = new StringBuilder();
            sb.append("drm-");
            sb.append(n);
            final ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                break;
            }
            drmPssh = new DrmPssh(byteBuffer);
            if (this.systemUUID.equals(drmPssh.getSystemId())) {
                break;
            }
            ++n;
        }
        if (drmPssh != null) {
            synchronized (this.mediaCrypto) {
                if (this.mediaCrypto.containsKey(drmPssh)) {
                    return this.mediaCrypto.get(drmPssh);
                }
                try {
                    final MediaCrypto mediaCrypto = new MediaCrypto(this.systemUUID, this.session);
                    this.mediaCrypto.put(drmPssh, mediaCrypto);
                    return mediaCrypto;
                }
                catch (final MediaCryptoException ex) {
                    ((Throwable)ex).printStackTrace();
                    this.listener.onError(((Throwable)ex).getMessage());
                }
            }
        }
        return null;
    }
    
    public byte[] getSessionId() {
        return this.session;
    }
    
    public void initialize() {
        this.createSession(false);
    }
    
    public void onEvent(final MediaDrm mediaDrm, final byte[] array, final int n, final int n2, final byte[] array2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaDrm event ");
        sb.append(n);
        sb.append(" extra ");
        sb.append(n2);
        Log.w("AmazonIVS", sb.toString());
        if (n != 2) {
            if (n == 3) {
                this.listener.onKeyExpired();
            }
        }
        else {
            this.listener.onKeyRequested();
        }
    }
    
    public void release() {
        final MediaDrm drm = this.drm;
        if (drm != null) {
            try {
                final byte[] session = this.session;
                if (session != null) {
                    drm.closeSession(session);
                }
                synchronized (this.mediaCrypto) {
                    this.mediaCrypto.clear();
                }
            }
            finally {
                this.drm.release();
                DrmSession.sessions.remove(this.systemUUID);
            }
        }
    }
    
    public void updateKeyResponse(final byte[] array) {
        try {
            this.drm.provideKeyResponse(this.session, array);
        }
        catch (final DeniedByServerException ex) {
            ((Throwable)ex).printStackTrace();
            this.listener.onError(((Throwable)ex).getMessage());
        }
        catch (final NotProvisionedException ex2) {
            ((Throwable)ex2).printStackTrace();
            this.listener.onProvisionRequested();
        }
    }
    
    public void updateProvisionResponse(final byte[] array) {
        try {
            this.drm.provideProvisionResponse(array);
            if (this.session == null) {
                this.createSession(true);
            }
        }
        catch (final DeniedByServerException ex) {
            ((Throwable)ex).printStackTrace();
            this.listener.onError(((Throwable)ex).getMessage());
        }
    }
}
