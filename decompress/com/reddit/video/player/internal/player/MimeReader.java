// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import com.google.android.exoplayer2.n;
import kotlin.collections.CollectionsKt___CollectionsKt;
import fc.g;
import kotlin.Result;
import fc.c;
import com.google.android.exoplayer2.upstream.i;
import fc.d;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a$a;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;
import javax.inject.Inject;
import cg2.j;
import mg2.l;
import com.google.android.exoplayer2.mediacodec.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/reddit/video/player/internal/player/MimeReader;", "", "", "contentType", "Lcom/google/android/exoplayer2/upstream/a$a;", "dataSourceFactory", "Landroid/net/Uri;", "uri", "", "getDashVideoMimeType", "Lcom/google/android/exoplayer2/mediacodec/e;", "mediaCodecSelector", "Lcom/google/android/exoplayer2/mediacodec/e;", "getMediaCodecSelector", "()Lcom/google/android/exoplayer2/mediacodec/e;", "Lkotlin/Function1;", "Lcg2/j;", "onSelectingVideoMediaCodec", "Lmg2/l;", "getOnSelectingVideoMediaCodec", "()Lmg2/l;", "setOnSelectingVideoMediaCodec", "(Lmg2/l;)V", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class MimeReader
{
    private final e mediaCodecSelector;
    private l<? super String, j> onSelectingVideoMediaCodec;
    
    @Inject
    public MimeReader() {
        this.onSelectingVideoMediaCodec = (l<? super String, j>)MimeReader$onSelectingVideoMediaCodec$1.INSTANCE;
        this.mediaCodecSelector = (e)new a(this);
    }
    
    public static List a(final MimeReader mimeReader, final String s, final boolean b, final boolean b2) {
        return mediaCodecSelector$lambda-0(mimeReader, s, b, b2);
    }
    
    private static final List mediaCodecSelector$lambda-0(final MimeReader mimeReader, final String s, final boolean b, final boolean b2) {
        ng2.e.f((Object)mimeReader, "this$0");
        ng2.e.f((Object)s, "mimeType");
        if (xi2.j.I0(s, "video", false)) {
            mimeReader.onSelectingVideoMediaCodec.invoke((Object)s);
        }
        return MediaCodecUtil.f(s, b, b2);
    }
    
    public final String getDashVideoMimeType(int i, final a$a a$a, final Uri uri) {
        ng2.e.f((Object)a$a, "dataSourceFactory");
        ng2.e.f((Object)uri, "uri");
        String q;
        final String s = q = null;
        if (i == 0) {
            final com.google.android.exoplayer2.upstream.a a = a$a.a();
            ng2.e.e((Object)a, "dataSourceFactory.createDataSource()");
            final int n = 0;
            Object constructor-impl = null;
            try {
                final i j = new i(4, uri, a, (i.i$a)new d());
                j.load();
                final T f = j.f;
                f.getClass();
                Result.constructor-impl((Object)((c)f).b(0));
            }
            finally {
                final Throwable t;
                constructor-impl = Result.constructor-impl((Object)cg.d.B1(t));
            }
            Object o = constructor-impl;
            if (Result.isFailure-impl(constructor-impl)) {
                o = null;
            }
            final g g = (g)o;
            Integer value = null;
            Label_0200: {
                Label_0198: {
                    if (g != null) {
                        final int size = g.c.size();
                        i = 0;
                        while (true) {
                            while (i < size) {
                                if (((fc.a)g.c.get(i)).b == 2) {
                                    value = i;
                                    i = n;
                                    if (value.intValue() != -1) {
                                        i = 1;
                                    }
                                    if (i != 0) {
                                        break Label_0200;
                                    }
                                    break Label_0198;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                }
                value = null;
            }
            fc.j k = null;
            Label_0255: {
                if (value != null) {
                    i = value.intValue();
                    final List c = g.c;
                    ng2.e.e((Object)c, "firstPeriod.adaptationSets");
                    final fc.a a2 = (fc.a)CollectionsKt___CollectionsKt.V4(i, c);
                    if (a2 != null) {
                        final List c2 = a2.c;
                        if (c2 != null) {
                            k = (fc.j)CollectionsKt___CollectionsKt.U4(c2);
                            break Label_0255;
                        }
                    }
                }
                k = null;
            }
            q = s;
            if (k != null) {
                final n f2 = k.f;
                q = s;
                if (f2 != null) {
                    q = f2.q;
                }
            }
        }
        return q;
    }
    
    public final e getMediaCodecSelector() {
        return this.mediaCodecSelector;
    }
    
    public final l<String, j> getOnSelectingVideoMediaCodec() {
        return (l<String, j>)this.onSelectingVideoMediaCodec;
    }
    
    public final void setOnSelectingVideoMediaCodec(final l<? super String, j> onSelectingVideoMediaCodec) {
        ng2.e.f((Object)onSelectingVideoMediaCodec, "<set-?>");
        this.onSelectingVideoMediaCodec = onSelectingVideoMediaCodec;
    }
}
