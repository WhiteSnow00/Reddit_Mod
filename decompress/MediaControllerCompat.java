// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.support.v4.media.MediaDescriptionCompat;
import android.media.session.MediaSession$QueueItem;
import java.util.List;
import android.media.session.PlaybackState$CustomAction;
import android.media.session.PlaybackState;
import android.os.Parcel;
import android.media.MediaMetadata;
import androidx.media.AudioAttributesCompat;
import android.media.session.MediaController$PlaybackInfo;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import android.os.RemoteException;
import android.util.Log;
import android.os.ResultReceiver;
import android.os.Bundle;
import android.media.session.MediaController;
import android.media.session.MediaSession$Token;
import java.util.HashMap;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;

public final class MediaControllerCompat
{
    public MediaControllerCompat(final Context context, final MediaSessionCompat mediaSessionCompat) {
        new ConcurrentHashMap();
        if (mediaSessionCompat != null) {
            final MediaSessionCompat.Token b = ((MediaSessionCompat$c)mediaSessionCompat.a).b;
            if (Build$VERSION.SDK_INT >= 29) {
                new MediaControllerCompat.MediaControllerCompat$b(context, b);
            }
            else {
                new MediaControllerImplApi21(context, b);
            }
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }
    
    public static class MediaControllerImplApi21
    {
        public final Object a;
        public final ArrayList b;
        public HashMap<MediaControllerCompat.a, a> c;
        public final MediaSessionCompat.Token d;
        
        public MediaControllerImplApi21(final Context context, final MediaSessionCompat.Token d) {
            this.a = new Object();
            this.b = new ArrayList();
            this.c = new HashMap<MediaControllerCompat.a, a>();
            this.d = d;
            final MediaController mediaController = new MediaController(context, (MediaSession$Token)d.g);
            synchronized (d.f) {
                final b h = d.h;
                monitorexit(d.f);
                if (h == null) {
                    mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle)null, (ResultReceiver)new ExtraBinderRequestResultReceiver(this));
                }
            }
        }
        
