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
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaMetadata;
import androidx.media.AudioAttributesCompat;
import android.media.session.MediaController$PlaybackInfo;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;
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
            final MediaSessionCompat.Token b = mediaSessionCompat.a.b;
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
        public HashMap<a, MediaControllerCompat$MediaControllerImplApi21$a> c;
        public final MediaSessionCompat.Token d;
        
        public MediaControllerImplApi21(final Context context, final MediaSessionCompat.Token d) {
            this.a = new Object();
            this.b = new ArrayList();
            this.c = new HashMap<a, MediaControllerCompat$MediaControllerImplApi21$a>();
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
                for (a a : this.b) {
                    f = new MediaControllerCompat$MediaControllerImplApi21$a(a);
                    this.c.put(a, (MediaControllerCompat$MediaControllerImplApi21$a)f);
                    a.a = (MediaControllerCompat$MediaControllerImplApi21$a)f;
                    try {
                        final MediaSessionCompat.Token d2 = this.d;
                        synchronized (d2.f) {
                            final b h2 = d2.h;
                            monitorexit(d2.f);
                            h2.Q((android.support.v4.media.session.a)f);
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
                //    10: astore          6
                //    12: aload           6
                //    14: ifnull          240
                //    17: aload_2        
                //    18: ifnonnull       24
                //    21: goto            240
                //    24: aload           6
                //    26: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:Ljava/lang/Object;
                //    29: astore          5
                //    31: aload           5
                //    33: monitorenter   
                //    34: aload           6
                //    36: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.d:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //    39: astore          7
                //    41: aload_2        
                //    42: ldc             "android.support.v4.media.session.EXTRA_BINDER"
                //    44: invokestatic    androidx/core/app/BundleCompat.getBinder:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
                //    47: astore          8
                //    49: getstatic       android/support/v4/media/session/b$a.a:I
                //    52: istore_1       
                //    53: aconst_null    
                //    54: astore          4
                //    56: aload           8
                //    58: ifnonnull       66
                //    61: aconst_null    
                //    62: astore_3       
                //    63: goto            105
                //    66: aload           8
                //    68: ldc             "android.support.v4.media.session.IMediaSession"
                //    70: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
                //    75: astore_3       
                //    76: aload_3        
                //    77: ifnull          95
                //    80: aload_3        
                //    81: instanceof      Landroid/support/v4/media/session/b;
                //    84: ifeq            95
                //    87: aload_3        
                //    88: checkcast       Landroid/support/v4/media/session/b;
                //    91: astore_3       
                //    92: goto            105
                //    95: new             Landroid/support/v4/media/session/b$a$a;
                //    98: dup            
                //    99: aload           8
                //   101: invokespecial   android/support/v4/media/session/b$a$a.<init>:(Landroid/os/IBinder;)V
                //   104: astore_3       
                //   105: aload           7
                //   107: getfield        android/support/v4/media/session/MediaSessionCompat$Token.f:Ljava/lang/Object;
                //   110: astore          8
                //   112: aload           8
                //   114: monitorenter   
                //   115: aload           7
                //   117: aload_3        
                //   118: putfield        android/support/v4/media/session/MediaSessionCompat$Token.h:Landroid/support/v4/media/session/b;
                //   121: aload           8
                //   123: monitorexit    
                //   124: aload           6
                //   126: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.d:Landroid/support/v4/media/session/MediaSessionCompat$Token;
                //   129: astore_3       
                //   130: aload_2        
                //   131: ldc             "android.support.v4.media.session.SESSION_TOKEN2"
                //   133: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //   136: checkcast       Landroid/os/Bundle;
                //   139: astore_2       
                //   140: aload_2        
                //   141: ifnonnull       150
                //   144: aload           4
                //   146: astore_2       
                //   147: goto            196
                //   150: aload_2        
                //   151: ldc             Lv5/a;.class
                //   153: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
                //   156: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
                //   159: aload_2        
                //   160: ldc             "a"
                //   162: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
                //   165: astore_2       
                //   166: aload_2        
                //   167: instanceof      Landroidx/versionedparcelable/ParcelImpl;
                //   170: ifeq            184
                //   173: aload_2        
                //   174: checkcast       Landroidx/versionedparcelable/ParcelImpl;
                //   177: getfield        androidx/versionedparcelable/ParcelImpl.f:Lv5/c;
                //   180: astore_2       
                //   181: goto            196
                //   184: new             Ljava/lang/IllegalArgumentException;
                //   187: astore_2       
                //   188: aload_2        
                //   189: ldc             "Invalid parcel"
                //   191: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   194: aload_2        
                //   195: athrow         
                //   196: aload_3        
                //   197: getfield        android/support/v4/media/session/MediaSessionCompat$Token.f:Ljava/lang/Object;
                //   200: astore          4
                //   202: aload           4
                //   204: monitorenter   
                //   205: aload_3        
                //   206: aload_2        
                //   207: putfield        android/support/v4/media/session/MediaSessionCompat$Token.i:Lv5/c;
                //   210: aload           4
                //   212: monitorexit    
                //   213: aload           6
                //   215: invokevirtual   android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.a:()V
                //   218: aload           5
                //   220: monitorexit    
                //   221: return         
                //   222: astore_2       
                //   223: aload           4
                //   225: monitorexit    
                //   226: aload_2        
                //   227: athrow         
                //   228: astore_2       
                //   229: aload           8
                //   231: monitorexit    
                //   232: aload_2        
                //   233: athrow         
                //   234: astore_2       
                //   235: aload           5
                //   237: monitorexit    
                //   238: aload_2        
                //   239: athrow         
                //   240: return         
                //   241: astore_2       
                //   242: aload           4
                //   244: astore_2       
                //   245: goto            196
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  34     53     234    240    Any
                //  66     76     234    240    Any
                //  80     92     234    240    Any
                //  95     105    234    240    Any
                //  105    115    234    240    Any
                //  115    124    228    234    Any
                //  124    130    234    240    Any
                //  130    140    241    248    Ljava/lang/RuntimeException;
                //  130    140    234    240    Any
                //  150    181    241    248    Ljava/lang/RuntimeException;
                //  150    181    234    240    Any
                //  184    196    241    248    Ljava/lang/RuntimeException;
                //  184    196    234    240    Any
                //  196    205    234    240    Any
                //  205    213    222    228    Any
                //  213    221    234    240    Any
                //  223    226    222    228    Any
                //  226    228    234    240    Any
                //  229    232    228    234    Any
                //  232    234    234    240    Any
                //  235    238    234    240    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0150:
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
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        public MediaControllerCompat$MediaControllerImplApi21$a a;
        
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
                            final List j = PlaybackStateCompat$b.j(q);
                            ArrayList<PlaybackStateCompat.CustomAction> list2;
                            if (j != null) {
                                final ArrayList list = new ArrayList<PlaybackStateCompat.CustomAction>(j.size());
                                for (final Object next : j) {
                                    Object o;
                                    if (next != null) {
                                        final PlaybackState$CustomAction i = (PlaybackState$CustomAction)next;
                                        final Bundle l = PlaybackStateCompat$b.l(i);
                                        MediaSessionCompat.a(l);
                                        o = new PlaybackStateCompat.CustomAction(PlaybackStateCompat$b.f(i), PlaybackStateCompat$b.o(i), PlaybackStateCompat$b.m(i), l);
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
                            final Bundle a2 = PlaybackStateCompat$c.a(q);
                            MediaSessionCompat.a(a2);
                            new PlaybackStateCompat(PlaybackStateCompat$b.r(q), PlaybackStateCompat$b.q(q), PlaybackStateCompat$b.i(q), PlaybackStateCompat$b.p(q), PlaybackStateCompat$b.g(q), 0, PlaybackStateCompat$b.k(q), PlaybackStateCompat$b.n(q), (ArrayList)list2, PlaybackStateCompat$b.h(q), a2).q = q;
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
        
        public static class b extends a$a
        {
            public final WeakReference<MediaControllerCompat.a> b;
            
            public b(final MediaControllerCompat.a a) {
                this.b = new WeakReference<MediaControllerCompat.a>(a);
            }
            
            public final void y1(final PlaybackStateCompat playbackStateCompat) throws RemoteException {
                final MediaControllerCompat.a a = this.b.get();
            }
        }
    }
}
