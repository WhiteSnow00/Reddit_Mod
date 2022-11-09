// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit;

import nf2.a0;
import com.raizlabs.android.dbflow.sql.language.BaseQueriable;
import com.raizlabs.android.dbflow.sql.language.BaseTransformable;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import javax.net.ssl.SSLException;
import org.xmlpull.v1.XmlPullParser;
import java.util.Iterator;
import com.reddit.domain.model.FileUploadResponse;
import java.io.Reader;
import java.io.StringReader;
import android.util.Xml;
import java.util.Map;
import okhttp3.RequestBody;
import okhttp3.MultipartBody$Part;
import w61.b$a;
import w61.b$b;
import com.reddit.type.MimeType;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.graphics.BitmapFactory;
import m70.a$a;
import com.reddit.domain.model.FileUploadLease;
import java.io.BufferedInputStream;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import e40.f;
import nf2.c0;
import nf2.g0;
import com.reddit.type.ReactType;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.reddit.data.model.v2.live.RedirectUpdater;
import t50.m;
import android.os.HandlerThread;
import com.reddit.logging.Step;
import com.reddit.logging.Scenario;
import java.io.IOException;
import java.util.ArrayList;
import com.reddit.domain.model.events.SubmitEvents;
import de.greenrobot.event.EventBus;
import android.text.TextUtils;
import nf2.t;
import io.reactivex.internal.functions.Functions;
import sf2.o;
import sf2.q;
import nf2.r;
import zf2.e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import zf2.g;
import com.reddit.postsubmit.data.RedditPostSubmitRepository;
import kz0.k;
import a4.u1;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Action;
import android.app.PendingIntent;
import com.reddit.data.model.VideoUpload_Table;
import com.raizlabs.android.dbflow.sql.language.SQLOperator;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.reddit.data.model.VideoUpload;
import ak0.n;
import java.io.Serializable;
import android.content.Intent;
import com.reddit.domain.model.DiscussionType;
import java.io.File;
import android.net.Uri;
import androidx.core.app.NotificationCompat$Action$Builder;
import android.content.Context;
import android.os.Build$VERSION;
import java.io.Closeable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import androidx.core.app.NotificationCompat$Builder;
import android.app.NotificationManager;
import java.util.concurrent.Future;
import j0.i;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import ge0.z;
import db0.l;
import jw0.c;
import db0.s;
import e80.d;
import d60.e0;
import l70.b;
import d60.d0;
import javax.inject.Inject;
import com.reddit.data.postsubmit.remote.AwsService;
import o41.j;
import androidx.appcompat.widget.e1;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import ng2.a;
import io.reactivex.subjects.PublishSubject;
import android.app.Service;

public class VideoUploadService extends Service
{
    public static final PublishSubject H;
    public static final a I;
    public static final PublishSubject J;
    public static final PublishSubject K;
    public static final AtomicInteger L;
    public volatile String A;
    public qf2.a B;
    public long C;
    public int D;
    public int E;
    public CompositeDisposable F;
    public final e1 G;
    public o41.j f;
    @Inject
    public AwsService g;
    @Inject
    public d0 h;
    @Inject
    public l70.b i;
    @Inject
    public e0 j;
    @Inject
    public e80.d k;
    @Inject
    public s l;
    @Inject
    public jw0.a m;
    @Inject
    public jw0.c n;
    @Inject
    public r20.a o;
    @Inject
    public l p;
    @Inject
    public rc0.d q;
    @Inject
    public z r;
    public final Handler s;
    public final AtomicBoolean t;
    public final VideoUploadService$a u;
    public final j0.i<String, Future<?>> v;
    public final j0.i<String, Integer> w;
    public NotificationManager x;
    public NotificationCompat$Builder y;
    public volatile wu2.b<String> z;
    
    static {
        H = PublishSubject.create();
        I = new a();
        J = PublishSubject.create();
        K = PublishSubject.create();
        L = new AtomicInteger(100);
    }
    
    public VideoUploadService() {
        this.s = new Handler();
        this.t = new AtomicBoolean(false);
        this.u = new ThreadPoolExecutor(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(10, (Comparator<? super E>)new c())) {
            public final <T> RunnableFuture<T> newTaskFor(final Runnable runnable, final T t) {
                return (RunnableFuture<T>)new uz0.a((RunnableFuture)super.newTaskFor(runnable, t), ((d)runnable).g);
            }
        };
        this.v = (j0.i<String, Future<?>>)new j0.i();
        this.w = (j0.i<String, Integer>)new j0.i();
        this.F = new CompositeDisposable();
        this.G = new e1(this, 19);
    }
    
