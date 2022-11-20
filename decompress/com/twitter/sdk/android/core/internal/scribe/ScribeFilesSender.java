// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import okhttp3.Request$Builder;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import android.text.TextUtils;
import okhttp3.ResponseBody;
import ku2.w;
import ku2.x;
import okhttp3.OkHttpClient;
import okhttp3.Call$Factory;
import java.util.Objects;
import ku2.x$b;
import com.twitter.sdk.android.core.internal.network.GuestAuthInterceptor;
import com.twitter.sdk.android.core.internal.network.OAuth1aInterceptor;
import okhttp3.Interceptor;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import okhttp3.OkHttpClient$Builder;
import java.util.Iterator;
import java.io.Closeable;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import java.util.concurrent.atomic.AtomicReference;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.GuestSessionProvider;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class ScribeFilesSender implements FilesSender
{
    private static final byte[] COMMA;
    private static final byte[] END_JSON_ARRAY;
    private static final String SEND_FILE_FAILURE_ERROR = "Failed sending files";
    private static final byte[] START_JSON_ARRAY;
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private final ExecutorService executorService;
    private final GuestSessionProvider guestSessionProvider;
    private final IdManager idManager;
    private final long ownerId;
    private final ScribeConfig scribeConfig;
    private final AtomicReference<ScribeFilesSender.ScribeFilesSender$ScribeService> scribeService;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;
    
    static {
        START_JSON_ARRAY = new byte[] { 91 };
        COMMA = new byte[] { 44 };
        END_JSON_ARRAY = new byte[] { 93 };
    }
    
    public ScribeFilesSender(final Context context, final ScribeConfig scribeConfig, final long ownerId, final TwitterAuthConfig authConfig, final SessionManager<? extends Session<TwitterAuthToken>> sessionManager, final GuestSessionProvider guestSessionProvider, final ExecutorService executorService, final IdManager idManager) {
        this.context = context;
        this.scribeConfig = scribeConfig;
        this.ownerId = ownerId;
        this.authConfig = authConfig;
        this.sessionManager = sessionManager;
        this.guestSessionProvider = guestSessionProvider;
        this.executorService = executorService;
        this.idManager = idManager;
        this.scribeService = new AtomicReference<ScribeFilesSender.ScribeFilesSender$ScribeService>();
    }
    
    public static byte[] access$000() {
        return ScribeFilesSender.COMMA;
    }
    
    private Session getSession(final long n) {
        return this.sessionManager.getSession(n);
    }
    
    private boolean hasApiAdapter() {
        return this.getScribeService() != null;
    }
    
    private boolean isValidSession(final Session session) {
        return session != null && session.getAuthToken() != null;
    }
    
    public String getScribeEventsAsJsonArrayString(final List<File> list) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        final boolean[] array = { false };
        byteArrayOutputStream.write(ScribeFilesSender.START_JSON_ARRAY);
        for (final File file : list) {
            Object o = null;
            QueueFile$ElementReader queueFile$ElementReader = null;
            try {
                final QueueFile queueFile = new QueueFile(file);
                try {
                    o = new QueueFile$ElementReader(this, array, byteArrayOutputStream) {
                        public final ScribeFilesSender this$0;
                        public final boolean[] val$appendComma;
                        public final ByteArrayOutputStream val$out;
                        
                        public void read(final InputStream inputStream, final int n) throws IOException {
                            final byte[] array = new byte[n];
                            inputStream.read(array);
                            final boolean[] val$appendComma = this.val$appendComma;
                            if (val$appendComma[0]) {
                                this.val$out.write(ScribeFilesSender.access$000());
                            }
                            else {
                                val$appendComma[0] = true;
                            }
                            this.val$out.write(array);
                        }
                    };
                    queueFile.forEach((QueueFile$ElementReader)o);
                    CommonUtils.closeQuietly((Closeable)queueFile);
                }
                finally {}
            }
            finally {
                queueFile$ElementReader = (QueueFile$ElementReader)o;
            }
            CommonUtils.closeQuietly((Closeable)queueFile$ElementReader);
        }
        byteArrayOutputStream.write(ScribeFilesSender.END_JSON_ARRAY);
        return byteArrayOutputStream.toString("UTF-8");
    }
    
    public ScribeFilesSender.ScribeFilesSender$ScribeService getScribeService() {
        synchronized (this) {
            if (this.scribeService.get() == null) {
                final Session session = this.getSession(this.ownerId);
                OkHttpClient b;
                if (this.isValidSession(session)) {
                    b = new OkHttpClient$Builder().certificatePinner(OkHttpClientHelper.getCertificatePinner()).addInterceptor((Interceptor)new ConfigRequestInterceptor(this.scribeConfig, this.idManager)).addInterceptor((Interceptor)new OAuth1aInterceptor((Session<? extends TwitterAuthToken>)session, this.authConfig)).build();
                }
                else {
                    b = new OkHttpClient$Builder().certificatePinner(OkHttpClientHelper.getCertificatePinner()).addInterceptor((Interceptor)new ConfigRequestInterceptor(this.scribeConfig, this.idManager)).addInterceptor((Interceptor)new GuestAuthInterceptor(this.guestSessionProvider)).build();
                }
                final x$b x$b = new x$b();
                x$b.c(this.scribeConfig.baseUrl);
                Objects.requireNonNull((Call$Factory)b, "client == null");
                x$b.b = (Call$Factory)b;
                final x d = x$b.d();
                final AtomicReference<ScribeFilesSender.ScribeFilesSender$ScribeService> scribeService = this.scribeService;
                while (!scribeService.compareAndSet(null, (ScribeFilesSender.ScribeFilesSender$ScribeService)d.b((Class)ScribeFilesSender.ScribeFilesSender$ScribeService.class))) {
                    if (scribeService.get() != null) {
                        break;
                    }
                }
            }
            return this.scribeService.get();
        }
    }
    
    public boolean send(final List<File> list) {
        if (this.hasApiAdapter()) {
            try {
                final String scribeEventsAsJsonArrayString = this.getScribeEventsAsJsonArrayString(list);
                CommonUtils.logControlled(this.context, scribeEventsAsJsonArrayString);
                final w<ResponseBody> upload = this.upload(scribeEventsAsJsonArrayString);
                if (upload.a() == 200) {
                    return true;
                }
                CommonUtils.logControlledError(this.context, "Failed sending files", (Throwable)null);
                if (upload.a() == 500 || upload.a() == 400) {
                    return true;
                }
                return false;
            }
            catch (final Exception ex) {
                CommonUtils.logControlledError(this.context, "Failed sending files", (Throwable)ex);
                return false;
            }
        }
        CommonUtils.logControlled(this.context, "Cannot attempt upload at this time");
        return false;
    }
    
    public void setScribeService(final ScribeFilesSender.ScribeFilesSender$ScribeService scribeFilesSender$ScribeService) {
        this.scribeService.set(scribeFilesSender$ScribeService);
    }
    
    public w<ResponseBody> upload(final String s) throws IOException {
        final ScribeFilesSender.ScribeFilesSender$ScribeService scribeService = this.getScribeService();
        if (!TextUtils.isEmpty((CharSequence)this.scribeConfig.sequence)) {
            return (w<ResponseBody>)scribeService.uploadSequence(this.scribeConfig.sequence, s).execute();
        }
        final ScribeConfig scribeConfig = this.scribeConfig;
        return (w<ResponseBody>)scribeService.upload(scribeConfig.pathVersion, scribeConfig.pathType, s).execute();
    }
    
    public static class ConfigRequestInterceptor implements Interceptor
    {
        private static final String CLIENT_UUID_HEADER = "X-Client-UUID";
        private static final String POLLING_HEADER = "X-Twitter-Polling";
        private static final String POLLING_HEADER_VALUE = "true";
        private static final String USER_AGENT_HEADER = "User-Agent";
        private final IdManager idManager;
        private final ScribeConfig scribeConfig;
        
        public ConfigRequestInterceptor(final ScribeConfig scribeConfig, final IdManager idManager) {
            this.scribeConfig = scribeConfig;
            this.idManager = idManager;
        }
        
        public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
            final Request$Builder builder = interceptor$Chain.request().newBuilder();
            if (!TextUtils.isEmpty((CharSequence)this.scribeConfig.userAgent)) {
                builder.header("User-Agent", this.scribeConfig.userAgent);
            }
            if (!TextUtils.isEmpty((CharSequence)this.idManager.getDeviceUUID())) {
                builder.header("X-Client-UUID", this.idManager.getDeviceUUID());
            }
            builder.header("X-Twitter-Polling", "true");
            return interceptor$Chain.proceed(builder.build());
        }
    }
}
