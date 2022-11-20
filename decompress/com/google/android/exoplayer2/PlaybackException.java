// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import bd.c0;
import android.os.SystemClock;
import android.os.RemoteException;
import android.text.TextUtils;
import android.os.Bundle;
import sa.m;

public class PlaybackException extends Exception implements f
{
    public static final f$a<PlaybackException> CREATOR;
    public static final int CUSTOM_ERROR_CODE_BASE = 1000000;
    public static final int ERROR_CODE_AUDIO_TRACK_INIT_FAILED = 5001;
    public static final int ERROR_CODE_AUDIO_TRACK_WRITE_FAILED = 5002;
    public static final int ERROR_CODE_BEHIND_LIVE_WINDOW = 1002;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_DECODER_QUERY_FAILED = 4002;
    public static final int ERROR_CODE_DECODING_FAILED = 4003;
    public static final int ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 4004;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 4005;
    public static final int ERROR_CODE_DRM_CONTENT_ERROR = 6003;
    public static final int ERROR_CODE_DRM_DEVICE_REVOKED = 6007;
    public static final int ERROR_CODE_DRM_DISALLOWED_OPERATION = 6005;
    public static final int ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED = 6004;
    public static final int ERROR_CODE_DRM_LICENSE_EXPIRED = 6008;
    public static final int ERROR_CODE_DRM_PROVISIONING_FAILED = 6002;
    public static final int ERROR_CODE_DRM_SCHEME_UNSUPPORTED = 6001;
    public static final int ERROR_CODE_DRM_SYSTEM_ERROR = 6006;
    public static final int ERROR_CODE_DRM_UNSPECIFIED = 6000;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1004;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_PARSING_CONTAINER_MALFORMED = 3001;
    public static final int ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_PARSING_MANIFEST_MALFORMED = 3002;
    public static final int ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED = 3004;
    public static final int ERROR_CODE_REMOTE_ERROR = 1001;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    public static final int FIELD_CUSTOM_ID_BASE = 1000;
    public final int errorCode;
    public final long timestampMs;
    
    static {
        CREATOR = (f$a)new m(6);
    }
    
    public PlaybackException(final Bundle bundle) {
        final String string = ((BaseBundle)bundle).getString(keyForField(2));
        final String string2 = ((BaseBundle)bundle).getString(keyForField(3));
        final String string3 = ((BaseBundle)bundle).getString(keyForField(4));
        final boolean empty = TextUtils.isEmpty((CharSequence)string2);
        Object o = null;
        Throwable t = null;
        if (!empty) {
            try {
                final Class<?> forName = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                if (Throwable.class.isAssignableFrom(forName)) {
                    t = (Throwable)forName.getConstructor(String.class).newInstance(string3);
                }
                if (t == null) {}
            }
            finally {
                o = new RemoteException(string3);
            }
        }
        this(string, (Throwable)o, ((BaseBundle)bundle).getInt(keyForField(0), 1000), ((BaseBundle)bundle).getLong(keyForField(1), SystemClock.elapsedRealtime()));
    }
    
    public PlaybackException(final String s, final Throwable t, final int n) {
        this(s, t, n, SystemClock.elapsedRealtime());
    }
    
    public PlaybackException(final String s, final Throwable t, final int errorCode, final long timestampMs) {
        super(s, t);
        this.errorCode = errorCode;
        this.timestampMs = timestampMs;
    }
    
    public static String getErrorCodeName(final int n) {
        if (n == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (n == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                if (n >= 1000000) {
                                                    return "custom error code";
                                                }
                                                return "invalid error code";
                                            }
                                            case 6008: {
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            }
                                            case 6007: {
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            }
                                            case 6006: {
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            }
                                            case 6005: {
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            }
                                            case 6004: {
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            }
                                            case 6003: {
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            }
                                            case 6002: {
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            }
                                            case 6001: {
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            }
                                            case 6000: {
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            }
                                        }
                                        break;
                                    }
                                    case 4005: {
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    }
                                    case 4004: {
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    }
                                    case 4003: {
                                        return "ERROR_CODE_DECODING_FAILED";
                                    }
                                    case 4002: {
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    }
                                    case 4001: {
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    }
                                }
                                break;
                            }
                            case 3004: {
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            }
                            case 3003: {
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            }
                            case 3002: {
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            }
                            case 3001: {
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            }
                        }
                        break;
                    }
                    case 2008: {
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    }
                    case 2007: {
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    }
                    case 2006: {
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    }
                    case 2005: {
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    }
                    case 2004: {
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    }
                    case 2003: {
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    }
                    case 2002: {
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    }
                    case 2001: {
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    }
                    case 2000: {
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    }
                }
                break;
            }
            case 1004: {
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            }
            case 1003: {
                return "ERROR_CODE_TIMEOUT";
            }
            case 1002: {
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            }
            case 1001: {
                return "ERROR_CODE_REMOTE_ERROR";
            }
            case 1000: {
                return "ERROR_CODE_UNSPECIFIED";
            }
        }
    }
    
    public static String keyForField(final int n) {
        return Integer.toString(n, 36);
    }
    
    public boolean errorInfoEquals(final PlaybackException ex) {
        boolean b = true;
        if (this == ex) {
            return true;
        }
        if (ex != null) {
            if (this.getClass() == ex.getClass()) {
                final Throwable cause = this.getCause();
                final Throwable cause2 = ex.getCause();
                if (cause != null && cause2 != null) {
                    if (!c0.a((Object)cause.getMessage(), (Object)cause2.getMessage())) {
                        return false;
                    }
                    if (!c0.a((Object)cause.getClass(), (Object)cause2.getClass())) {
                        return false;
                    }
                }
                else {
                    if (cause != null) {
                        return false;
                    }
                    if (cause2 != null) {
                        return false;
                    }
                }
                if (this.errorCode != ex.errorCode || !c0.a((Object)this.getMessage(), (Object)ex.getMessage()) || this.timestampMs != ex.timestampMs) {
                    b = false;
                }
                return b;
            }
        }
        return false;
    }
    
    public final String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }
    
    public Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(keyForField(0), this.errorCode);
        ((BaseBundle)bundle).putLong(keyForField(1), this.timestampMs);
        ((BaseBundle)bundle).putString(keyForField(2), this.getMessage());
        final Throwable cause = this.getCause();
        if (cause != null) {
            ((BaseBundle)bundle).putString(keyForField(3), cause.getClass().getName());
            ((BaseBundle)bundle).putString(keyForField(4), cause.getMessage());
        }
        return bundle;
    }
}