    public static void a(final VideoUploadService videoUploadService, final Closeable closeable) {
        videoUploadService.getClass();
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final Exception ex) {}
    }
    
    public static int b(final VideoUploadService videoUploadService, final String s, final String s2) {
        videoUploadService.getClass();
        final int sdk_INT = Build$VERSION.SDK_INT;
        int incrementAndGet = -1;
        if (sdk_INT < 31) {
            incrementAndGet = VideoUploadService.L.incrementAndGet();
            (videoUploadService.y = new NotificationCompat$Builder((Context)videoUploadService, "notifications_video_upload").setSmallIcon(2131232697).setContentTitle((CharSequence)((Context)videoUploadService).getString(2131958046, new Object[] { s2 })).setCategory("progress").setPriority(-1).setOngoing(true).setContentIntent(videoUploadService.q.c2((Context)videoUploadService)).addAction(new NotificationCompat$Action$Builder(2131231927, (CharSequence)((Context)videoUploadService).getString(2131951733), videoUploadService.d(incrementAndGet, s)).build()).setSound((Uri)null).setVibrate((long[])null)).setProgress(0, 100, true);
            videoUploadService.startForeground(incrementAndGet, videoUploadService.y.build());
        }
        return incrementAndGet;
    }
    
    public static void c(final VideoUploadService videoUploadService, final Throwable t) {
        videoUploadService.getClass();
        videoUploadService.m.c((Throwable)VideoUploadException.access$100(t));
    }
    
    public static String e(final String s) {
        final int lastIndex = s.lastIndexOf(File.separator);
        String substring = s;
        if (lastIndex > 0) {
            substring = s;
            if (lastIndex < s.length() - 1) {
                substring = s.substring(lastIndex + 1);
            }
        }
        return substring;
    }
    
    public static Intent f(final Context context, final String s, final String s2, final boolean b, final String s3, final String s4, final DiscussionType discussionType, final boolean b2, final boolean b3) {
        final Intent intent = new Intent(context, (Class)VideoUploadService.class);
        intent.setAction("com.reddit.data.postsubmit.VideoUploadService.UPLOAD_ACTION");
        intent.putExtra("file_path", s);
        intent.putExtra("request_id", s2);
        intent.putExtra("is_gif", b);
        if (s3 != null) {
            intent.putExtra("submit_flair_text", s3);
        }
        if (s4 != null) {
            intent.putExtra("submit_flair_id", s4);
        }
        if (discussionType != null) {
            intent.putExtra("discussion_type", (Serializable)discussionType);
        }
        intent.putExtra("is_nsfw", b2);
        intent.putExtra("is_spoiler", b3);
        return intent;
    }
    
    public static String g(final int n) {
        switch (n) {
            default: {
                return n.k("INVALID STATE: ", n);
            }
            case 7: {
                return "VIDEO_POST_FAILED";
            }
            case 6: {
                return "VIDEO_UPLOAD_FAILED";
            }
            case 5: {
                return "VIDEO_POST_PUBLISHED";
            }
            case 4: {
                return "VIDEO_POST_QUEUED";
            }
            case 3: {
                return "VIDEO_UPLOAD_COMPLETE";
            }
            case 2: {
                return "VIDEO_UPLOAD_IN_PROGRESS";
            }
            case 1: {
                return "VIDEO_UPLOAD_QUEUED";
            }
            case 0: {
                return "VIDEO_UPLOAD_NOT_STARTED";
            }
        }
    }
    
    public static VideoUpload h(final String s) {
        return (VideoUpload)((BaseTransformable)SQLite.select(new IProperty[0]).from((Class)VideoUpload.class)).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.eq((Object)s) }).querySingle();
    }
    
    public static void l(final int n, final String s) {
        ((BaseQueriable)((BaseTransformable)SQLite.update((Class)VideoUpload.class).set(new SQLOperator[] { (SQLOperator)VideoUpload_Table.status.eq((Object)n) })).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.is((Object)s) })).execute();
    }
    
    public final PendingIntent d(final int n, final String s) {
        final Intent intent = new Intent((Context)this, (Class)VideoUploadService.class);
        intent.setAction("com.reddit.data.postsubmit.VideoUploadService.CANCEL_UPLOAD_ACTION");
        intent.putExtra("request_id", s);
        intent.putExtra("notification_id", n);
        return PendingIntent.getService((Context)this, 1, intent, 335544320);
    }
    
    public final boolean i() {
        final VideoUpload videoUpload = (VideoUpload)((BaseTransformable)SQLite.select(new IProperty[0]).from((Class)VideoUpload.class)).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.status.eq((Object)0) }).querySingle();
        if (videoUpload != null) {
            l(1, videoUpload.getRequestId());
            VideoUploadService.I.onNext((Object)new k(videoUpload.getRequestId(), 1));
            videoUpload.getRequestId();
            this.v.put((Object)videoUpload.getRequestId(), (Object)this.u.submit((Runnable)new h(videoUpload.getRequestId())));
            return true;
        }
        return false;
    }
    
    public final boolean j(final VideoUpload videoUpload) {
        if ((videoUpload.getStatus() == 3 || videoUpload.getStatus() == 7) && videoUpload.hasPostData()) {
            l(4, videoUpload.getRequestId());
            VideoUploadService.I.onNext((Object)new k(videoUpload.getRequestId(), 4));
            videoUpload.getRequestId();
            this.u.submit((Runnable)new e(videoUpload.getRequestId()));
            return true;
        }
        g(videoUpload.getStatus());
        return false;
    }
    
    public final void k(final VideoUpload videoUpload) {
        final int incrementAndGet = VideoUploadService.L.incrementAndGet();
        final PendingIntent c2 = this.q.c2((Context)this);
        final NotificationCompat$Action build = new NotificationCompat$Action$Builder(2131231927, (CharSequence)((Context)this).getString(2131951733), this.d(incrementAndGet, videoUpload.getRequestId())).build();
        final Intent intent = new Intent((Context)this, (Class)VideoUploadService.class);
        String action;
        if (videoUpload.getStatus() == 6) {
            action = "com.reddit.data.postsubmit.VideoUploadService.RETRY_UPLOAD_ACTION";
        }
        else {
            action = "com.reddit.data.postsubmit.VideoUploadService.RETRY_PUBLISH_POST_ACTION";
        }
        intent.setAction(action);
        intent.putExtra("notification_id", incrementAndGet);
        intent.putExtra("request_id", videoUpload.getRequestId());
        int n;
        if (videoUpload.getStatus() == 6) {
            n = 2;
        }
        else {
            n = 3;
        }
        final NotificationCompat$Builder setContentIntent = new NotificationCompat$Builder((Context)this, "notifications_video_upload").setSmallIcon(2131232697).setContentTitle((CharSequence)((Context)this).getString(2131958127)).setContentText((CharSequence)((Context)this).getString(2131958128, new Object[] { e(videoUpload.getFilePath()) })).setCategory("err").setPriority(0).setAutoCancel(true).addAction(new NotificationCompat$Action$Builder(2131231633, (CharSequence)((Context)this).getString(2131951894), PendingIntent.getService((Context)this, n, intent, 335544320)).build()).addAction(build).setContentIntent(c2);
        this.w.put((Object)videoUpload.getRequestId(), (Object)incrementAndGet);
        this.x.notify(incrementAndGet, setContentIntent.build());
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onCreate() {
        super.onCreate();
        final y90.e0 l0 = u1.L0((Context)this);
        this.g = (AwsService)new t50.b(l0).b.get();
        final d0 r1 = l0.r1();
        kz0.k.N((Object)r1);
        this.h = r1;
        final com.reddit.data.usecase.a s4 = l0.S4();
        kz0.k.N((Object)s4);
        this.i = (l70.b)s4;
        final e0 c3 = l0.C3();
        kz0.k.N((Object)c3);
        this.j = c3;
        final e80.d x8 = l0.x8();
        kz0.k.N((Object)x8);
        this.k = x8;
        final s n7 = l0.n7();
        kz0.k.N((Object)n7);
        this.l = n7;
        final jw0.a a = l0.a();
        kz0.k.N((Object)a);
        this.m = a;
        final kw0.a c4 = l0.C0();
        kz0.k.N((Object)c4);
        this.n = (jw0.c)c4;
        l0.K5();
        this.o = (r20.a)r20.b.a;
        final l d = l0.D();
        kz0.k.N((Object)d);
        this.p = d;
        final rc0.d i = l0.i();
        kz0.k.N((Object)i);
        this.q = i;
        final RedditPostSubmitRepository r2 = l0.R4();
        kz0.k.N((Object)r2);
        this.r = (z)r2;
        this.x = (NotificationManager)((Context)this).getSystemService("notification");
        this.p.o();
    }
    
    public final void onDestroy() {
        final qf2.a b = this.B;
        if (b != null) {
            b.dispose();
            this.B = null;
        }
        this.F.dispose();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, int n, int intExtra) {
        Label_0855: {
            if (intent != null && intent.getAction() != null) {
                final String action = intent.getAction();
                final String stringExtra = intent.getStringExtra("request_id");
                n = -1;
                intExtra = intent.getIntExtra("notification_id", -1);
                this.t.get();
                this.u.getQueue().size();
                action.getClass();
                switch (action) {
                    case "com.reddit.data.postsubmit.VideoUploadService.RETRY_UPLOAD_ACTION": {
                        n = 5;
                        break;
                    }
                    case "com.reddit.data.postsubmit.VideoUploadService.TRANSCODING_COMPLETE_ACTION": {
                        n = 4;
                        break;
                    }
                    case "com.reddit.data.postsubmit.VideoUploadService.RETRY_PUBLISH_POST_ACTION": {
                        n = 3;
                        break;
                    }
                    case "com.reddit.data.postsubmit.VideoUploadService.UPLOAD_ACTION": {
                        n = 2;
                        break;
                    }
                    case "com.reddit.data.postsubmit.VideoUploadService.CANCEL_UPLOAD_ACTION": {
                        n = 1;
                        break;
                    }
                    case "com.reddit.data.postsubmit.VideoUploadService.PUBLISH_POST_ACTION": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    if (n != 5) {
                                        break Label_0855;
                                    }
                                    if (intExtra >= 0) {
                                        this.x.cancel(intExtra);
                                    }
                                    final Integer n2 = (Integer)this.w.remove((Object)stringExtra);
                                    if (n2 != null) {
                                        this.x.cancel((int)n2);
                                    }
                                    final nf2.n onAssembly = RxJavaPlugins.onAssembly((nf2.n)new zf2.g((Callable)new u40.a(3, (Object)this, (Object)stringExtra)));
                                    final ia.c c = new ia.c(14);
                                    onAssembly.getClass();
                                    final nf2.n onAssembly2 = RxJavaPlugins.onAssembly((nf2.n)new zf2.e((r)onAssembly, (q)c));
                                    final a40.b b = new a40.b(5, (Object)this, (Object)stringExtra);
                                    onAssembly2.getClass();
                                    RxJavaPlugins.onAssembly((nf2.n)new io.reactivex.internal.operators.maybe.a((r)onAssembly2, (o)b)).u(mg2.a.b()).s((sf2.g)Functions.d, (sf2.g)Functions.e, (sf2.a)Functions.c);
                                    break Label_0855;
                                }
                                else {
                                    final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("transcoding_list");
                                    if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                                        this.F.add(nf2.t.fromIterable((Iterable)parcelableArrayListExtra).flatMap((o)new a40.b(6, (Object)this, (Object)new VideoUpload())).ignoreElements().y(mg2.a.b()).w());
                                    }
                                    break Label_0855;
                                }
                            }
                        }
                        else {
                            final String stringExtra2 = intent.getStringExtra("file_path");
                            final boolean booleanExtra = intent.getBooleanExtra("is_gif", false);
                            final String stringExtra3 = intent.getStringExtra("submit_flair_text");
                            final String stringExtra4 = intent.getStringExtra("submit_flair_id");
                            final DiscussionType discussionType = (DiscussionType)intent.getSerializableExtra("discussion_type");
                            final boolean booleanExtra2 = intent.getBooleanExtra("is_nsfw", false);
                            final boolean booleanExtra3 = intent.getBooleanExtra("is_spoiler", false);
                            if (TextUtils.isEmpty((CharSequence)stringExtra)) {
                                break Label_0855;
                            }
                            if (TextUtils.isEmpty((CharSequence)stringExtra2)) {
                                break Label_0855;
                            }
                            this.F.add(nf2.t.fromCallable((Callable)new t50.j(this, stringExtra, stringExtra2, booleanExtra, stringExtra3, stringExtra4, discussionType, booleanExtra2, booleanExtra3)).ignoreElements().y(mg2.a.b()).w());
                            break Label_0855;
                        }
                    }
                    else {
                        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                            if (stringExtra.equals(this.A)) {
                                if (this.z != null) {
                                    this.z.cancel();
                                }
                                this.stopForeground(true);
                                EventBus.getDefault().post((Object)new SubmitEvents.SubmitCancelEvent(stringExtra));
                            }
                            else {
                                final nf2.n onAssembly3 = RxJavaPlugins.onAssembly((nf2.n)new zf2.g((Callable)new t50.i(0, this, stringExtra)));
                                final ov.d d = new ov.d(6);
                                onAssembly3.getClass();
                                RxJavaPlugins.onAssembly((nf2.n)new io.reactivex.internal.operators.maybe.a((r)onAssembly3, (o)d)).u(mg2.a.b()).s((sf2.g)Functions.d, (sf2.g)Functions.e, (sf2.a)Functions.c);
                            }
                            final Future future = (Future)this.v.getOrDefault((Object)stringExtra, (Object)null);
                            if (future != null) {
                                future.cancel(true);
                            }
                        }
                        final Integer n3 = (Integer)this.w.remove((Object)stringExtra);
                        if (n3 != null) {
                            this.x.cancel((int)n3);
                        }
                        break Label_0855;
                    }
                }
                this.F.add(nf2.t.fromCallable((Callable)new t50.i(1, this, stringExtra)).ignoreElements().y(mg2.a.b()).w());
            }
        }
        if (this.u.getQueue().isEmpty()) {
            this.s.removeCallbacks((Runnable)this.G);
        }
        return 1;
    }
    
    public static final class SubmitException extends IOException
    {
        public SubmitException() {
            super("Submit video failed");
        }
        
        public SubmitException(final String s) {
            super(s);
        }
    }
    
    public static final class UploadCancelledException extends IOException
    {
        public UploadCancelledException() {
            super("Upload cancelled");
        }
    }
    
    public static final class UploadException extends IOException
    {
        public UploadException() {
            super("Upload failed");
        }
        
        public UploadException(final String s) {
            super(s);
        }
    }
    
    public static class VideoUploadException extends Throwable
    {
        public VideoUploadException(final String s, final VideoUploadService$a threadPoolExecutor) {
            super(s);
        }
        
        public VideoUploadException(final Throwable t, final VideoUploadService$a threadPoolExecutor) {
            super(t);
        }
        
        public static VideoUploadException access$100(final Throwable t) {
            return new NewFlowVideoUploadException(t, null);
        }
        
        public static class GQLVideoUploadException extends VideoUploadException
        {
            public GQLVideoUploadException(final String s, final VideoUploadService$a threadPoolExecutor) {
                super(s, (VideoUploadService$a)null);
            }
        }
        
        public static final class NewFlowVideoUploadException extends VideoUploadException
        {
            public NewFlowVideoUploadException(final Throwable t, final VideoUploadService$a threadPoolExecutor) {
                super(t, null);
            }
        }
    }
    
    public static class VideoUploadLeaseException extends Exception
    {
        public VideoUploadLeaseException(final String s, final VideoUploadService$a threadPoolExecutor) {
            super(s);
        }
    }
    
    public abstract class b implements Runnable
    {
        public abstract void a() throws Exception;
        
        public abstract void b(final Throwable p0);
        
        public void c(final boolean b) {
        }
        
        @Override
        public final void run() {
            VideoUploadService.this.t.set(true);
            final VideoUploadService f = VideoUploadService.this;
            f.s.removeCallbacks((Runnable)f.G);
        Label_0101_Outer:
            while (true) {
                while (true) {
                    Label_0166: {
                        try {
                            this.a();
                            try {
                                this.c(false);
                            }
                            finally {
                                final Throwable t;
                                VideoUploadService.c(VideoUploadService.this, t);
                            }
                            if (VideoUploadService.this.u.getQueue().isEmpty()) {
                                final VideoUploadService f2 = VideoUploadService.this;
                                f2.s.removeCallbacks((Runnable)f2.G);
                                f2.s.postDelayed((Runnable)f2.G, 60000L);
                            }
                            final VideoUploadService f3 = VideoUploadService.this;
                            break Label_0166;
                        }
                        finally {
                            boolean b;
                            try {
                                final Throwable t2;
                                this.b(t2);
                                try {
                                    VideoUploadService.c(VideoUploadService.this, t2);
                                    try {
                                        this.c(true);
                                    }
                                    finally {
                                        final Throwable t3;
                                        VideoUploadService.c(VideoUploadService.this, t3);
                                    }
                                    if (VideoUploadService.this.u.getQueue().isEmpty()) {
                                        final VideoUploadService f4 = VideoUploadService.this;
                                        continue Label_0101_Outer;
                                    }
                                    continue;
                                    final VideoUploadService f2;
                                    f2.t.set(false);
                                    return;
                                }
                                finally {}
                            }
                            finally {
                                b = false;
                            }
                            try {
                                this.c(b);
                            }
                            finally {
                                final Throwable t4;
                                VideoUploadService.c(VideoUploadService.this, t4);
                            }
                            if (VideoUploadService.this.u.getQueue().isEmpty()) {
                                final VideoUploadService f5 = VideoUploadService.this;
                                f5.s.removeCallbacks((Runnable)f5.G);
                                f5.s.postDelayed((Runnable)f5.G, 60000L);
                            }
                            VideoUploadService.this.t.set(false);
                        }
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public static final class c implements Comparator<Runnable>
    {
        @Override
        public final int compare(final Object o, final Object o2) {
            final Runnable runnable = (Runnable)o;
            final Runnable runnable2 = (Runnable)o2;
            int n = 0;
            if (runnable != null || runnable2 != null) {
                Label_0077: {
                    if (runnable != null) {
                        if (runnable2 != null) {
                            final int g = ((uz0.a)runnable).g;
                            final int g2 = ((uz0.a)runnable2).g;
                            if (g <= g2) {
                                if (g == g2) {
                                    return n;
                                }
                                break Label_0077;
                            }
                        }
                        n = -1;
                        return n;
                    }
                }
                n = 1;
            }
            return n;
        }
    }
    
    public abstract class d extends b
    {
        public final int g;
        
        public d(final VideoUploadService videoUploadService, final int g) {
            videoUploadService.super();
            this.g = g;
        }
    }
    
    public final class e extends VideoUploadService$l
    {
        public final /* synthetic */ VideoUploadService j;
        
        public e(final String s) {
            super(100, VideoUploadService.this, s);
        }
        
        public static void f(final e e, final d60.c.c c) {
            e.getClass();
            final boolean empty = c.b.isEmpty();
            String subreddit = null;
            if (empty) {
                e.j.n.a(Scenario.PostSubmission, Step.End, "video");
                if (c.a == null) {
                    throw new SubmitException();
                }
                e.e(5);
                final VideoUpload d = e.d();
                if (d != null) {
                    subreddit = d.getSubreddit();
                }
                final VideoUploadService j = e.j;
                final String a = c.a;
                j.getClass();
                final HandlerThread handlerThread = new HandlerThread("videoUpload", 1);
                ((Thread)handlerThread).start();
                j.f = (o41.j)j.j.a(Uri.parse(a), (RedirectUpdater)new m(j, subreddit, handlerThread));
                new Handler(handlerThread.getLooper()).postDelayed((Runnable)new s4.a(12, j, handlerThread), 60000L);
            }
            else {
                final String s = c.b.stream().map((Function<? super Object, ?>)new t50.n()).collect((Collector<? super Object, ?, String>)Collectors.joining(","));
                e.g(s);
                e.j.m.c((Throwable)new GQLVideoUploadException(s, (VideoUploadService$a)null));
            }
        }
        
        public final void a() throws Exception {
            final VideoUpload d = this.d();
            if (d != null) {
                final String discussionType = d.getDiscussionType();
                ReactType sequential = null;
                com.reddit.type.DiscussionType value;
                if (discussionType != null) {
                    value = com.reddit.type.DiscussionType.valueOf(d.getDiscussionType());
                }
                else {
                    value = null;
                }
                if (d.getParentPostId() != null) {
                    sequential = ReactType.SEQUENTIAL;
                }
                final c0 y = VideoUploadService.this.i.a(d.getSubreddit(), d.getTitle(), d.getBodyText(), d.getUploadUrl(), d.getPosterUrl(), d.isGif(), d.getFlairText(), d.getFlairId(), value, d.isNsfw(), d.isSpoiler(), d.getParentPostId(), sequential, Boolean.valueOf(d.isReactAllowed())).y(((r20.d)VideoUploadService.this.o).a());
                final in.a a = new in.a((Object)this, 6);
                y.getClass();
                RxJavaPlugins.onAssembly((c0)new cg2.e((g0)y, (sf2.g)a)).F((sf2.g)new e40.f((Object)this, 3), (sf2.g)Functions.e);
                return;
            }
            throw new IOException("Video entry in DB was deleted after upload was scheduled");
        }
        
        public final void b(final Throwable t) {
            this.g(t.getMessage());
        }
        
        public final void c(final boolean b) {
            if (!b) {
                EventBus.getDefault().postSticky((Object)new SubmitEvents.LegacySubmitVideoResultEvent(super.h));
            }
        }
        
        public final void g(String s) {
            this.e(7);
            final VideoUpload d = this.d();
            if (d != null) {
                VideoUploadService.this.k(d);
            }
            String s2 = ((Context)VideoUploadService.this).getString(2131953398);
            if (s.equals("Submit video failed")) {
                s = (s2 = ((Context)VideoUploadService.this).getString(2131953397));
                if (d != null) {
                    final String uploadError = d.getUploadError();
                    s2 = s;
                    if (!TextUtils.isEmpty((CharSequence)uploadError)) {
                        s2 = uploadError;
                    }
                }
            }
            EventBus.getDefault().post((Object)new SubmitEvents.SubmitErrorEvent(super.h, new Exception(s2)));
        }
    }
    
    public static final class f implements Parcelable
    {
        public static final Parcelable$Creator<f> CREATOR;
        public final String f;
        public final boolean g;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new f(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new f[n];
                }
            };
        }
        
        public f(final Parcel parcel) {
            this.f = parcel.readString();
            this.g = (parcel.readByte() != 0);
        }
        
        public f(final String f) {
            this.f = f;
            this.g = true;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.f);
            parcel.writeByte((byte)(byte)(this.g ? 1 : 0));
        }
    }
    
    public static final class g
    {
        public final String a;
        public final Throwable b;
        
        public g(final String a, final Throwable b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o != null && g.class == o.getClass() && this.a.equals(((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
    }
    
    public final class h extends VideoUploadService$l
    {
        public int j;
        public BufferedInputStream k;
        public qf2.a l;
        public String m;
        public String n;
        public final /* synthetic */ VideoUploadService o;
        
        public h(final String s) {
            super(0, VideoUploadService.this, s);
            this.k = null;
            this.l = null;
        }
        
        public static String h(final FileUploadLease fileUploadLease) {
            String s = fileUploadLease.getAction();
            final PublishSubject h = VideoUploadService.H;
            if (!"https".equals(Uri.parse(s).getScheme())) {
                s = ak0.m.l("https:", s);
            }
            return s;
        }
        
        public static String i(a$a a, final String s) throws UploadException {
            a = a.a(s);
            if (a != null) {
                return a.b;
            }
            throw new UploadException(a40.f.n("Key [", s, "] missing in upload response"));
        }
        
        public final void a() throws Exception {
            VideoUploadService.this.C = System.currentTimeMillis();
            VideoUploadService.this.A = super.h;
            final int n = -1;
            this.j = -1;
            this.e(2);
            final VideoUpload d = this.d();
            if (d != null) {
                final String filePath = d.getFilePath();
                final VideoUpload d2 = this.d();
                if (d2 != null) {
                    final String thumbnail = d2.getThumbnail();
                    final VideoUploadService o = VideoUploadService.this;
                    final PublishSubject h = VideoUploadService.H;
                    o.getClass();
                    final String e = VideoUploadService.e(filePath);
                    final String s = null;
                    Bitmap decodeFile = null;
                    Label_0122: {
                        if (thumbnail != null) {
                            final File file = new File(thumbnail);
                            if (file.exists()) {
                                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                break Label_0122;
                            }
                        }
                        decodeFile = null;
                    }
                    Bitmap frameAtTime = decodeFile;
                    if (decodeFile == null) {
                        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource((Context)VideoUploadService.this, Uri.parse(filePath));
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) * 1000L / 2L, 2);
                        if (frameAtTime == null) {
                            throw new IOException(a40.f.n("Failed to extract bitmap for cover image from [", filePath, "]"));
                        }
                    }
                    VideoUploadService.this.D = frameAtTime.getWidth();
                    VideoUploadService.this.E = frameAtTime.getHeight();
                    final String j = this.j(frameAtTime);
                    final int width = frameAtTime.getWidth();
                    final int height = frameAtTime.getHeight();
                    Bitmap scaledBitmap;
                    if (width <= 640 && height <= 640) {
                        scaledBitmap = frameAtTime;
                    }
                    else {
                        int n2;
                        if (width > height) {
                            n2 = width;
                        }
                        else {
                            n2 = height;
                        }
                        final float n3 = 640.0f / n2;
                        scaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int)(width * n3 + 0.5f), (int)(height * n3 + 0.5f), false);
                    }
                    String i;
                    if (scaledBitmap != frameAtTime) {
                        i = this.j(scaledBitmap);
                    }
                    else {
                        i = j;
                    }
                    ((BaseQueriable)((BaseTransformable)SQLite.update((Class)VideoUpload.class).set(new SQLOperator[] { (SQLOperator)VideoUpload_Table.thumbnail.eq((Object)i) })).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.is((Object)super.h) })).execute();
                    final j k = new j(j, i);
                    Label_0521: {
                        final Throwable t2;
                        try {
                            final FileUploadLease f = this.f(e);
                            this.g(j);
                            final FileUploadResponse c = VideoUploadService.this.h.c(h(f), this.k, e, f.getFields());
                            if (c.getSuccess() && !TextUtils.isEmpty((CharSequence)c.getFileUrl())) {
                                c.getFileUrl();
                                c.getFileUrl();
                                VideoUploadService.a(VideoUploadService.this, this.k);
                                this.k = null;
                                break Label_0521;
                            }
                            throw new UploadException("image upload failed");
                        }
                        finally {
                            final h h2 = this;
                            final VideoUploadService videoUploadService = h2.o;
                            final Throwable t = t2;
                            VideoUploadService.c(videoUploadService, t);
                            final h h3 = this;
                            final VideoUploadService videoUploadService2 = h3.o;
                            final h h4 = this;
                            final BufferedInputStream bufferedInputStream = h4.k;
                            VideoUploadService.a(videoUploadService2, bufferedInputStream);
                            final h h5 = this;
                            final BufferedInputStream bufferedInputStream2 = null;
                            h5.k = bufferedInputStream2;
                            final Object o3;
                            final Object o2 = o3 = null;
                        }
                        try {
                            final h h2 = this;
                            final VideoUploadService videoUploadService = h2.o;
                            final Throwable t = t2;
                            VideoUploadService.c(videoUploadService, t);
                            final h h3 = this;
                            final VideoUploadService videoUploadService2 = h3.o;
                            final h h4 = this;
                            final BufferedInputStream bufferedInputStream = h4.k;
                            VideoUploadService.a(videoUploadService2, bufferedInputStream);
                            final h h5 = this;
                            final BufferedInputStream bufferedInputStream2 = null;
                            h5.k = bufferedInputStream2;
                            final Object o3 = null;
                            if (!k.b.equals(k.a)) {
                                new File(k.b).delete();
                            }
                            VideoUploadService.this.getClass();
                            final String e2 = VideoUploadService.e(filePath);
                            final VideoUpload d3 = this.d();
                            if (d3 != null && d3.hasPostData()) {
                                this.j = VideoUploadService.b(VideoUploadService.this, super.h, e2);
                            }
                            this.l = ((t)VideoUploadService.H).filter((q)new sa.o((Object)this, 11)).throttleLast(500L, TimeUnit.MILLISECONDS).distinctUntilChanged().subscribe((sf2.g)new t50.o(0, (Object)this, (Object)e2));
                            this.g(filePath);
                            final w61.b b = (w61.b)VideoUploadService.this.r.z(e2, MimeType.MP4).e();
                            if (!(b instanceof b$b)) {
                                String a;
                                if ((a = ((b$a)b).a) == null) {
                                    a = "video upload failed";
                                }
                                throw new VideoUploadLeaseException(a, (VideoUploadService$a)null);
                            }
                            final FileUploadLease a2 = ((b$b)b).a;
                            final String h6 = h(a2);
                            final j0.b b2 = new j0.b(a2.getFields().size());
                            for (final FileUploadLease.Field field : a2.getFields()) {
                                final String value = field.value;
                                if (value != null) {
                                    ((j0.i)b2).put((Object)field.name, (Object)value);
                                }
                            }
                            final v50.a a3 = new v50.a(new File(filePath), super.h, new ia.c(15));
                            final VideoUploadService o4 = VideoUploadService.this;
                            final PublishSubject h7 = VideoUploadService.H;
                            o4.getClass();
                            final MultipartBody$Part formData = MultipartBody$Part.createFormData("file", VideoUploadService.e(filePath), (RequestBody)a3);
                            final VideoUploadService o5 = VideoUploadService.this;
                            o5.z = o5.g.uploadFile(h6, (Map<String, String>)b2, formData);
                            final String s2 = (String)VideoUploadService.this.z.execute().b;
                            final XmlPullParser pullParser = Xml.newPullParser();
                            pullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                            pullParser.setInput((Reader)new StringReader(s2));
                            final a$a a4 = m70.a.a(pullParser);
                            if (a4.c.equalsIgnoreCase("Error")) {
                                final a$a a5 = a4.a("Message");
                                String b3 = s;
                                if (a5 != null) {
                                    b3 = a5.b;
                                }
                                if (b3 == null) {
                                    b3 = "Server error on upload request";
                                }
                                throw new UploadException(b3);
                            }
                            this.m = i(a4, "Location");
                            final FileUploadResponse fileUploadResponse = new FileUploadResponse(this.m, i(a4, "Key"), true);
                            if (VideoUploadService.this.z != null && VideoUploadService.this.z.isCanceled()) {
                                throw new UploadCancelledException();
                            }
                            if (fileUploadResponse.getSuccess()) {
                                final String fileKey = fileUploadResponse.getFileKey();
                                int lastIndex = n;
                                if (fileKey != null) {
                                    lastIndex = fileKey.lastIndexOf(47);
                                }
                                String substring = fileKey;
                                if (lastIndex >= 0) {
                                    substring = fileKey.substring(lastIndex + 1);
                                }
                                ((BaseQueriable)((BaseTransformable)SQLite.update((Class)VideoUpload.class).set(new SQLOperator[] { (SQLOperator)VideoUpload_Table.status.eq((Object)3), (SQLOperator)VideoUpload_Table.uploadUrl.eq((Object)this.m), (SQLOperator)VideoUpload_Table.posterUrl.eq(o3), (SQLOperator)VideoUpload_Table.videoKey.eq((Object)substring) })).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.is((Object)super.h) })).execute();
                                VideoUploadService.I.onNext((Object)new k(super.h, 3));
                                final VideoUploadService o6 = VideoUploadService.this;
                                final String h8 = super.h;
                                o6.getClass();
                                final VideoUpload h9 = VideoUploadService.h(h8);
                                if (h9 != null) {
                                    o6.j(h9);
                                }
                                return;
                            }
                            throw new UploadException("Upload executor: Upload failed");
                        }
                        finally {
                            VideoUploadService.a(VideoUploadService.this, this.k);
                            this.k = null;
                        }
                    }
                }
                throw new IOException("Video entry in DB was deleted after upload was scheduled");
            }
            throw new IOException("Video entry in DB was deleted after upload was scheduled");
        }
        
        public final void b(final Throwable t) {
            if (t instanceof SSLException) {
                this.n = ((Context)VideoUploadService.this).getString(2131958129);
            }
            else {
                this.n = t.getMessage();
            }
            final Future future = (Future)VideoUploadService.this.v.getOrDefault((Object)super.h, (Object)null);
            final VideoUpload d = this.d();
            if (!(t instanceof UploadCancelledException) && (future == null || !future.isCancelled())) {
                if (d != null) {
                    final int n = d.getAttempts() + 1;
                    int status;
                    if (n < 1) {
                        status = 0;
                    }
                    else {
                        status = 6;
                    }
                    d.setStatus(status);
                    ((BaseQueriable)((BaseTransformable)SQLite.update((Class)VideoUpload.class).set(new SQLOperator[] { (SQLOperator)VideoUpload_Table.attempts.eq((Object)n), (SQLOperator)VideoUpload_Table.status.eq((Object)status) })).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.is((Object)super.h) })).execute();
                    VideoUploadService.I.onNext((Object)new k(super.h, status));
                    if (d.hasPostData()) {
                        VideoUploadService.this.k(d);
                    }
                }
                ((a0)VideoUploadService.J).onNext((Object)new g(super.h, t));
            }
            else {
                if (d != null) {
                    final String thumbnail = d.getThumbnail();
                    if (thumbnail != null) {
                        new File(thumbnail).delete();
                    }
                    d.delete();
                }
                ((a0)VideoUploadService.K).onNext((Object)super.h);
            }
        }
        
        public final void c(final boolean b) {
            VideoUploadService.this.z = null;
            VideoUploadService.a(VideoUploadService.this, this.k);
            this.k = null;
            final qf2.a l = this.l;
            if (l != null) {
                l.dispose();
            }
            if (this.j >= 0) {
                VideoUploadService.this.stopForeground(true);
                this.j = -1;
            }
            final VideoUploadService o = VideoUploadService.this;
            o.F.add(nf2.t.fromCallable((Callable)new wu.c((Object)o, 4)).subscribeOn(mg2.a.b()).subscribe());
            VideoUploadService.this.v.remove((Object)super.h);
            VideoUploadService.this.A = null;
            final VideoUpload d = this.d();
            if (d != null) {
                final VideoUploadService o2 = VideoUploadService.this;
                final String n = this.n;
                o2.getClass();
                ((BaseQueriable)((BaseTransformable)SQLite.update((Class)VideoUpload.class).set(new SQLOperator[] { (SQLOperator)VideoUpload_Table.uploadDuration.eq((Object)(System.currentTimeMillis() - o2.C)), (SQLOperator)VideoUpload_Table.uploadError.eq((Object)n), (SQLOperator)VideoUpload_Table.videoWidth.eq((Object)o2.D), (SQLOperator)VideoUpload_Table.videoHeight.eq((Object)o2.E) })).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.id.is((Object)d.getId()) })).execute();
            }
        }
        
        public final FileUploadLease f(String a) throws UploadException {
            final w61.b b = (w61.b)VideoUploadService.this.r.s(a, "image/png", MimeType.PNG).e();
            if (b instanceof b$b) {
                return ((b$b)b).a;
            }
            if ((a = ((b$a)b).a) == null) {
                a = "image upload failed";
            }
            throw new UploadException(a);
        }
        
        public final void g(final String s) throws IOException {
            final InputStream openInputStream = ((Context)VideoUploadService.this).getContentResolver().openInputStream(Uri.fromFile(new File(s)));
            if (openInputStream != null) {
                this.k = new BufferedInputStream(openInputStream, 65536);
                return;
            }
            throw new IOException(ak0.m.l("Failed to open input stream for ", s));
        }
        
        public final String j(final Bitmap bitmap) throws IOException {
            final File e = et0.a.e((Context)VideoUploadService.this, ".png");
            Closeable closeable = null;
            try {
                final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e), 65536);
                try {
                    bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)bufferedOutputStream);
                    final String absolutePath = e.getAbsolutePath();
                    VideoUploadService.a(VideoUploadService.this, bufferedOutputStream);
                    return absolutePath;
                }
                finally {
                    closeable = bufferedOutputStream;
                }
            }
            finally {}
            try {
                final Throwable t;
                VideoUploadService.c(VideoUploadService.this, t);
                throw t;
            }
            finally {
                VideoUploadService.a(VideoUploadService.this, closeable);
            }
        }
    }
    
    public static final class i
    {
        public final String a;
        public final float b;
        
        public i(final String a, final float b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && i.class == o.getClass()) {
                final i i = (i)o;
                if (Float.compare(i.b, this.b) != 0 || !this.a.equals(i.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final float b = this.b;
            int floatToIntBits;
            if (b != 0.0f) {
                floatToIntBits = Float.floatToIntBits(b);
            }
            else {
                floatToIntBits = 0;
            }
            return hashCode * 31 + floatToIntBits;
        }
    }
    
    public static final class j
    {
        public final String a;
        public final String b;
        
        public j(final String b, final String a) {
            this.b = b;
            this.a = a;
        }
    }
    
    public static final class k
    {
        public final String a;
        public final int b;
        
        public k(final String a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && k.class == o.getClass()) {
                final k k = (k)o;
                if (this.b != k.b || !this.a.equals(k.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
    }
}