        public final void a() {
            final MediaSessionCompat.Token d = this.d;
            Object f = d.f;
            synchronized (f) {
                final b h = d.h;
                monitorexit(f);
                if (h == null) {
                    return;
                }
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    f = iterator.next();
                    final a a = new a((MediaControllerCompat.a)f);
                    this.c.put((MediaControllerCompat.a)f, a);
                    ((MediaControllerCompat.a)f).a = a;
                    try {
                        final MediaSessionCompat.Token d2 = this.d;
                        synchronized (d2.f) {
                            final b h2 = d2.h;
                            monitorexit(d2.f);
                            h2.T((android.support.v4.media.session.a)a);
                        }
                    }
                    catch (final RemoteException f) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)f);
                    }
                    break;
                }
                this.b.clear();
            }
        }
        
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver
        {
            public WeakReference<MediaControllerImplApi21> f;
            
            public ExtraBinderRequestResultReceiver(final MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler)null);
                this.f = new WeakReference<MediaControllerImplApi21>(mediaControllerImplApi21);
            }
            
            public final void onReceiveResult(final int p0, final Bundle p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f:Ljava/lang/ref/WeakReference;
                //     4: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
                //     7: checkcast       Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
                //    10: astore_3       
                //    11: aload_3        
                //    12: ifnull          245
                //    15: aload_2        
                //    16: ifnonnull       22
                //    19: goto            245
                //    22: aload_3        
                //    23: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:Ljava/lang/Object;
                //    26: astore          4
                //    28: aload           4
                //    30: monitorenter   
                //    31: aload_3        
                //    32: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.d:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //    35: astore          5
                //    37: aload_2        
                //    38: ldc             "android.support.v4.media.session.EXTRA_BINDER"
                //    40: invokestatic    androidx/core/app/BundleCompat.getBinder:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
                //    43: astore          6
                //    45: getstatic       android/support/v4/media/session/b$a.a:I
                //    48: istore_1       
                //    49: aconst_null    
                //    50: astore          7
                //    52: aload           6
                //    54: ifnonnull       63
                //    57: aconst_null    
                //    58: astore          6
                //    60: goto            108
                //    63: aload           6
                //    65: ldc             "android.support.v4.media.session.IMediaSession"
                //    67: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
                //    72: astore          8
                //    74: aload           8
                //    76: ifnull          97
                //    79: aload           8
                //    81: instanceof      Landroid/support/v4/media/session/b;
                //    84: ifeq            97
                //    87: aload           8
                //    89: checkcast       Landroid/support/v4/media/session/b;
                //    92: astore          6
                //    94: goto            108
                //    97: new             Landroid/support/v4/media/session/b$a$a;
                //   100: dup            
                //   101: aload           6
                //   103: invokespecial   android/support/v4/media/session/b$a$a.<init>:(Landroid/os/IBinder;)V
                //   106: astore          6
                //   108: aload           5
                //   110: getfield        android/support/v4/media/session/MediaSessionCompat$Token.f:Ljava/lang/Object;
                //   113: astore          8
                //   115: aload           8
                //   117: monitorenter   
                //   118: aload           5
                //   120: aload           6
                //   122: putfield        android/support/v4/media/session/MediaSessionCompat$Token.h:Landroid/support/v4/media/session/b;
                //   125: aload           8
                //   127: monitorexit    
                //   128: aload_3        
                //   129: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.d:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //   132: astore          6
                //   134: aload_2        
                //   135: ldc             "android.support.v4.media.session.SESSION_TOKEN2"
                //   137: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //   140: checkcast       Landroid/os/Bundle;
                //   143: astore_2       
                //   144: aload_2        
                //   145: ifnonnull       154
                //   148: aload           7
                //   150: astore_2       
                //   151: goto            200
                //   154: aload_2        
                //   155: ldc             Lw5/a;.class
                //   157: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
                //   160: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
                //   163: aload_2        
                //   164: ldc             "a"
                //   166: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //   169: astore_2       
                //   170: aload_2        
                //   171: instanceof      Landroidx/versionedparcelable/ParcelImpl;
                //   174: ifeq            188
                //   177: aload_2        
                //   178: checkcast       Landroidx/versionedparcelable/ParcelImpl;
                //   181: getfield        androidx/versionedparcelable/ParcelImpl.f:Lw5/c;
                //   184: astore_2       
                //   185: goto            200
                //   188: new             Ljava/lang/IllegalArgumentException;
                //   191: astore_2       
                //   192: aload_2        
                //   193: ldc             "Invalid parcel"
                //   195: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   198: aload_2        
                //   199: athrow         
                //   200: aload           6
                //   202: getfield        android/support/v4/media/session/MediaSessionCompat$Token.f:Ljava/lang/Object;
                //   205: astore          7
                //   207: aload           7
                //   209: monitorenter   
                //   210: aload           6
                //   212: aload_2        
                //   213: putfield        android/support/v4/media/session/MediaSessionCompat$Token.i:Lw5/c;
                //   216: aload           7
                //   218: monitorexit    
                //   219: aload_3        
                //   220: invokevirtual   android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:()V
                //   223: aload           4
                //   225: monitorexit    
                //   226: return         
                //   227: astore_2       
                //   228: aload           7
                //   230: monitorexit    
                //   231: aload_2        
                //   232: athrow         
                //   233: astore_2       
                //   234: aload           8
                //   236: monitorexit    
                //   237: aload_2        
                //   238: athrow         
                //   239: astore_2       
                //   240: aload           4
                //   242: monitorexit    
                //   243: aload_2        
                //   244: athrow         
                //   245: return         
                //   246: astore_2       
                //   247: aload           7
                //   249: astore_2       
                //   250: goto            200
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  31     49     239    245    Any
                //  63     74     239    245    Any
                //  79     94     239    245    Any
                //  97     108    239    245    Any
                //  108    118    239    245    Any
                //  118    128    233    239    Any
                //  128    134    239    245    Any
                //  134    144    246    253    Ljava/lang/RuntimeException;
                //  134    144    239    245    Any
                //  154    185    246    253    Ljava/lang/RuntimeException;
                //  154    185    239    245    Any
                //  188    200    246    253    Ljava/lang/RuntimeException;
                //  188    200    239    245    Any
                //  200    210    239    245    Any
                //  210    219    227    233    Any
                //  219    226    239    245    Any
                //  228    231    227    233    Any
                //  231    233    239    245    Any
                //  234    237    233    239    Any
                //  237    239    239    245    Any
                //  240    243    239    245    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0154:
                //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        public static final class a extends MediaControllerCompat$a$b
        {
            public a(final MediaControllerCompat.a a) {
                super(a);
            }
            
            public final void A0() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void G() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void G0() throws RemoteException {
                throw new AssertionError();
            }
            
            public final void M0(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
            
            public final void Y0(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
            
            public final void m0() throws RemoteException {
                throw new AssertionError();
            }
        }
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        public MediaControllerImplApi21.a a;
        
        public a() {
            new MediaControllerCompat.a.a(this);
        }
        
        public final void binderDied() {
        }
        
        public static final class a extends MediaController$Callback
        {
            public final WeakReference<MediaControllerCompat.a> a;
            
            public a(final MediaControllerCompat.a a) {
                this.a = new WeakReference<MediaControllerCompat.a>(a);
            }
            
            public final void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
                if (this.a.get() != null) {
                    mediaController$PlaybackInfo.getPlaybackType();
                    mediaController$PlaybackInfo.getAudioAttributes();
                    if (Build$VERSION.SDK_INT >= 26) {
                        new(androidx.media.AudioAttributesCompat.class)();
                    }
                    else {
                        new(androidx.media.AudioAttributesCompat.class)();
                    }
                    mediaController$PlaybackInfo.getVolumeControl();
                    mediaController$PlaybackInfo.getMaxVolume();
                    mediaController$PlaybackInfo.getCurrentVolume();
                }
            }
            
            public final void onExtrasChanged(final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onMetadataChanged(final MediaMetadata g) {
                if (this.a.get() != null) {
                    final j0.b<String, Integer> h = MediaMetadataCompat.h;
                    if (g != null) {
                        final Parcel obtain = Parcel.obtain();
                        g.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        mediaMetadataCompat.g = g;
                    }
                }
            }
            
            public final void onPlaybackStateChanged(final PlaybackState q) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    if (a.a == null) {
                        if (q != null) {
                            final List<PlaybackState$CustomAction> j = PlaybackStateCompat.b.j(q);
                            ArrayList<PlaybackStateCompat.CustomAction> list2;
                            if (j != null) {
                                final ArrayList list = new ArrayList<PlaybackStateCompat.CustomAction>(j.size());
                                for (final Object next : j) {
                                    Object o;
                                    if (next != null) {
                                        final PlaybackState$CustomAction i = (PlaybackState$CustomAction)next;
                                        final Bundle l = PlaybackStateCompat.b.l(i);
                                        MediaSessionCompat.a(l);
                                        o = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.b.f(i), PlaybackStateCompat.b.o(i), PlaybackStateCompat.b.m(i), l);
                                        ((PlaybackStateCompat.CustomAction)o).j = i;
                                    }
                                    else {
                                        o = null;
                                    }
                                    list.add((PlaybackStateCompat.CustomAction)o);
                                }
                                list2 = (ArrayList<PlaybackStateCompat.CustomAction>)list;
                            }
                            else {
                                list2 = null;
                            }
                            final Bundle a2 = PlaybackStateCompat.c.a(q);
                            MediaSessionCompat.a(a2);
                            new PlaybackStateCompat(PlaybackStateCompat.b.r(q), PlaybackStateCompat.b.q(q), PlaybackStateCompat.b.i(q), PlaybackStateCompat.b.p(q), PlaybackStateCompat.b.g(q), 0, PlaybackStateCompat.b.k(q), PlaybackStateCompat.b.n(q), list2, PlaybackStateCompat.b.h(q), a2).q = q;
                        }
                    }
                }
            }
            
            public final void onQueueChanged(final List<MediaSession$QueueItem> list) {
                if (this.a.get() != null && list != null) {
                    final ArrayList list2 = new ArrayList();
                    for (final MediaSession$QueueItem next : list) {
                        Object o;
                        if (next != null) {
                            final MediaSession$QueueItem mediaSession$QueueItem = next;
                            o = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(mediaSession$QueueItem)), MediaSessionCompat.QueueItem.b.c(mediaSession$QueueItem));
                        }
                        else {
                            o = null;
                        }
                        list2.add(o);
                    }
                }
            }
            
            public final void onQueueTitleChanged(final CharSequence charSequence) {
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onSessionDestroyed() {
                final MediaControllerCompat.a a = this.a.get();
            }
            
            public final void onSessionEvent(final String s, final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = this.a.get();
            }
        }
    }
}
