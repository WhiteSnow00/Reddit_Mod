// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.IInterface;
import android.os.BaseBundle;
import a4.q0;
import android.media.Rating;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import androidx.versionedparcelable.ParcelImpl;
import android.os.IBinder;
import androidx.core.app.BundleCompat;
import android.media.session.MediaSession$Callback;
import android.os.Message;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;
import android.media.session.MediaSession$QueueItem;
import android.media.MediaDescription;
import ak0.n;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.BadParcelableException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.util.TypedValue;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import android.util.Log;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.text.TextUtils;
import android.content.Context;
import v3.a;
import java.util.ArrayList;

public final class MediaSessionCompat
{
    public static final int c;
    public static int d;
    public final MediaSessionCompat$d a;
    public final ArrayList<g> b;
    
    static {
        int c2;
        if (v3.a.a()) {
            c2 = 33554432;
        }
        else {
            c2 = 0;
        }
        c = c2;
    }
    
    public MediaSessionCompat(final Context context) {
        this.b = new ArrayList<g>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (!TextUtils.isEmpty((CharSequence)"RedditTalkRecordAudioPlayer")) {
            final int a = b5.a.a;
            final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            final List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            final int size = queryBroadcastReceivers.size();
            PendingIntent broadcast = null;
            ComponentName component;
            if (size == 1) {
                final ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                component = new ComponentName(activityInfo.packageName, activityInfo.name);
            }
            else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                component = null;
            }
            if (component == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (component != null) {
                final Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(component);
                broadcast = PendingIntent.getBroadcast(context, 0, intent2, MediaSessionCompat.c);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 29) {
                this.a = (MediaSessionCompat$d)new MediaSessionCompat.MediaSessionCompat$f(context);
            }
            else if (sdk_INT >= 28) {
                this.a = (MediaSessionCompat$d)new e(context);
            }
            else {
                this.a = new MediaSessionCompat$d(context);
            }
            Looper looper;
            if (Looper.myLooper() != null) {
                looper = Looper.myLooper();
            }
            else {
                looper = Looper.getMainLooper();
            }
            ((MediaSessionCompat$c)this.a).g((a)new c(), new Handler(looper));
            ((MediaSessionCompat$c)this.a).h(broadcast);
            new MediaControllerCompat(context, this);
            if (MediaSessionCompat.d == 0) {
                MediaSessionCompat.d = (int)(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
    
    public static void a(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
    
    public static PlaybackStateCompat b(final PlaybackStateCompat playbackStateCompat, final MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat a = playbackStateCompat;
        if (playbackStateCompat != null) {
            final long g = playbackStateCompat.g;
            final long n = -1L;
            if (g == -1L) {
                a = playbackStateCompat;
            }
            else {
                final int f = playbackStateCompat.f;
                if (f != 3 && f != 4) {
                    a = playbackStateCompat;
                    if (f != 5) {
                        return a;
                    }
                }
                final long m = playbackStateCompat.m;
                final long n2 = 0L;
                a = playbackStateCompat;
                if (m > 0L) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final long n3 = (long)(playbackStateCompat.i * (elapsedRealtime - m)) + playbackStateCompat.g;
                    long long1 = n;
                    if (mediaMetadataCompat != null) {
                        long1 = n;
                        if (((BaseBundle)mediaMetadataCompat.f).containsKey("android.media.metadata.DURATION")) {
                            long1 = ((BaseBundle)mediaMetadataCompat.f).getLong("android.media.metadata.DURATION", 0L);
                        }
                    }
                    if (long1 < 0L || n3 <= long1) {
                        if (n3 < 0L) {
                            long1 = n2;
                        }
                        else {
                            long1 = n3;
                        }
                    }
                    final PlaybackStateCompat.d d = new PlaybackStateCompat.d(playbackStateCompat);
                    final int f2 = playbackStateCompat.f;
                    final float i = playbackStateCompat.i;
                    d.b = f2;
                    d.c = long1;
                    d.i = elapsedRealtime;
                    d.e = i;
                    a = d.a();
                }
            }
        }
        return a;
    }
    
    public static Bundle c(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            ((BaseBundle)bundle).isEmpty();
            return bundle;
        }
        catch (final BadParcelableException ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
    
    public static final class QueueItem implements Parcelable
    {
        public static final Parcelable$Creator<QueueItem> CREATOR;
        public final MediaDescriptionCompat f;
        public final long g;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<QueueItem>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new QueueItem(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new QueueItem[n];
                }
            };
        }
        
        public QueueItem(final Parcel parcel) {
            this.f = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.g = parcel.readLong();
        }
        
        public QueueItem(final MediaDescriptionCompat f, final long g) {
            if (f == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (g != -1L) {
                this.f = f;
                this.g = g;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("MediaSession.QueueItem {Description=");
            k.append(this.f);
            k.append(", Id=");
            return n.o(k, this.g, " }");
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            this.f.writeToParcel(parcel, n);
            parcel.writeLong(this.g);
        }
        
        public static final class b
        {
            public static MediaSession$QueueItem a(final MediaDescription mediaDescription, final long n) {
                return new MediaSession$QueueItem(mediaDescription, n);
            }
            
            public static MediaDescription b(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getDescription();
            }
            
            public static long c(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getQueueId();
            }
        }
    }
    
    public static final class ResultReceiverWrapper implements Parcelable
    {
        public static final Parcelable$Creator<ResultReceiverWrapper> CREATOR;
        public ResultReceiver f;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<ResultReceiverWrapper>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new ResultReceiverWrapper(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new ResultReceiverWrapper[n];
                }
            };
        }
        
        public ResultReceiverWrapper(final Parcel parcel) {
            this.f = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            this.f.writeToParcel(parcel, n);
        }
    }
    
    public static final class Token implements Parcelable
    {
        public static final Parcelable$Creator<Token> CREATOR;
        public final Object f;
        public final Object g;
        public b h;
        public w5.c i;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<Token>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new Token(parcel.readParcelable((ClassLoader)null), null);
                }
                
                public final Object[] newArray(final int n) {
                    return new Token[n];
                }
            };
        }
        
        public Token(final Object g, final MediaSessionCompat$c$a h) {
            this.f = new Object();
            this.g = g;
            this.h = (b)h;
            this.i = null;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(Object g) {
            boolean b = true;
            if (this == g) {
                return true;
            }
            if (!(g instanceof Token)) {
                return false;
            }
            final Token token = (Token)g;
            g = this.g;
            if (g == null) {
                if (token.g != null) {
                    b = false;
                }
                return b;
            }
            final Object g2 = token.g;
            return g2 != null && g.equals(g2);
        }
        
        @Override
        public final int hashCode() {
            final Object g = this.g;
            if (g == null) {
                return 0;
            }
            return g.hashCode();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable((Parcelable)this.g, n);
        }
    }
    
    public abstract static class a
    {
        public final Object a;
        public final b b;
        public boolean c;
        public WeakReference<MediaSessionCompat.b> d;
        public MediaSessionCompat.a.a e;
        
        public a() {
            this.a = new Object();
            this.b = new b();
            this.d = new WeakReference<MediaSessionCompat.b>(null);
        }
        
        public final void a(final MediaSessionCompat.b b, final MediaSessionCompat.a.a a) {
            if (!this.c) {
                return;
            }
            boolean b2 = false;
            this.c = false;
            a.removeMessages(1);
            final PlaybackStateCompat f = b.f();
            long j;
            if (f == null) {
                j = 0L;
            }
            else {
                j = f.j;
            }
            final boolean b3 = f != null && f.f == 3;
            final boolean b4 = (0x204L & j) != 0x0L;
            if ((j & 0x202L) != 0x0L) {
                b2 = true;
            }
            if (b3 && b2) {
                this.d();
            }
            else if (!b3 && b4) {
                this.e();
            }
        }
        
        public void b() {
        }
        
        public final boolean c(final Intent intent) {
            if (Build$VERSION.SDK_INT >= 27) {
                return false;
            }
            Object o = this.a;
            synchronized (o) {
                final MediaSessionCompat.b b = this.d.get();
                final MediaSessionCompat.a.a e = this.e;
                monitorexit(o);
                if (b != null) {
                    if (e != null) {
                        final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                        if (keyEvent != null) {
                            if (keyEvent.getAction() == 0) {
                                o = b.c();
                                final int keyCode = keyEvent.getKeyCode();
                                if (keyCode != 79 && keyCode != 85) {
                                    this.a(b, e);
                                    return false;
                                }
                                if (keyEvent.getRepeatCount() == 0) {
                                    if (this.c) {
                                        e.removeMessages(1);
                                        this.c = false;
                                        b.f();
                                    }
                                    else {
                                        this.c = true;
                                        e.sendMessageDelayed(e.obtainMessage(1, o), (long)ViewConfiguration.getDoubleTapTimeout());
                                    }
                                }
                                else {
                                    this.a(b, e);
                                }
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        
        public void d() {
        }
        
        public void e() {
        }
        
        public void f() {
        }
        
        public void g(final long n) {
        }
        
        public void h() {
        }
        
        public final void i(final MediaSessionCompat.b b, final Handler handler) {
            synchronized (this.a) {
                this.d = new WeakReference<MediaSessionCompat.b>(b);
                final MediaSessionCompat.a.a e = this.e;
                final MediaSessionCompat.a.a a = null;
                if (e != null) {
                    e.removeCallbacksAndMessages((Object)null);
                }
                MediaSessionCompat.a.a e2 = a;
                if (b != null) {
                    if (handler == null) {
                        e2 = a;
                    }
                    else {
                        e2 = new MediaSessionCompat.a.a(handler.getLooper());
                    }
                }
                this.e = e2;
            }
        }
        
        public final class a extends Handler
        {
            public a(final Looper looper) {
                super(looper);
            }
            
            public final void handleMessage(final Message message) {
                if (message.what == 1) {
                    synchronized (MediaSessionCompat.a.this.a) {
                        final MediaSessionCompat.b b = MediaSessionCompat.a.this.d.get();
                        final MediaSessionCompat.a a = MediaSessionCompat.a.this;
                        final a e = a.e;
                        monitorexit(MediaSessionCompat.a.this.a);
                        if (b == null || a != b.b() || e == null) {
                            return;
                        }
                        b.a((z4.a)message.obj);
                        MediaSessionCompat.a.this.a(b, e);
                        b.a(null);
                    }
                }
            }
        }
        
        public final class b extends MediaSession$Callback
        {
            public static void b(final MediaSessionCompat$c mediaSessionCompat$c) {
                if (Build$VERSION.SDK_INT >= 28) {
                    return;
                }
                String e;
                if (TextUtils.isEmpty((CharSequence)(e = mediaSessionCompat$c.e()))) {
                    e = "android.media.session.MediaController";
                }
                ((MediaSessionCompat.b)mediaSessionCompat$c).a(new z4.a(e, -1, -1));
            }
            
            public final MediaSessionCompat$c a() {
                synchronized (MediaSessionCompat.a.this.a) {
                    MediaSessionCompat$c mediaSessionCompat$c = MediaSessionCompat.a.this.d.get();
                    monitorexit(MediaSessionCompat.a.this.a);
                    if (mediaSessionCompat$c == null || MediaSessionCompat.a.this != mediaSessionCompat$c.b()) {
                        mediaSessionCompat$c = null;
                    }
                    return mediaSessionCompat$c;
                }
            }
            
            public final void onCommand(String s, final Bundle bundle, final ResultReceiver resultReceiver) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        final Bundle bundle2 = new Bundle();
                        final Token b = a.b;
                        s = (String)b.f;
                        synchronized (s) {
                            final android.support.v4.media.session.b h = b.h;
                            monitorexit(s);
                            if (h == null) {
                                s = null;
                            }
                            else {
                                s = (String)((IInterface)h).asBinder();
                            }
                            BundleCompat.putBinder(bundle2, "android.support.v4.media.session.EXTRA_BINDER", (IBinder)s);
                            Object f = b.f;
                            synchronized (f) {
                                final w5.c i = b.i;
                                monitorexit(f);
                                if (i != null) {
                                    final Bundle bundle3 = new Bundle();
                                    f = new ParcelImpl(i);
                                    bundle3.putParcelable("a", (Parcelable)f);
                                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)bundle3);
                                }
                                resultReceiver.send(0, bundle2);
                            }
                        }
                    }
                    if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        final MediaSessionCompat.a a2 = MediaSessionCompat.a.this;
                        final MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        a2.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        final MediaSessionCompat.a a3 = MediaSessionCompat.a.this;
                        final MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        ((BaseBundle)bundle).getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        a3.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        final MediaSessionCompat.a a4 = MediaSessionCompat.a.this;
                        final MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        a4.getClass();
                    }
                    else if (!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        MediaSessionCompat.a.this.getClass();
                    }
                }
                catch (final BadParcelableException ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onCustomAction(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        final Uri uri = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE")) {
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        ((BaseBundle)bundle).getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        final Uri uri2 = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        ((BaseBundle)bundle).getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        ((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        ((BaseBundle)bundle).getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_RATING")) {
                        final RatingCompat ratingCompat = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        MediaSessionCompat.a.this.getClass();
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        MediaSessionCompat.a.this.getClass();
                    }
                    else {
                        MediaSessionCompat.a.this.getClass();
                    }
                }
                catch (final BadParcelableException ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onFastForward() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.b();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final boolean onMediaButtonEvent(final Intent intent) {
                final MediaSessionCompat$c a = this.a();
                boolean b = false;
                if (a == null) {
                    return false;
                }
                b(a);
                final boolean c = MediaSessionCompat.a.this.c(intent);
                ((MediaSessionCompat.b)a).a(null);
                if (c || super.onMediaButtonEvent(intent)) {
                    b = true;
                }
                return b;
            }
            
            public final void onPause() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.d();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPlay() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.e();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPlayFromMediaId(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPlayFromSearch(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPlayFromUri(final Uri uri, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPrepare() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPrepareFromMediaId(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPrepareFromSearch(final String s, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onPrepareFromUri(final Uri uri, final Bundle bundle) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onRewind() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.f();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSeekTo(final long n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.g(n);
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSetPlaybackSpeed(final float n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSetRating(final Rating rating) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                final MediaSessionCompat.a a2 = MediaSessionCompat.a.this;
                RatingCompat.a(rating);
                a2.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSkipToNext() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSkipToPrevious() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onSkipToQueueItem(final long n) {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.getClass();
                ((MediaSessionCompat.b)a).a(null);
            }
            
            public final void onStop() {
                final MediaSessionCompat$c a = this.a();
                if (a == null) {
                    return;
                }
                b(a);
                MediaSessionCompat.a.this.h();
                ((MediaSessionCompat.b)a).a(null);
            }
        }
    }
    
    public interface b
    {
        void a(final z4.a p0);
        
        MediaSessionCompat.a b();
        
        z4.a c();
        
        PlaybackStateCompat f();
    }
    
    public static class e extends MediaSessionCompat$d
    {
        public e(final Context context) {
            super(context);
        }
        
        public final void a(final z4.a a) {
        }
        
        public final z4.a c() {
            return new z4.a(q0.b(((MediaSessionCompat$c)this).a));
        }
    }
    
    public interface g
    {
        void a();
    }
}
