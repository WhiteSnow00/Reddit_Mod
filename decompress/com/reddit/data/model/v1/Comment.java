// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcel;
import com.reddit.domain.model.vote.VoteDirection;
import mk2.e;
import com.reddit.listing.model.Listable$Type;
import kotlin.collections.EmptyList;
import com.squareup.moshi.n;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.FlairRichTextItem;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import com.reddit.domain.model.AnalyticableComment;
import com.reddit.domain.model.ModListable;
import com.reddit.listing.model.Listable;
import com.reddit.domain.model.Reportable;
import com.reddit.domain.model.Votable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\bi\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u00e9\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\u0013\u0012\b\b\u0002\u0010F\u001a\u00020\u0013\u0012\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010J\u001a\u00020\u0019\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010P\u001a\u00020 \u0012\b\b\u0003\u0010Q\u001a\u00020 \u0012\b\b\u0003\u0010R\u001a\u00020 \u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010V\u001a\u00020 \u0012\b\b\u0002\u0010W\u001a\u00020\u0013\u0012\b\b\u0003\u0010X\u001a\u00020\u0013\u0012\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010Z\u001a\u00020\u0013\u0012\b\b\u0003\u0010[\u001a\u00020 \u0012\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010]\u001a\u00020 \u0012\b\b\u0002\u0010^\u001a\u00020 \u0012\b\b\u0002\u0010_\u001a\u00020 \u0012\b\b\u0002\u0010`\u001a\u00020 \u0012\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010b\u001a\u00020\u0019\u0012\b\b\u0003\u0010c\u001a\u00020 \u0012\u0014\b\u0003\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130909\u0012\u0014\b\u0003\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130909\u0012\u0010\b\u0003\u0010f\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000109\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010i\u001a\u00020 \u0012\b\b\u0003\u0010j\u001a\u00020 \u0012\n\b\u0003\u0010k\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010l\u001a\u0004\u0018\u00010\u0013¢\u0006\u0006\b\u00e8\u0001\u0010\u00e9\u0001B\u0015\b\u0016\u0012\b\u0010\u00eb\u0001\u001a\u00030\u00ea\u0001¢\u0006\u0006\b\u00e8\u0001\u0010\u00ec\u0001BM\b\u0016\u0012\u0007\u0010\u00eb\u0001\u001a\u00020\u0000\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0013\u0012\u000f\u0010\u00ed\u0001\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000109\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0013¢\u0006\u0006\b\u00e8\u0001\u0010\u00ee\u0001J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\r\u0018\u00010\fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0019H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010!\u001a\u00020 H\u00c6\u0003J\t\u0010\"\u001a\u00020 H\u00c6\u0003J\t\u0010#\u001a\u00020 H\u00c6\u0003J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c0\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010 H\u00c6\u0003¢\u0006\u0004\b'\u0010(J\u000b\u0010)\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010+\u001a\u00020 H\u00c6\u0003J\t\u0010,\u001a\u00020\u0013H\u00c6\u0003J\t\u0010-\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010/\u001a\u00020\u0013H\u00c6\u0003J\t\u00100\u001a\u00020 H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u00102\u001a\u00020 H\u00c6\u0003J\t\u00103\u001a\u00020 H\u00c6\u0003J\t\u00104\u001a\u00020 H\u00c6\u0003J\t\u00105\u001a\u00020 H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u00107\u001a\u00020\u0019H\u00c6\u0003J\t\u00108\u001a\u00020 H\u00c6\u0003J\u0015\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130909H\u00c6\u0003J\u0015\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130909H\u00c6\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000109H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010>H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010A\u001a\u00020 H\u00c6\u0003J\t\u0010B\u001a\u00020 H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00f0\u0003\u0010m\u001a\u00020\u00002\b\b\u0002\u0010E\u001a\u00020\u00132\b\b\u0002\u0010F\u001a\u00020\u00132\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010J\u001a\u00020\u00192\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010P\u001a\u00020 2\b\b\u0003\u0010Q\u001a\u00020 2\b\b\u0003\u0010R\u001a\u00020 2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010V\u001a\u00020 2\b\b\u0002\u0010W\u001a\u00020\u00132\b\b\u0003\u0010X\u001a\u00020\u00132\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010Z\u001a\u00020\u00132\b\b\u0003\u0010[\u001a\u00020 2\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010]\u001a\u00020 2\b\b\u0002\u0010^\u001a\u00020 2\b\b\u0002\u0010_\u001a\u00020 2\b\b\u0002\u0010`\u001a\u00020 2\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010b\u001a\u00020\u00192\b\b\u0003\u0010c\u001a\u00020 2\u0014\b\u0003\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001309092\u0014\b\u0003\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001309092\u0010\b\u0003\u0010f\u001a\n\u0012\u0004\u0012\u00020<\u0018\u0001092\n\b\u0002\u0010g\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010i\u001a\u00020 2\b\b\u0003\u0010j\u001a\u00020 2\n\b\u0003\u0010k\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010l\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001¢\u0006\u0004\bm\u0010nJ\t\u0010o\u001a\u00020\u0013H\u00d6\u0001J\t\u0010p\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010r\u001a\u00020 2\b\u0010q\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010s\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010w\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020t2\u0006\u0010v\u001a\u00020\u0019H\u00d6\u0001R\"\u0010E\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\"\u0010F\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010x\u001a\u0004\b}\u0010z\"\u0004\b~\u0010|R%\u0010G\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\bG\u0010x\u001a\u0004\b\u007f\u0010z\"\u0005\b\u0080\u0001\u0010|R&\u0010H\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bH\u0010x\u001a\u0005\b\u0081\u0001\u0010z\"\u0005\b\u0082\u0001\u0010|R&\u0010I\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bI\u0010x\u001a\u0005\b\u0083\u0001\u0010z\"\u0005\b\u0084\u0001\u0010|R'\u0010J\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bJ\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010K\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bK\u0010x\u001a\u0005\b\u008a\u0001\u0010z\"\u0005\b\u008b\u0001\u0010|R&\u0010L\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bL\u0010x\u001a\u0005\b\u008c\u0001\u0010z\"\u0005\b\u008d\u0001\u0010|R&\u0010M\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bM\u0010x\u001a\u0005\b\u008e\u0001\u0010z\"\u0005\b\u008f\u0001\u0010|R&\u0010N\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bN\u0010x\u001a\u0005\b\u0090\u0001\u0010z\"\u0005\b\u0091\u0001\u0010|R&\u0010O\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bO\u0010x\u001a\u0005\b\u0092\u0001\u0010z\"\u0005\b\u0093\u0001\u0010|R'\u0010P\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bP\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010Q\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bQ\u0010\u0094\u0001\u001a\u0005\bQ\u0010\u0096\u0001\"\u0006\b\u0099\u0001\u0010\u0098\u0001R&\u0010R\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bR\u0010\u0094\u0001\u001a\u0005\bR\u0010\u0096\u0001\"\u0006\b\u009a\u0001\u0010\u0098\u0001R(\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u000e\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010%\"\u0006\b\u009d\u0001\u0010\u009e\u0001R(\u0010S\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bS\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010(\"\u0006\b¡\u0001\u0010¢\u0001R&\u0010T\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bT\u0010x\u001a\u0005\b£\u0001\u0010z\"\u0005\b¤\u0001\u0010|R&\u0010U\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bU\u0010x\u001a\u0005\b¥\u0001\u0010z\"\u0005\b¦\u0001\u0010|R&\u0010V\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bV\u0010\u0094\u0001\u001a\u0005\bV\u0010\u0096\u0001\"\u0006\b§\u0001\u0010\u0098\u0001R$\u0010W\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bW\u0010x\u001a\u0005\b¨\u0001\u0010z\"\u0005\b©\u0001\u0010|R$\u0010X\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bX\u0010x\u001a\u0005\bª\u0001\u0010z\"\u0005\b«\u0001\u0010|R&\u0010Y\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bY\u0010x\u001a\u0005\b¬\u0001\u0010z\"\u0005\b\u00ad\u0001\u0010|R$\u0010Z\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bZ\u0010x\u001a\u0005\b®\u0001\u0010z\"\u0005\b¯\u0001\u0010|R&\u0010[\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b[\u0010\u0094\u0001\u001a\u0005\b[\u0010\u0096\u0001\"\u0006\b°\u0001\u0010\u0098\u0001R&\u0010\\\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\\\u0010x\u001a\u0005\b±\u0001\u0010z\"\u0005\b²\u0001\u0010|R'\u0010]\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b]\u0010\u0094\u0001\u001a\u0006\b³\u0001\u0010\u0096\u0001\"\u0006\b´\u0001\u0010\u0098\u0001R&\u0010^\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b^\u0010\u0094\u0001\u001a\u0005\b^\u0010\u0096\u0001\"\u0006\bµ\u0001\u0010\u0098\u0001R&\u0010_\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b_\u0010\u0094\u0001\u001a\u0005\b_\u0010\u0096\u0001\"\u0006\b¶\u0001\u0010\u0098\u0001R&\u0010`\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b`\u0010\u0094\u0001\u001a\u0005\b`\u0010\u0096\u0001\"\u0006\b·\u0001\u0010\u0098\u0001R&\u0010a\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\ba\u0010x\u001a\u0005\b¸\u0001\u0010z\"\u0005\b¹\u0001\u0010|R'\u0010b\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bb\u0010\u0085\u0001\u001a\u0006\bº\u0001\u0010\u0087\u0001\"\u0006\b»\u0001\u0010\u0089\u0001R'\u0010c\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bc\u0010\u0094\u0001\u001a\u0006\b¼\u0001\u0010\u0096\u0001\"\u0006\b½\u0001\u0010\u0098\u0001R3\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001309098\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bd\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010\u00c0\u0001\"\u0006\b\u00c1\u0001\u0010\u00c2\u0001R3\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001309098\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\be\u0010¾\u0001\u001a\u0006\b\u00c3\u0001\u0010\u00c0\u0001\"\u0006\b\u00c4\u0001\u0010\u00c2\u0001R/\u0010f\u001a\n\u0012\u0004\u0012\u00020<\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bf\u0010¾\u0001\u001a\u0006\b\u00c5\u0001\u0010\u00c0\u0001\"\u0006\b\u00c6\u0001\u0010\u00c2\u0001R)\u0010g\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bg\u0010\u00c7\u0001\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001\"\u0006\b\u00ca\u0001\u0010\u00cb\u0001R&\u0010h\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bh\u0010x\u001a\u0005\b\u00cc\u0001\u0010z\"\u0005\b\u00cd\u0001\u0010|R'\u0010i\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bi\u0010\u0094\u0001\u001a\u0006\b\u00ce\u0001\u0010\u0096\u0001\"\u0006\b\u00cf\u0001\u0010\u0098\u0001R&\u0010j\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bj\u0010\u0094\u0001\u001a\u0005\bj\u0010\u0096\u0001\"\u0006\b\u00d0\u0001\u0010\u0098\u0001R\u001a\u0010k\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\r\n\u0004\bk\u0010x\u001a\u0005\b\u00d1\u0001\u0010zR&\u0010l\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bl\u0010x\u001a\u0005\b\u00d2\u0001\u0010z\"\u0005\b\u00d3\u0001\u0010|R\u001d\u0010\u00d4\u0001\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u00d4\u0001\u0010x\u001a\u0005\b\u00d5\u0001\u0010zR\u001d\u0010\u00d6\u0001\u001a\u00020\u00138\u0016X\u0096D¢\u0006\u000e\n\u0005\b\u00d6\u0001\u0010x\u001a\u0005\b\u00d7\u0001\u0010zR\u001f\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u00d8\u0001\u0010x\u001a\u0005\b\u00d9\u0001\u0010zR\u001d\u0010\u00da\u0001\u001a\u00020\u00138\u0016X\u0096D¢\u0006\u000e\n\u0005\b\u00da\u0001\u0010x\u001a\u0005\b\u00db\u0001\u0010zR\u0016\u0010\u00dd\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00dc\u0001\u0010zR\u0018\u0010\u00e1\u0001\u001a\u00030\u00de\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00df\u0001\u0010\u00e0\u0001R\u0013\u0010\u00e3\u0001\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\b\u00e2\u0001\u0010zR\u0018\u0010\u00e7\u0001\u001a\u00030\u00e4\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00e5\u0001\u0010\u00e6\u0001¨\u0006\u00ef\u0001" }, d2 = { "Lcom/reddit/data/model/v1/Comment;", "Lcom/reddit/data/model/v1/BaseThing;", "Lcom/reddit/domain/model/Votable;", "Lcom/reddit/data/model/v1/Replyable;", "Lcom/reddit/domain/model/Reportable;", "Lcom/reddit/listing/model/Listable;", "Lcom/reddit/domain/model/ModListable;", "", "Lcom/reddit/domain/model/AnalyticableComment;", "Landroid/os/Parcelable;", "Lcom/reddit/data/model/v1/CommentListing;", "getReplies", "Lcom/reddit/data/model/v1/Listing;", "Lcom/reddit/data/model/v1/ReplyableWrapper;", "replies", "Lpg2/j;", "setReplies", "", "getUniqueID", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "component13", "component14", "component15$temp_release", "()Lcom/reddit/data/model/v1/CommentListing;", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "", "component33", "component34", "Lcom/reddit/domain/model/FlairRichTextItem;", "component35", "Lcom/reddit/domain/model/RichTextResponse;", "component36", "component37", "component38", "component39", "component40", "component41", "id", "name", "parentId", "body", "bodyHtml", "score", "author", "authorFlairText", "authorFlairTemplateId", "authorFlairTextColor", "authorFlairBackgroundColor", "authorCakeday", "isArchived", "isLocked", "likes", "linkTitle", "distinguished", "isStickied", "subreddit", "subredditId", "subredditNamePrefixed", "linkId", "isScoreHidden", "linkUrl", "saved", "isApproved", "isSpam", "isRemoved", "approvedBy", "numReports", "ignoreReports", "userReports", "modReports", "authorFlairRichText", "rtjson", "authorId", "collapsed", "isCollapsedBecauseOfCrowdControl", "collapsedReason", "commentType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/reddit/data/model/v1/CommentListing;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;IZLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/reddit/domain/model/RichTextResponse;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/reddit/data/model/v1/Comment;", "toString", "hashCode", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getParentId", "setParentId", "getBody", "setBody", "getBodyHtml", "setBodyHtml", "I", "getScore", "()I", "setScore", "(I)V", "getAuthor", "setAuthor", "getAuthorFlairText", "setAuthorFlairText", "getAuthorFlairTemplateId", "setAuthorFlairTemplateId", "getAuthorFlairTextColor", "setAuthorFlairTextColor", "getAuthorFlairBackgroundColor", "setAuthorFlairBackgroundColor", "Z", "getAuthorCakeday", "()Z", "setAuthorCakeday", "(Z)V", "setArchived", "setLocked", "Lcom/reddit/data/model/v1/CommentListing;", "getReplies$temp_release", "setReplies$temp_release", "(Lcom/reddit/data/model/v1/CommentListing;)V", "Ljava/lang/Boolean;", "getLikes", "setLikes", "(Ljava/lang/Boolean;)V", "getLinkTitle", "setLinkTitle", "getDistinguished", "setDistinguished", "setStickied", "getSubreddit", "setSubreddit", "getSubredditId", "setSubredditId", "getSubredditNamePrefixed", "setSubredditNamePrefixed", "getLinkId", "setLinkId", "setScoreHidden", "getLinkUrl", "setLinkUrl", "getSaved", "setSaved", "setApproved", "setSpam", "setRemoved", "getApprovedBy", "setApprovedBy", "getNumReports", "setNumReports", "getIgnoreReports", "setIgnoreReports", "Ljava/util/List;", "getUserReports", "()Ljava/util/List;", "setUserReports", "(Ljava/util/List;)V", "getModReports", "setModReports", "getAuthorFlairRichText", "setAuthorFlairRichText", "Lcom/reddit/domain/model/RichTextResponse;", "getRtjson", "()Lcom/reddit/domain/model/RichTextResponse;", "setRtjson", "(Lcom/reddit/domain/model/RichTextResponse;)V", "getAuthorId", "setAuthorId", "getCollapsed", "setCollapsed", "setCollapsedBecauseOfCrowdControl", "getCollapsedReason", "getCommentType", "setCommentType", "kindWithId", "getKindWithId", "votableType", "getVotableType", "domain", "getDomain", "instanceId", "getInstanceId", "getModId", "modId", "Lcom/reddit/domain/model/vote/VoteDirection;", "getVoteDirection", "()Lcom/reddit/domain/model/vote/VoteDirection;", "voteDirection", "getRichTextString", "richTextString", "Lcom/reddit/listing/model/Listable$Type;", "getListableType", "()Lcom/reddit/listing/model/Listable$Type;", "listableType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/reddit/data/model/v1/CommentListing;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;IZLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/reddit/domain/model/RichTextResponse;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "Lcom/reddit/domain/model/Comment;", "comment", "(Lcom/reddit/domain/model/Comment;)V", "authorFlairRichtext", "(Lcom/reddit/data/model/v1/Comment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class Comment extends BaseThing implements Votable, Replyable, Reportable, Listable, ModListable, AnalyticableComment, Parcelable
{
    public static final Parcelable$Creator<Comment> CREATOR;
    private String approvedBy;
    private String author;
    private boolean authorCakeday;
    private String authorFlairBackgroundColor;
    private List<FlairRichTextItem> authorFlairRichText;
    private String authorFlairTemplateId;
    private String authorFlairText;
    private String authorFlairTextColor;
    private String authorId;
    private String body;
    private String bodyHtml;
    private boolean collapsed;
    private final String collapsedReason;
    private String commentType;
    private String distinguished;
    private final String domain;
    private String id;
    private boolean ignoreReports;
    private final String instanceId;
    private boolean isApproved;
    private boolean isArchived;
    private boolean isCollapsedBecauseOfCrowdControl;
    private boolean isLocked;
    private boolean isRemoved;
    private boolean isScoreHidden;
    private boolean isSpam;
    private boolean isStickied;
    private final String kindWithId;
    private Boolean likes;
    private String linkId;
    private String linkTitle;
    private String linkUrl;
    private List<? extends List<String>> modReports;
    private String name;
    private int numReports;
    private String parentId;
    private CommentListing replies;
    private RichTextResponse rtjson;
    private boolean saved;
    private int score;
    private String subreddit;
    private String subredditId;
    private String subredditNamePrefixed;
    private List<? extends List<String>> userReports;
    private final String votableType;
    
    static {
        CREATOR = (Parcelable$Creator)new Comment$Creator();
    }
    
    public Comment() {
        this(null, null, null, null, null, 0, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, null, null, false, null, false, false, false, false, null, 0, false, null, null, null, null, null, false, false, null, null, -1, 511, null);
    }
    
    public Comment(final Comment comment, final String authorFlairBackgroundColor, final String authorFlairTemplateId, final String authorFlairTextColor, final List<FlairRichTextItem> authorFlairRichText, final String authorFlairText) {
        f.f((Object)comment, "comment");
        this(null, null, null, null, null, 0, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, null, null, false, null, false, false, false, false, null, 0, false, null, null, null, null, null, false, false, null, null, -1, 511, null);
        this.setId(comment.getId());
        this.setName(comment.getKindWithId());
        this.setCreatedUtc(comment.getCreatedUtc());
        this.parentId = comment.parentId;
        this.body = comment.body;
        this.bodyHtml = comment.bodyHtml;
        this.setScore(comment.getScore());
        this.author = comment.author;
        this.authorFlairText = authorFlairText;
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
        this.authorFlairTemplateId = authorFlairTemplateId;
        this.authorFlairTextColor = authorFlairTextColor;
        this.authorCakeday = comment.authorCakeday;
        this.isArchived = comment.isArchived;
        this.isLocked = comment.isLocked;
        this.replies = null;
        this.likes = comment.likes;
        this.linkTitle = comment.linkTitle;
        this.distinguished = comment.distinguished;
        this.isStickied = comment.isStickied;
        this.setSubreddit(comment.getSubreddit());
        this.setSubredditId(comment.getSubredditId());
        this.subredditNamePrefixed = comment.subredditNamePrefixed;
        this.setLinkId(comment.getLinkId());
        this.setScoreHidden(comment.isScoreHidden());
        this.linkUrl = comment.linkUrl;
        this.saved = comment.saved;
        this.isApproved = comment.isApproved;
        this.isSpam = comment.isSpam;
        this.isRemoved = comment.isRemoved;
        this.setApprovedBy(comment.getApprovedBy());
        this.setNumReports(comment.getNumReports());
        this.setUserReports(comment.getUserReports());
        this.setModReports(comment.getModReports());
        this.authorFlairRichText = authorFlairRichText;
        this.collapsed = comment.collapsed;
        this.commentType = comment.commentType;
    }
    
    public Comment(final com.reddit.domain.model.Comment comment) {
        f.f((Object)comment, "comment");
        this(null, null, null, null, null, 0, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, null, null, false, null, false, false, false, false, null, 0, false, null, null, null, null, null, false, false, null, null, -1, 511, null);
        this.setId(comment.getId());
        this.setName(comment.getKindWithId());
        this.setCreatedUtc(comment.getCreatedUtc());
        this.parentId = comment.getParentKindWithId();
        this.body = comment.getBody();
        this.bodyHtml = comment.getBodyHtml();
        this.setScore(comment.getScore());
        this.author = comment.getAuthor();
        this.authorFlairText = comment.getAuthorFlairText();
        this.authorFlairBackgroundColor = comment.getAuthorFlairBackgroundColor();
        this.authorFlairTemplateId = comment.getAuthorFlairTemplateId();
        this.authorFlairTextColor = comment.getAuthorFlairTextColor();
        final Boolean authorCakeDay = comment.getAuthorCakeDay();
        final boolean b = false;
        boolean booleanValue;
        if (authorCakeDay != null) {
            final Boolean authorCakeDay2 = comment.getAuthorCakeDay();
            f.c((Object)authorCakeDay2);
            booleanValue = authorCakeDay2;
        }
        else {
            booleanValue = false;
        }
        this.authorCakeday = booleanValue;
        this.isArchived = comment.getArchived();
        this.isLocked = comment.getLocked();
        this.replies = null;
        this.likes = comment.getVoteState();
        this.linkTitle = comment.getLinkTitle();
        this.distinguished = comment.getDistinguished();
        this.isStickied = comment.getStickied();
        this.setSubreddit(comment.getSubreddit());
        this.setSubredditId(comment.getSubredditKindWithId());
        this.subredditNamePrefixed = comment.getSubredditNamePrefixed();
        this.setLinkId(comment.getLinkKindWithId());
        this.setScoreHidden(comment.getScoreHidden());
        this.linkUrl = comment.getLinkUrl();
        this.saved = comment.getSaved();
        boolean booleanValue2;
        if (comment.getApproved() != null) {
            final Boolean approved = comment.getApproved();
            f.c((Object)approved);
            booleanValue2 = approved;
        }
        else {
            booleanValue2 = false;
        }
        this.isApproved = booleanValue2;
        boolean booleanValue3;
        if (comment.getSpam() != null) {
            final Boolean spam = comment.getSpam();
            f.c((Object)spam);
            booleanValue3 = spam;
        }
        else {
            booleanValue3 = false;
        }
        this.isSpam = booleanValue3;
        boolean booleanValue4;
        if (comment.getRemoved() != null) {
            final Boolean removed = comment.getRemoved();
            f.c((Object)removed);
            booleanValue4 = removed;
        }
        else {
            booleanValue4 = false;
        }
        this.isRemoved = booleanValue4;
        this.setApprovedBy(comment.getApprovedBy());
        int intValue;
        if (comment.getNumReports() != null) {
            final Integer numReports = comment.getNumReports();
            f.c((Object)numReports);
            intValue = numReports;
        }
        else {
            intValue = 0;
        }
        this.setNumReports(intValue);
        this.setUserReports(comment.getUserReports());
        this.setModReports(comment.getModReports());
        this.authorFlairRichText = comment.getAuthorFlairRichText();
        this.collapsed = comment.getCollapsed();
        boolean booleanValue5 = b;
        if (comment.isCollapsedBecauseOfCrowdControl() != null) {
            final Boolean collapsedBecauseOfCrowdControl = comment.isCollapsedBecauseOfCrowdControl();
            f.c((Object)collapsedBecauseOfCrowdControl);
            booleanValue5 = collapsedBecauseOfCrowdControl;
        }
        this.isCollapsedBecauseOfCrowdControl = booleanValue5;
        this.commentType = comment.getCommentType();
    }
    
    public Comment(final String id, String name, @n(name = "parent_id") final String parentId, final String body, @n(name = "body_html") final String bodyHtml, final int score, final String author, @n(name = "author_flair_text") final String authorFlairText, @n(name = "author_flair_template_id") final String authorFlairTemplateId, @n(name = "author_flair_text_color") final String authorFlairTextColor, @n(name = "author_flair_background_color") final String authorFlairBackgroundColor, @n(name = "author_cakeday") final boolean authorCakeday, @n(name = "archived") final boolean isArchived, @n(name = "locked") final boolean isLocked, final CommentListing replies, final Boolean likes, final String linkTitle, final String distinguished, @n(name = "stickied") final boolean isStickied, final String subreddit, @n(name = "subreddit_id") final String subredditId, @n(name = "subreddit_name_prefixed") final String subredditNamePrefixed, @n(name = "link_id") final String linkId, @n(name = "score_hidden") final boolean isScoreHidden, @n(name = "link_url") final String linkUrl, final boolean saved, final boolean isApproved, final boolean isSpam, final boolean isRemoved, @n(name = "approved_by") final String approvedBy, @n(name = "num_reports") final int numReports, @n(name = "ignore_reports") final boolean ignoreReports, @n(name = "user_reports") final List<? extends List<String>> userReports, @n(name = "mod_reports") final List<? extends List<String>> modReports, @n(name = "author_flair_richtext") final List<FlairRichTextItem> authorFlairRichText, final RichTextResponse rtjson, final String authorId, final boolean collapsed, @n(name = "collapsed_because_crowd_control") final boolean isCollapsedBecauseOfCrowdControl, @n(name = "collapsed_reason") final String collapsedReason, @n(name = "comment_type") final String commentType) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        f.f((Object)subreddit, "subreddit");
        f.f((Object)subredditId, "subredditId");
        f.f((Object)linkId, "linkId");
        f.f((Object)userReports, "userReports");
        f.f((Object)modReports, "modReports");
        super(id, name, 0.0, 4, null);
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.score = score;
        this.author = author;
        this.authorFlairText = authorFlairText;
        this.authorFlairTemplateId = authorFlairTemplateId;
        this.authorFlairTextColor = authorFlairTextColor;
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
        this.authorCakeday = authorCakeday;
        this.isArchived = isArchived;
        this.isLocked = isLocked;
        this.replies = replies;
        this.likes = likes;
        this.linkTitle = linkTitle;
        this.distinguished = distinguished;
        this.isStickied = isStickied;
        this.subreddit = subreddit;
        this.subredditId = subredditId;
        this.subredditNamePrefixed = subredditNamePrefixed;
        this.linkId = linkId;
        this.isScoreHidden = isScoreHidden;
        this.linkUrl = linkUrl;
        this.saved = saved;
        this.isApproved = isApproved;
        this.isSpam = isSpam;
        this.isRemoved = isRemoved;
        this.approvedBy = approvedBy;
        this.numReports = numReports;
        this.ignoreReports = ignoreReports;
        this.userReports = userReports;
        this.modReports = modReports;
        this.authorFlairRichText = authorFlairRichText;
        this.rtjson = rtjson;
        this.authorId = authorId;
        this.collapsed = collapsed;
        this.isCollapsedBecauseOfCrowdControl = isCollapsedBecauseOfCrowdControl;
        this.collapsedReason = collapsedReason;
        this.commentType = commentType;
        this.kindWithId = this.getName();
        this.votableType = "comment";
        this.instanceId = "";
    }
    
    public Comment(String s, String s2, String s3, String s4, String s5, int n, String s6, String s7, String s8, String s9, String s10, boolean b, boolean b2, boolean b3, CommentListing commentListing, Boolean b4, String s11, String s12, boolean b5, String s13, String s14, String s15, String s16, boolean b6, String s17, boolean b7, boolean b8, boolean b9, boolean b10, String s18, int n2, boolean b11, List instance, List instance2, List list, RichTextResponse richTextResponse, String s19, boolean b12, boolean b13, String s20, String s21, final int n3, final int n4, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x1) != 0x0) {
            s = "";
        }
        if ((n3 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n3 & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n3 & 0x8) != 0x0) {
            s4 = null;
        }
        if ((n3 & 0x10) != 0x0) {
            s5 = null;
        }
        if ((n3 & 0x20) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x40) != 0x0) {
            s6 = null;
        }
        if ((n3 & 0x80) != 0x0) {
            s7 = null;
        }
        if ((n3 & 0x100) != 0x0) {
            s8 = null;
        }
        if ((n3 & 0x200) != 0x0) {
            s9 = null;
        }
        if ((n3 & 0x400) != 0x0) {
            s10 = null;
        }
        if ((n3 & 0x800) != 0x0) {
            b = false;
        }
        if ((n3 & 0x1000) != 0x0) {
            b2 = false;
        }
        if ((n3 & 0x2000) != 0x0) {
            b3 = false;
        }
        if ((n3 & 0x4000) != 0x0) {
            commentListing = null;
        }
        if ((n3 & 0x8000) != 0x0) {
            b4 = null;
        }
        if ((n3 & 0x10000) != 0x0) {
            s11 = null;
        }
        if ((n3 & 0x20000) != 0x0) {
            s12 = null;
        }
        if ((n3 & 0x40000) != 0x0) {
            b5 = false;
        }
        if ((n3 & 0x80000) != 0x0) {
            s13 = "";
        }
        if ((n3 & 0x100000) != 0x0) {
            s14 = "";
        }
        if ((n3 & 0x200000) != 0x0) {
            s15 = null;
        }
        if ((n3 & 0x400000) != 0x0) {
            s16 = "";
        }
        if ((n3 & 0x800000) != 0x0) {
            b6 = false;
        }
        if ((n3 & 0x1000000) != 0x0) {
            s17 = null;
        }
        if ((n3 & 0x2000000) != 0x0) {
            b7 = false;
        }
        if ((n3 & 0x4000000) != 0x0) {
            b8 = false;
        }
        if ((n3 & 0x8000000) != 0x0) {
            b9 = false;
        }
        if ((n3 & 0x10000000) != 0x0) {
            b10 = false;
        }
        if ((n3 & 0x20000000) != 0x0) {
            s18 = null;
        }
        if ((n3 & 0x40000000) != 0x0) {
            n2 = 0;
        }
        if ((n3 & Integer.MIN_VALUE) != 0x0) {
            b11 = false;
        }
        if ((n4 & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n4 & 0x2) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        if ((n4 & 0x4) != 0x0) {
            list = null;
        }
        if ((n4 & 0x8) != 0x0) {
            richTextResponse = null;
        }
        if ((n4 & 0x10) != 0x0) {
            s19 = null;
        }
        if ((n4 & 0x20) != 0x0) {
            b12 = false;
        }
        if ((n4 & 0x40) != 0x0) {
            b13 = false;
        }
        if ((n4 & 0x80) != 0x0) {
            s20 = null;
        }
        if ((n4 & 0x100) != 0x0) {
            s21 = null;
        }
        this(s, s2, s3, s4, s5, n, s6, s7, s8, s9, s10, b, b2, b3, commentListing, b4, s11, s12, b5, s13, s14, s15, s16, b6, s17, b7, b8, b9, b10, s18, n2, b11, (List<? extends List<String>>)instance, (List<? extends List<String>>)instance2, list, richTextResponse, s19, b12, b13, s20, s21);
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component10() {
        return this.authorFlairTextColor;
    }
    
    public final String component11() {
        return this.authorFlairBackgroundColor;
    }
    
    public final boolean component12() {
        return this.authorCakeday;
    }
    
    public final boolean component13() {
        return this.isArchived;
    }
    
    public final boolean component14() {
        return this.isLocked;
    }
    
    public final CommentListing component15$temp_release() {
        return this.replies;
    }
    
    public final Boolean component16() {
        return this.likes;
    }
    
    public final String component17() {
        return this.linkTitle;
    }
    
    public final String component18() {
        return this.distinguished;
    }
    
    public final boolean component19() {
        return this.isStickied;
    }
    
    public final String component2() {
        return this.getName();
    }
    
    public final String component20() {
        return this.getSubreddit();
    }
    
    public final String component21() {
        return this.getSubredditId();
    }
    
    public final String component22() {
        return this.subredditNamePrefixed;
    }
    
    public final String component23() {
        return this.getLinkId();
    }
    
    public final boolean component24() {
        return this.isScoreHidden();
    }
    
    public final String component25() {
        return this.linkUrl;
    }
    
    public final boolean component26() {
        return this.saved;
    }
    
    public final boolean component27() {
        return this.isApproved;
    }
    
    public final boolean component28() {
        return this.isSpam;
    }
    
    public final boolean component29() {
        return this.isRemoved;
    }
    
    public final String component3() {
        return this.parentId;
    }
    
    public final String component30() {
        return this.getApprovedBy();
    }
    
    public final int component31() {
        return this.getNumReports();
    }
    
    public final boolean component32() {
        return this.getIgnoreReports();
    }
    
    public final List<List<String>> component33() {
        return this.getUserReports();
    }
    
    public final List<List<String>> component34() {
        return this.getModReports();
    }
    
    public final List<FlairRichTextItem> component35() {
        return this.authorFlairRichText;
    }
    
    public final RichTextResponse component36() {
        return this.rtjson;
    }
    
    public final String component37() {
        return this.authorId;
    }
    
    public final boolean component38() {
        return this.collapsed;
    }
    
    public final boolean component39() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    public final String component4() {
        return this.body;
    }
    
    public final String component40() {
        return this.collapsedReason;
    }
    
    public final String component41() {
        return this.commentType;
    }
    
    public final String component5() {
        return this.bodyHtml;
    }
    
    public final int component6() {
        return this.getScore();
    }
    
    public final String component7() {
        return this.author;
    }
    
    public final String component8() {
        return this.authorFlairText;
    }
    
    public final String component9() {
        return this.authorFlairTemplateId;
    }
    
    public final Comment copy(final String s, final String s2, @n(name = "parent_id") final String s3, final String s4, @n(name = "body_html") final String s5, final int n, final String s6, @n(name = "author_flair_text") final String s7, @n(name = "author_flair_template_id") final String s8, @n(name = "author_flair_text_color") final String s9, @n(name = "author_flair_background_color") final String s10, @n(name = "author_cakeday") final boolean b, @n(name = "archived") final boolean b2, @n(name = "locked") final boolean b3, final CommentListing commentListing, final Boolean b4, final String s11, final String s12, @n(name = "stickied") final boolean b5, final String s13, @n(name = "subreddit_id") final String s14, @n(name = "subreddit_name_prefixed") final String s15, @n(name = "link_id") final String s16, @n(name = "score_hidden") final boolean b6, @n(name = "link_url") final String s17, final boolean b7, final boolean b8, final boolean b9, final boolean b10, @n(name = "approved_by") final String s18, @n(name = "num_reports") final int n2, @n(name = "ignore_reports") final boolean b11, @n(name = "user_reports") final List<? extends List<String>> list, @n(name = "mod_reports") final List<? extends List<String>> list2, @n(name = "author_flair_richtext") final List<FlairRichTextItem> list3, final RichTextResponse richTextResponse, final String s19, final boolean b12, @n(name = "collapsed_because_crowd_control") final boolean b13, @n(name = "collapsed_reason") final String s20, @n(name = "comment_type") final String s21) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s13, "subreddit");
        f.f((Object)s14, "subredditId");
        f.f((Object)s16, "linkId");
        f.f((Object)list, "userReports");
        f.f((Object)list2, "modReports");
        return new Comment(s, s2, s3, s4, s5, n, s6, s7, s8, s9, s10, b, b2, b3, commentListing, b4, s11, s12, b5, s13, s14, s15, s16, b6, s17, b7, b8, b9, b10, s18, n2, b11, list, list2, list3, richTextResponse, s19, b12, b13, s20, s21);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Comment)) {
            return false;
        }
        final Comment comment = (Comment)o;
        return f.a((Object)this.getId(), (Object)comment.getId()) && f.a((Object)this.getName(), (Object)comment.getName()) && f.a((Object)this.parentId, (Object)comment.parentId) && f.a((Object)this.body, (Object)comment.body) && f.a((Object)this.bodyHtml, (Object)comment.bodyHtml) && this.getScore() == comment.getScore() && f.a((Object)this.author, (Object)comment.author) && f.a((Object)this.authorFlairText, (Object)comment.authorFlairText) && f.a((Object)this.authorFlairTemplateId, (Object)comment.authorFlairTemplateId) && f.a((Object)this.authorFlairTextColor, (Object)comment.authorFlairTextColor) && f.a((Object)this.authorFlairBackgroundColor, (Object)comment.authorFlairBackgroundColor) && this.authorCakeday == comment.authorCakeday && this.isArchived == comment.isArchived && this.isLocked == comment.isLocked && f.a((Object)this.replies, (Object)comment.replies) && f.a((Object)this.likes, (Object)comment.likes) && f.a((Object)this.linkTitle, (Object)comment.linkTitle) && f.a((Object)this.distinguished, (Object)comment.distinguished) && this.isStickied == comment.isStickied && f.a((Object)this.getSubreddit(), (Object)comment.getSubreddit()) && f.a((Object)this.getSubredditId(), (Object)comment.getSubredditId()) && f.a((Object)this.subredditNamePrefixed, (Object)comment.subredditNamePrefixed) && f.a((Object)this.getLinkId(), (Object)comment.getLinkId()) && this.isScoreHidden() == comment.isScoreHidden() && f.a((Object)this.linkUrl, (Object)comment.linkUrl) && this.saved == comment.saved && this.isApproved == comment.isApproved && this.isSpam == comment.isSpam && this.isRemoved == comment.isRemoved && f.a((Object)this.getApprovedBy(), (Object)comment.getApprovedBy()) && this.getNumReports() == comment.getNumReports() && this.getIgnoreReports() == comment.getIgnoreReports() && f.a((Object)this.getUserReports(), (Object)comment.getUserReports()) && f.a((Object)this.getModReports(), (Object)comment.getModReports()) && f.a((Object)this.authorFlairRichText, (Object)comment.authorFlairRichText) && f.a((Object)this.rtjson, (Object)comment.rtjson) && f.a((Object)this.authorId, (Object)comment.authorId) && this.collapsed == comment.collapsed && this.isCollapsedBecauseOfCrowdControl == comment.isCollapsedBecauseOfCrowdControl && f.a((Object)this.collapsedReason, (Object)comment.collapsedReason) && f.a((Object)this.commentType, (Object)comment.commentType);
    }
    
    public String getApprovedBy() {
        return this.approvedBy;
    }
    
    public final String getAuthor() {
        return this.author;
    }
    
    public final boolean getAuthorCakeday() {
        return this.authorCakeday;
    }
    
    public final String getAuthorFlairBackgroundColor() {
        return this.authorFlairBackgroundColor;
    }
    
    public final List<FlairRichTextItem> getAuthorFlairRichText() {
        return this.authorFlairRichText;
    }
    
    public final String getAuthorFlairTemplateId() {
        return this.authorFlairTemplateId;
    }
    
    public final String getAuthorFlairText() {
        return this.authorFlairText;
    }
    
    public final String getAuthorFlairTextColor() {
        return this.authorFlairTextColor;
    }
    
    public final String getAuthorId() {
        return this.authorId;
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public final String getBodyHtml() {
        return this.bodyHtml;
    }
    
    public final boolean getCollapsed() {
        return this.collapsed;
    }
    
    public final String getCollapsedReason() {
        return this.collapsedReason;
    }
    
    public final String getCommentType() {
        return this.commentType;
    }
    
    public final String getDistinguished() {
        return this.distinguished;
    }
    
    @Override
    public String getDomain() {
        return this.domain;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    public boolean getIgnoreReports() {
        return this.ignoreReports;
    }
    
    @Override
    public String getInstanceId() {
        return this.instanceId;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public final Boolean getLikes() {
        return this.likes;
    }
    
    public String getLinkId() {
        return this.linkId;
    }
    
    public final String getLinkTitle() {
        return this.linkTitle;
    }
    
    public final String getLinkUrl() {
        return this.linkUrl;
    }
    
    public Listable$Type getListableType() {
        return Listable$Type.COMMENT;
    }
    
    public String getModId() {
        return this.getName();
    }
    
    public List<List<String>> getModReports() {
        return (List<List<String>>)this.modReports;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public int getNumReports() {
        return this.numReports;
    }
    
    public final String getParentId() {
        return this.parentId;
    }
    
    @Override
    public CommentListing getReplies() {
        final CommentListing replies = this.replies;
        f.c((Object)replies);
        return replies;
    }
    
    public final CommentListing getReplies$temp_release() {
        return this.replies;
    }
    
    public final String getRichTextString() {
        final RichTextResponse rtjson = this.rtjson;
        String richTextString;
        if (rtjson == null || (richTextString = rtjson.getRichTextString()) == null) {
            richTextString = "";
        }
        return richTextString;
    }
    
    public final RichTextResponse getRtjson() {
        return this.rtjson;
    }
    
    public final boolean getSaved() {
        return this.saved;
    }
    
    @Override
    public int getScore() {
        return this.score;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditNamePrefixed() {
        return this.subredditNamePrefixed;
    }
    
    public long getUniqueID() {
        return e.m(this.getId());
    }
    
    public List<List<String>> getUserReports() {
        return (List<List<String>>)this.userReports;
    }
    
    @Override
    public String getVotableType() {
        return this.votableType;
    }
    
    @Override
    public VoteDirection getVoteDirection() {
        final Boolean likes = this.likes;
        VoteDirection voteDirection;
        if (likes == null) {
            voteDirection = VoteDirection.NONE;
        }
        else if (f.a((Object)likes, (Object)Boolean.TRUE)) {
            voteDirection = VoteDirection.UP;
        }
        else {
            voteDirection = VoteDirection.DOWN;
        }
        return voteDirection;
    }
    
    public int hashCode() {
        final int hashCode = this.getId().hashCode();
        final int hashCode2 = this.getName().hashCode();
        final String parentId = this.parentId;
        int hashCode3 = 0;
        int hashCode4;
        if (parentId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = parentId.hashCode();
        }
        final String body = this.body;
        int hashCode5;
        if (body == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = body.hashCode();
        }
        final String bodyHtml = this.bodyHtml;
        int hashCode6;
        if (bodyHtml == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = bodyHtml.hashCode();
        }
        final int hashCode7 = Integer.hashCode(this.getScore());
        final String author = this.author;
        int hashCode8;
        if (author == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = author.hashCode();
        }
        final String authorFlairText = this.authorFlairText;
        int hashCode9;
        if (authorFlairText == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = authorFlairText.hashCode();
        }
        final String authorFlairTemplateId = this.authorFlairTemplateId;
        int hashCode10;
        if (authorFlairTemplateId == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = authorFlairTemplateId.hashCode();
        }
        final String authorFlairTextColor = this.authorFlairTextColor;
        int hashCode11;
        if (authorFlairTextColor == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = authorFlairTextColor.hashCode();
        }
        final String authorFlairBackgroundColor = this.authorFlairBackgroundColor;
        int hashCode12;
        if (authorFlairBackgroundColor == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = authorFlairBackgroundColor.hashCode();
        }
        final int authorCakeday = this.authorCakeday ? 1 : 0;
        int n = 1;
        int n2 = authorCakeday;
        if (authorCakeday != 0) {
            n2 = 1;
        }
        int isArchived;
        if ((isArchived = (this.isArchived ? 1 : 0)) != 0) {
            isArchived = 1;
        }
        int isLocked;
        if ((isLocked = (this.isLocked ? 1 : 0)) != 0) {
            isLocked = 1;
        }
        final CommentListing replies = this.replies;
        int hashCode13;
        if (replies == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = replies.hashCode();
        }
        final Boolean likes = this.likes;
        int hashCode14;
        if (likes == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = likes.hashCode();
        }
        final String linkTitle = this.linkTitle;
        int hashCode15;
        if (linkTitle == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = linkTitle.hashCode();
        }
        final String distinguished = this.distinguished;
        int hashCode16;
        if (distinguished == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = distinguished.hashCode();
        }
        int isStickied;
        if ((isStickied = (this.isStickied ? 1 : 0)) != 0) {
            isStickied = 1;
        }
        final int hashCode17 = this.getSubreddit().hashCode();
        final int hashCode18 = this.getSubredditId().hashCode();
        final String subredditNamePrefixed = this.subredditNamePrefixed;
        int hashCode19;
        if (subredditNamePrefixed == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = subredditNamePrefixed.hashCode();
        }
        final int hashCode20 = this.getLinkId().hashCode();
        int scoreHidden;
        if ((scoreHidden = (this.isScoreHidden() ? 1 : 0)) != 0) {
            scoreHidden = 1;
        }
        final String linkUrl = this.linkUrl;
        int hashCode21;
        if (linkUrl == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = linkUrl.hashCode();
        }
        int saved;
        if ((saved = (this.saved ? 1 : 0)) != 0) {
            saved = 1;
        }
        int isApproved;
        if ((isApproved = (this.isApproved ? 1 : 0)) != 0) {
            isApproved = 1;
        }
        int isSpam;
        if ((isSpam = (this.isSpam ? 1 : 0)) != 0) {
            isSpam = 1;
        }
        int isRemoved;
        if ((isRemoved = (this.isRemoved ? 1 : 0)) != 0) {
            isRemoved = 1;
        }
        int hashCode22;
        if (this.getApprovedBy() == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = this.getApprovedBy().hashCode();
        }
        final int hashCode23 = Integer.hashCode(this.getNumReports());
        int ignoreReports;
        if ((ignoreReports = (this.getIgnoreReports() ? 1 : 0)) != 0) {
            ignoreReports = 1;
        }
        final int hashCode24 = this.getUserReports().hashCode();
        final int hashCode25 = this.getModReports().hashCode();
        final List<FlairRichTextItem> authorFlairRichText = this.authorFlairRichText;
        int hashCode26;
        if (authorFlairRichText == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = authorFlairRichText.hashCode();
        }
        final RichTextResponse rtjson = this.rtjson;
        int hashCode27;
        if (rtjson == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = rtjson.hashCode();
        }
        final String authorId = this.authorId;
        int hashCode28;
        if (authorId == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = authorId.hashCode();
        }
        int collapsed;
        if ((collapsed = (this.collapsed ? 1 : 0)) != 0) {
            collapsed = 1;
        }
        final int isCollapsedBecauseOfCrowdControl = this.isCollapsedBecauseOfCrowdControl ? 1 : 0;
        if (isCollapsedBecauseOfCrowdControl == 0) {
            n = isCollapsedBecauseOfCrowdControl;
        }
        final String collapsedReason = this.collapsedReason;
        int hashCode29;
        if (collapsedReason == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = collapsedReason.hashCode();
        }
        final String commentType = this.commentType;
        if (commentType != null) {
            hashCode3 = commentType.hashCode();
        }
        return (((((((hashCode25 + (hashCode24 + ((hashCode23 + ((((((((hashCode20 + ((hashCode18 + (hashCode17 + ((((((((((((((hashCode7 + ((((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + n2) * 31 + isArchived) * 31 + isLocked) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + isStickied) * 31) * 31) * 31 + hashCode19) * 31) * 31 + scoreHidden) * 31 + hashCode21) * 31 + saved) * 31 + isApproved) * 31 + isSpam) * 31 + isRemoved) * 31 + hashCode22) * 31) * 31 + ignoreReports) * 31) * 31) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + collapsed) * 31 + n) * 31 + hashCode29) * 31 + hashCode3;
    }
    
    public final boolean isApproved() {
        return this.isApproved;
    }
    
    public final boolean isArchived() {
        return this.isArchived;
    }
    
    public final boolean isCollapsedBecauseOfCrowdControl() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    public final boolean isLocked() {
        return this.isLocked;
    }
    
    public final boolean isRemoved() {
        return this.isRemoved;
    }
    
    @Override
    public boolean isScoreHidden() {
        return this.isScoreHidden;
    }
    
    public final boolean isSpam() {
        return this.isSpam;
    }
    
    public final boolean isStickied() {
        return this.isStickied;
    }
    
    public final void setApproved(final boolean isApproved) {
        this.isApproved = isApproved;
    }
    
    public void setApprovedBy(final String approvedBy) {
        this.approvedBy = approvedBy;
    }
    
    public final void setArchived(final boolean isArchived) {
        this.isArchived = isArchived;
    }
    
    public final void setAuthor(final String author) {
        this.author = author;
    }
    
    public final void setAuthorCakeday(final boolean authorCakeday) {
        this.authorCakeday = authorCakeday;
    }
    
    public final void setAuthorFlairBackgroundColor(final String authorFlairBackgroundColor) {
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
    }
    
    public final void setAuthorFlairRichText(final List<FlairRichTextItem> authorFlairRichText) {
        this.authorFlairRichText = authorFlairRichText;
    }
    
    public final void setAuthorFlairTemplateId(final String authorFlairTemplateId) {
        this.authorFlairTemplateId = authorFlairTemplateId;
    }
    
    public final void setAuthorFlairText(final String authorFlairText) {
        this.authorFlairText = authorFlairText;
    }
    
    public final void setAuthorFlairTextColor(final String authorFlairTextColor) {
        this.authorFlairTextColor = authorFlairTextColor;
    }
    
    public final void setAuthorId(final String authorId) {
        this.authorId = authorId;
    }
    
    public final void setBody(final String body) {
        this.body = body;
    }
    
    public final void setBodyHtml(final String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }
    
    public final void setCollapsed(final boolean collapsed) {
        this.collapsed = collapsed;
    }
    
    public final void setCollapsedBecauseOfCrowdControl(final boolean isCollapsedBecauseOfCrowdControl) {
        this.isCollapsedBecauseOfCrowdControl = isCollapsedBecauseOfCrowdControl;
    }
    
    public final void setCommentType(final String commentType) {
        this.commentType = commentType;
    }
    
    public final void setDistinguished(final String distinguished) {
        this.distinguished = distinguished;
    }
    
    @Override
    public void setId(final String id) {
        f.f((Object)id, "<set-?>");
        this.id = id;
    }
    
    public void setIgnoreReports(final boolean ignoreReports) {
        this.ignoreReports = ignoreReports;
    }
    
    public final void setLikes(final Boolean likes) {
        this.likes = likes;
    }
    
    public void setLinkId(final String linkId) {
        f.f((Object)linkId, "<set-?>");
        this.linkId = linkId;
    }
    
    public final void setLinkTitle(final String linkTitle) {
        this.linkTitle = linkTitle;
    }
    
    public final void setLinkUrl(final String linkUrl) {
        this.linkUrl = linkUrl;
    }
    
    public final void setLocked(final boolean isLocked) {
        this.isLocked = isLocked;
    }
    
    public void setModReports(final List<? extends List<String>> modReports) {
        f.f((Object)modReports, "<set-?>");
        this.modReports = modReports;
    }
    
    @Override
    public void setName(final String name) {
        f.f((Object)name, "<set-?>");
        this.name = name;
    }
    
    public void setNumReports(final int numReports) {
        this.numReports = numReports;
    }
    
    public final void setParentId(final String parentId) {
        this.parentId = parentId;
    }
    
    public final void setRemoved(final boolean isRemoved) {
        this.isRemoved = isRemoved;
    }
    
    @Override
    public void setReplies(final Listing<ReplyableWrapper<?>> listing) {
        this.replies = (CommentListing)listing;
    }
    
    public final void setReplies$temp_release(final CommentListing replies) {
        this.replies = replies;
    }
    
    public final void setRtjson(final RichTextResponse rtjson) {
        this.rtjson = rtjson;
    }
    
    public final void setSaved(final boolean saved) {
        this.saved = saved;
    }
    
    public void setScore(final int score) {
        this.score = score;
    }
    
    public void setScoreHidden(final boolean isScoreHidden) {
        this.isScoreHidden = isScoreHidden;
    }
    
    public final void setSpam(final boolean isSpam) {
        this.isSpam = isSpam;
    }
    
    public final void setStickied(final boolean isStickied) {
        this.isStickied = isStickied;
    }
    
    public void setSubreddit(final String subreddit) {
        f.f((Object)subreddit, "<set-?>");
        this.subreddit = subreddit;
    }
    
    public void setSubredditId(final String subredditId) {
        f.f((Object)subredditId, "<set-?>");
        this.subredditId = subredditId;
    }
    
    public final void setSubredditNamePrefixed(final String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }
    
    public void setUserReports(final List<? extends List<String>> userReports) {
        f.f((Object)userReports, "<set-?>");
        this.userReports = userReports;
    }
    
    public String toString() {
        final StringBuilder k = a.k("Comment(id=");
        k.append(this.getId());
        k.append(", name=");
        k.append(this.getName());
        k.append(", parentId=");
        k.append(this.parentId);
        k.append(", body=");
        k.append(this.body);
        k.append(", bodyHtml=");
        k.append(this.bodyHtml);
        k.append(", score=");
        k.append(this.getScore());
        k.append(", author=");
        k.append(this.author);
        k.append(", authorFlairText=");
        k.append(this.authorFlairText);
        k.append(", authorFlairTemplateId=");
        k.append(this.authorFlairTemplateId);
        k.append(", authorFlairTextColor=");
        k.append(this.authorFlairTextColor);
        k.append(", authorFlairBackgroundColor=");
        k.append(this.authorFlairBackgroundColor);
        k.append(", authorCakeday=");
        k.append(this.authorCakeday);
        k.append(", isArchived=");
        k.append(this.isArchived);
        k.append(", isLocked=");
        k.append(this.isLocked);
        k.append(", replies=");
        k.append(this.replies);
        k.append(", likes=");
        k.append(this.likes);
        k.append(", linkTitle=");
        k.append(this.linkTitle);
        k.append(", distinguished=");
        k.append(this.distinguished);
        k.append(", isStickied=");
        k.append(this.isStickied);
        k.append(", subreddit=");
        k.append(this.getSubreddit());
        k.append(", subredditId=");
        k.append(this.getSubredditId());
        k.append(", subredditNamePrefixed=");
        k.append(this.subredditNamePrefixed);
        k.append(", linkId=");
        k.append(this.getLinkId());
        k.append(", isScoreHidden=");
        k.append(this.isScoreHidden());
        k.append(", linkUrl=");
        k.append(this.linkUrl);
        k.append(", saved=");
        k.append(this.saved);
        k.append(", isApproved=");
        k.append(this.isApproved);
        k.append(", isSpam=");
        k.append(this.isSpam);
        k.append(", isRemoved=");
        k.append(this.isRemoved);
        k.append(", approvedBy=");
        k.append(this.getApprovedBy());
        k.append(", numReports=");
        k.append(this.getNumReports());
        k.append(", ignoreReports=");
        k.append(this.getIgnoreReports());
        k.append(", userReports=");
        k.append(this.getUserReports());
        k.append(", modReports=");
        k.append(this.getModReports());
        k.append(", authorFlairRichText=");
        k.append(this.authorFlairRichText);
        k.append(", rtjson=");
        k.append(this.rtjson);
        k.append(", authorId=");
        k.append(this.authorId);
        k.append(", collapsed=");
        k.append(this.collapsed);
        k.append(", isCollapsedBecauseOfCrowdControl=");
        k.append(this.isCollapsedBecauseOfCrowdControl);
        k.append(", collapsedReason=");
        k.append(this.collapsedReason);
        k.append(", commentType=");
        return b.k(k, this.commentType, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.parentId);
        parcel.writeString(this.body);
        parcel.writeString(this.bodyHtml);
        parcel.writeInt(this.score);
        parcel.writeString(this.author);
        parcel.writeString(this.authorFlairText);
        parcel.writeString(this.authorFlairTemplateId);
        parcel.writeString(this.authorFlairTextColor);
        parcel.writeString(this.authorFlairBackgroundColor);
        parcel.writeInt((int)(this.authorCakeday ? 1 : 0));
        parcel.writeInt((int)(this.isArchived ? 1 : 0));
        parcel.writeInt((int)(this.isLocked ? 1 : 0));
        parcel.writeSerializable((Serializable)this.replies);
        final Boolean likes = this.likes;
        if (likes == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.w(parcel, 1, likes);
        }
        parcel.writeString(this.linkTitle);
        parcel.writeString(this.distinguished);
        parcel.writeInt((int)(this.isStickied ? 1 : 0));
        parcel.writeString(this.subreddit);
        parcel.writeString(this.subredditId);
        parcel.writeString(this.subredditNamePrefixed);
        parcel.writeString(this.linkId);
        parcel.writeInt((int)(this.isScoreHidden ? 1 : 0));
        parcel.writeString(this.linkUrl);
        parcel.writeInt((int)(this.saved ? 1 : 0));
        parcel.writeInt((int)(this.isApproved ? 1 : 0));
        parcel.writeInt((int)(this.isSpam ? 1 : 0));
        parcel.writeInt((int)(this.isRemoved ? 1 : 0));
        parcel.writeString(this.approvedBy);
        parcel.writeInt(this.numReports);
        parcel.writeInt((int)(this.ignoreReports ? 1 : 0));
        final Iterator n2 = a2.b.n((List)this.userReports, parcel);
        while (n2.hasNext()) {
            parcel.writeStringList((List)n2.next());
        }
        final Iterator n3 = a2.b.n((List)this.modReports, parcel);
        while (n3.hasNext()) {
            parcel.writeStringList((List)n3.next());
        }
        final List<FlairRichTextItem> authorFlairRichText = this.authorFlairRichText;
        if (authorFlairRichText == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)authorFlairRichText);
            while (o.hasNext()) {
                parcel.writeParcelable((Parcelable)o.next(), n);
            }
        }
        parcel.writeParcelable((Parcelable)this.rtjson, n);
        parcel.writeString(this.authorId);
        parcel.writeInt((int)(this.collapsed ? 1 : 0));
        parcel.writeInt((int)(this.isCollapsedBecauseOfCrowdControl ? 1 : 0));
        parcel.writeString(this.collapsedReason);
        parcel.writeString(this.commentType);
    }
}
