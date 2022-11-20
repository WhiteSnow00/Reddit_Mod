// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.tonyodev.fetch2core.Downloader;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068" }, d2 = { "Lcom/tonyodev/fetch2/Error;", "", "", "value", "I", "getValue", "()I", "", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "Lcom/tonyodev/fetch2core/Downloader$a;", "httpResponse", "Lcom/tonyodev/fetch2core/Downloader$a;", "getHttpResponse", "()Lcom/tonyodev/fetch2core/Downloader$a;", "setHttpResponse", "(Lcom/tonyodev/fetch2core/Downloader$a;)V", "<init>", "(Ljava/lang/String;IILjava/lang/Throwable;Lcom/tonyodev/fetch2core/Downloader$a;)V", "Companion", "a", "UNKNOWN", "NONE", "FILE_NOT_CREATED", "CONNECTION_TIMED_OUT", "UNKNOWN_HOST", "HTTP_NOT_FOUND", "WRITE_PERMISSION_DENIED", "NO_STORAGE_SPACE", "NO_NETWORK_CONNECTION", "EMPTY_RESPONSE_FROM_SERVER", "REQUEST_ALREADY_EXIST", "DOWNLOAD_NOT_FOUND", "FETCH_DATABASE_ERROR", "REQUEST_WITH_ID_ALREADY_EXIST", "REQUEST_WITH_FILE_PATH_ALREADY_EXIST", "REQUEST_NOT_SUCCESSFUL", "UNKNOWN_IO_ERROR", "FILE_NOT_FOUND", "FETCH_FILE_SERVER_URL_INVALID", "INVALID_CONTENT_HASH", "FAILED_TO_UPDATE_REQUEST", "FAILED_TO_ADD_COMPLETED_DOWNLOAD", "FETCH_FILE_SERVER_INVALID_RESPONSE", "REQUEST_DOES_NOT_EXIST", "ENQUEUE_NOT_SUCCESSFUL", "COMPLETED_NOT_ADDED_SUCCESSFULLY", "ENQUEUED_REQUESTS_ARE_NOT_DISTINCT", "FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE", "FAILED_TO_RENAME_FILE", "FILE_ALLOCATION_FAILED", "HTTP_CONNECTION_NOT_ALLOWED", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public enum Error
{
    private static final Error[] $VALUES;
    
    COMPLETED_NOT_ADDED_SUCCESSFULLY("COMPLETED_NOT_ADDED_SUCCESSFULLY", 25, 26, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    CONNECTION_TIMED_OUT("CONNECTION_TIMED_OUT", 3, 2, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null);
    
    public static final a Companion;
    
    DOWNLOAD_NOT_FOUND("DOWNLOAD_NOT_FOUND", 11, 10, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    EMPTY_RESPONSE_FROM_SERVER("EMPTY_RESPONSE_FROM_SERVER", 9, 8, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    ENQUEUED_REQUESTS_ARE_NOT_DISTINCT("ENQUEUED_REQUESTS_ARE_NOT_DISTINCT", 26, 27, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    ENQUEUE_NOT_SUCCESSFUL("ENQUEUE_NOT_SUCCESSFUL", 24, 25, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FAILED_TO_ADD_COMPLETED_DOWNLOAD("FAILED_TO_ADD_COMPLETED_DOWNLOAD", 21, 22, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FAILED_TO_RENAME_FILE("FAILED_TO_RENAME_FILE", 28, 29, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE("FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE", 27, 28, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FAILED_TO_UPDATE_REQUEST("FAILED_TO_UPDATE_REQUEST", 20, 21, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FETCH_DATABASE_ERROR("FETCH_DATABASE_ERROR", 12, 11, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FETCH_FILE_SERVER_INVALID_RESPONSE("FETCH_FILE_SERVER_INVALID_RESPONSE", 22, 23, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FETCH_FILE_SERVER_URL_INVALID("FETCH_FILE_SERVER_URL_INVALID", 18, 19, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FILE_ALLOCATION_FAILED("FILE_ALLOCATION_FAILED", 29, 30, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FILE_NOT_CREATED("FILE_NOT_CREATED", 2, 1, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    FILE_NOT_FOUND("FILE_NOT_FOUND", 17, 17, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    HTTP_CONNECTION_NOT_ALLOWED("HTTP_CONNECTION_NOT_ALLOWED", 30, 31, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    HTTP_NOT_FOUND("HTTP_NOT_FOUND", 5, 4, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    INVALID_CONTENT_HASH("INVALID_CONTENT_HASH", 19, 20, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    NONE("NONE", 1, 0, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    NO_NETWORK_CONNECTION("NO_NETWORK_CONNECTION", 8, 7, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    NO_STORAGE_SPACE("NO_STORAGE_SPACE", 7, 6, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    REQUEST_ALREADY_EXIST("REQUEST_ALREADY_EXIST", 10, 9, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    REQUEST_DOES_NOT_EXIST("REQUEST_DOES_NOT_EXIST", 23, 24, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    REQUEST_NOT_SUCCESSFUL("REQUEST_NOT_SUCCESSFUL", 15, 15, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    REQUEST_WITH_FILE_PATH_ALREADY_EXIST("REQUEST_WITH_FILE_PATH_ALREADY_EXIST", 14, 14, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    REQUEST_WITH_ID_ALREADY_EXIST("REQUEST_WITH_ID_ALREADY_EXIST", 13, 13, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    UNKNOWN("UNKNOWN", 0, -1, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    UNKNOWN_HOST("UNKNOWN_HOST", 4, 3, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    UNKNOWN_IO_ERROR("UNKNOWN_IO_ERROR", 16, 16, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null), 
    WRITE_PERMISSION_DENIED("WRITE_PERMISSION_DENIED", 6, 5, (Throwable)null, (Downloader.a)null, 6, (DefaultConstructorMarker)null);
    
    private Downloader.a httpResponse;
    private Throwable throwable;
    private final int value;
    
    static {
        Companion = new a();
    }
    
    private Error(final int value, final Throwable throwable, final Downloader.a httpResponse) {
        this.value = value;
        this.throwable = throwable;
        this.httpResponse = httpResponse;
    }
    
    public Error(final String s, final int n, final int n2, Throwable t, Downloader.a a, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x2) != 0x0) {
            t = null;
        }
        if ((n3 & 0x4) != 0x0) {
            a = null;
        }
        this(n2, t, a);
    }
    
    public static final Error valueOf(final int n) {
        Error.Companion.getClass();
        return a.a(n);
    }
    
    public final Downloader.a getHttpResponse() {
        return this.httpResponse;
    }
    
    public final Throwable getThrowable() {
        return this.throwable;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    public final void setHttpResponse(final Downloader.a httpResponse) {
        this.httpResponse = httpResponse;
    }
    
    public final void setThrowable(final Throwable throwable) {
        this.throwable = throwable;
    }
    
    public static final class a
    {
        public static Error a(final int n) {
            Error error = null;
            switch (n) {
                default: {
                    error = Error.UNKNOWN;
                    break;
                }
                case 31: {
                    error = Error.HTTP_CONNECTION_NOT_ALLOWED;
                    break;
                }
                case 30: {
                    error = Error.FILE_ALLOCATION_FAILED;
                    break;
                }
                case 29: {
                    error = Error.FAILED_TO_RENAME_FILE;
                    break;
                }
                case 28: {
                    error = Error.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                    break;
                }
                case 27: {
                    error = Error.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                    break;
                }
                case 26: {
                    error = Error.COMPLETED_NOT_ADDED_SUCCESSFULLY;
                    break;
                }
                case 25: {
                    error = Error.ENQUEUE_NOT_SUCCESSFUL;
                    break;
                }
                case 24: {
                    error = Error.REQUEST_DOES_NOT_EXIST;
                    break;
                }
                case 23: {
                    error = Error.FETCH_FILE_SERVER_INVALID_RESPONSE;
                    break;
                }
                case 22: {
                    error = Error.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                    break;
                }
                case 21: {
                    error = Error.FAILED_TO_UPDATE_REQUEST;
                    break;
                }
                case 20: {
                    error = Error.INVALID_CONTENT_HASH;
                    break;
                }
                case 19: {
                    error = Error.FETCH_FILE_SERVER_URL_INVALID;
                    break;
                }
                case 17: {
                    error = Error.FILE_NOT_FOUND;
                    break;
                }
                case 16: {
                    error = Error.UNKNOWN_IO_ERROR;
                    break;
                }
                case 15: {
                    error = Error.REQUEST_NOT_SUCCESSFUL;
                    break;
                }
                case 13: {
                    error = Error.REQUEST_WITH_ID_ALREADY_EXIST;
                    break;
                }
                case 11: {
                    error = Error.FETCH_DATABASE_ERROR;
                    break;
                }
                case 10: {
                    error = Error.DOWNLOAD_NOT_FOUND;
                    break;
                }
                case 9: {
                    error = Error.REQUEST_ALREADY_EXIST;
                    break;
                }
                case 8: {
                    error = Error.EMPTY_RESPONSE_FROM_SERVER;
                    break;
                }
                case 7: {
                    error = Error.NO_NETWORK_CONNECTION;
                    break;
                }
                case 6: {
                    error = Error.NO_STORAGE_SPACE;
                    break;
                }
                case 5: {
                    error = Error.WRITE_PERMISSION_DENIED;
                    break;
                }
                case 4: {
                    error = Error.HTTP_NOT_FOUND;
                    break;
                }
                case 3: {
                    error = Error.UNKNOWN_HOST;
                    break;
                }
                case 2: {
                    error = Error.CONNECTION_TIMED_OUT;
                    break;
                }
                case 1: {
                    error = Error.FILE_NOT_CREATED;
                    break;
                }
                case 0: {
                    error = Error.NONE;
                    break;
                }
                case -1: {
                    error = Error.UNKNOWN;
                    break;
                }
            }
            return error;
        }
    }
}
