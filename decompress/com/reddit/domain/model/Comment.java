// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.Iterator;
import android.os.Parcelable;
import android.os.Parcel;
import al0.f0;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptyList;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.mod.notes.domain.model.NoteLabel;
import java.util.Map;
import com.reddit.domain.model.mod.BannedBy;
import java.util.List;
import com.reddit.domain.awards.model.Award;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;

@DisallowInBundle
@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u00e9\u0005\u0012\b\b\u0002\u0010S\u001a\u00020\t\u0012\b\b\u0003\u0010T\u001a\u00020\t\u0012\b\b\u0003\u0010U\u001a\u00020\t\u0012\b\b\u0002\u0010V\u001a\u00020\t\u0012\b\b\u0003\u0010W\u001a\u00020\t\u0012\b\b\u0002\u0010X\u001a\u00020\u000f\u0012\b\b\u0002\u0010Y\u001a\u00020\t\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0003\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u000e\b\u0003\u0010^\u001a\b\u0018\u00010\u0007j\u0002`\u0018\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010`\u001a\u00020\u0007\u0012\b\b\u0002\u0010a\u001a\u00020\u0007\u0012\u000e\b\u0003\u0010b\u001a\b\u0018\u00010\u0007j\u0002`\u0018\u0012\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010e\u001a\u00020\u0007\u0012\b\b\u0002\u0010f\u001a\u00020\t\u0012\b\b\u0003\u0010g\u001a\u00020\t\u0012\b\b\u0003\u0010h\u001a\u00020\t\u0012\b\b\u0003\u0010i\u001a\u00020\t\u0012\b\b\u0003\u0010j\u001a\u00020\u0007\u0012\n\b\u0003\u0010k\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010l\u001a\u00020\u0007\u0012\b\b\u0002\u0010m\u001a\u00020\u0007\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010p\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010s\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0003\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u0015\u0012\u0014\b\u0003\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u0015\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010x\u001a\u00020\u000f\u0012\b\b\u0003\u0010y\u001a\u000209\u0012\u0010\b\u0002\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015\u0012\u000e\b\u0003\u0010{\u001a\b\u0012\u0004\u0012\u00020<0\u0015\u0012\u000e\b\u0003\u0010|\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\n\b\u0003\u0010}\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010~\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u007f\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010B\u0012\t\b\u0003\u0010\u0081\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0007\u0012\u0017\b\u0003\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020G\u0018\u00010F\u0012\u000b\b\u0003\u0010\u0084\u0001\u001a\u0004\u0018\u00010<\u0012\u000b\b\u0003\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0003\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0003\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t\u0012\u000b\b\u0003\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t\u0012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u0007\u0012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u0007\u0012\u000b\b\u0003\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t¢\u0006\u0006\b\u00f1\u0001\u0010\u00f2\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u00c6\u0003J\u0016\u0010\u0019\u001a\b\u0018\u00010\u0007j\u0002`\u0018H\u00c6\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\u0016\u0010\u001e\u001a\b\u0018\u00010\u0007j\u0002`\u0018H\u00c6\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b+\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010,H\u00c6\u0003J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b.\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0012\u00100\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u0015H\u00c6\u0003J\u0015\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u0015H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u000104H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u000106H\u00c6\u0003J\t\u00108\u001a\u00020\u000fH\u00c6\u0003J\t\u0010:\u001a\u000209H\u00c6\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0015H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010BH\u00c6\u0003J\t\u0010D\u001a\u00020\tH\u00c6\u0003J\t\u0010E\u001a\u00020\u0007H\u00c6\u0003J\u0017\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020G\u0018\u00010FH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010<H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0012\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bK\u0010\u001aJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bL\u0010\u001aJ\u000b\u0010M\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u00f3\u0005\u0010\u008e\u0001\u001a\u00020\u00002\b\b\u0002\u0010S\u001a\u00020\t2\b\b\u0003\u0010T\u001a\u00020\t2\b\b\u0003\u0010U\u001a\u00020\t2\b\b\u0002\u0010V\u001a\u00020\t2\b\b\u0003\u0010W\u001a\u00020\t2\b\b\u0002\u0010X\u001a\u00020\u000f2\b\b\u0002\u0010Y\u001a\u00020\t2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\b\u0003\u0010^\u001a\b\u0018\u00010\u0007j\u0002`\u00182\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010`\u001a\u00020\u00072\b\b\u0002\u0010a\u001a\u00020\u00072\u000e\b\u0003\u0010b\u001a\b\u0018\u00010\u0007j\u0002`\u00182\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010e\u001a\u00020\u00072\b\b\u0002\u0010f\u001a\u00020\t2\b\b\u0003\u0010g\u001a\u00020\t2\b\b\u0003\u0010h\u001a\u00020\t2\b\b\u0003\u0010i\u001a\u00020\t2\b\b\u0003\u0010j\u001a\u00020\u00072\n\b\u0003\u0010k\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010l\u001a\u00020\u00072\b\b\u0002\u0010m\u001a\u00020\u00072\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010p\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010s\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0003\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00152\u0014\b\u0003\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00152\n\b\u0002\u0010v\u001a\u0004\u0018\u0001042\n\b\u0002\u0010w\u001a\u0004\u0018\u0001062\b\b\u0002\u0010x\u001a\u00020\u000f2\b\b\u0003\u0010y\u001a\u0002092\u0010\b\u0002\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u000e\b\u0003\u0010{\u001a\b\u0012\u0004\u0012\u00020<0\u00152\u000e\b\u0003\u0010|\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\n\b\u0003\u0010}\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010~\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u007f\u001a\u0004\u0018\u00010\t2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010B2\t\b\u0003\u0010\u0081\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u00072\u0017\b\u0003\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020G\u0018\u00010F2\u000b\b\u0003\u0010\u0084\u0001\u001a\u0004\u0018\u00010<2\u000b\b\u0003\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0003\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0003\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0003\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t2\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u00072\u000b\b\u0003\u0010\u008d\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\n\u0010\u0090\u0001\u001a\u00020\tH\u00d6\u0001J\n\u0010\u0091\u0001\u001a\u00020\u000fH\u00d6\u0001J\u0016\u0010\u0094\u0001\u001a\u00020\u00072\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u00d6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u000fH\u00d6\u0001J\u001e\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u000fH\u00d6\u0001R\u001d\u0010S\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bS\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010T\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bT\u0010\u009b\u0001\u001a\u0006\b\u009e\u0001\u0010\u009d\u0001R\u001d\u0010U\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bU\u0010\u009b\u0001\u001a\u0006\b\u009f\u0001\u0010\u009d\u0001R\u001a\u0010V\u001a\u00020\t8\u0006¢\u0006\u000f\n\u0005\bV\u0010\u009b\u0001\u001a\u0006\b \u0001\u0010\u009d\u0001R\u001d\u0010W\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bW\u0010\u009b\u0001\u001a\u0006\b¡\u0001\u0010\u009d\u0001R\u001d\u0010X\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bX\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010Y\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bY\u0010\u009b\u0001\u001a\u0006\b¥\u0001\u0010\u009d\u0001R\u001c\u0010Z\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\bZ\u0010\u009b\u0001\u001a\u0006\b¦\u0001\u0010\u009d\u0001R\u001c\u0010[\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\b[\u0010\u009b\u0001\u001a\u0006\b§\u0001\u0010\u009d\u0001R\u001f\u0010\\\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\\\u0010\u009b\u0001\u001a\u0006\b¨\u0001\u0010\u009d\u0001R%\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b]\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\"\u0010^\u001a\b\u0018\u00010\u0007j\u0002`\u00188\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b^\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010\u001aR\u001c\u0010_\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\b_\u0010\u009b\u0001\u001a\u0006\b®\u0001\u0010\u009d\u0001R\u001a\u0010`\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\b`\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010a\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\ba\u0010¯\u0001\u001a\u0006\b²\u0001\u0010±\u0001R\u001f\u0010b\u001a\b\u0018\u00010\u0007j\u0002`\u00188\u0006¢\u0006\u000e\n\u0005\bb\u0010¬\u0001\u001a\u0005\b³\u0001\u0010\u001aR\u001c\u0010c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\bc\u0010\u009b\u0001\u001a\u0006\b´\u0001\u0010\u009d\u0001R\u001f\u0010d\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bd\u0010\u009b\u0001\u001a\u0006\bµ\u0001\u0010\u009d\u0001R\u001a\u0010e\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\be\u0010¯\u0001\u001a\u0006\b¶\u0001\u0010±\u0001R\u001d\u0010f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bf\u0010\u009b\u0001\u001a\u0006\b·\u0001\u0010\u009d\u0001R\u001a\u0010g\u001a\u00020\t8\u0006¢\u0006\u000f\n\u0005\bg\u0010\u009b\u0001\u001a\u0006\b¸\u0001\u0010\u009d\u0001R\u001a\u0010h\u001a\u00020\t8\u0006¢\u0006\u000f\n\u0005\bh\u0010\u009b\u0001\u001a\u0006\b¹\u0001\u0010\u009d\u0001R\u001a\u0010i\u001a\u00020\t8\u0006¢\u0006\u000f\n\u0005\bi\u0010\u009b\u0001\u001a\u0006\bº\u0001\u0010\u009d\u0001R\u001a\u0010j\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\bj\u0010¯\u0001\u001a\u0006\b»\u0001\u0010±\u0001R\u001c\u0010k\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\bk\u0010\u009b\u0001\u001a\u0006\b¼\u0001\u0010\u009d\u0001R\u001a\u0010l\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\bl\u0010¯\u0001\u001a\u0006\b½\u0001\u0010±\u0001R\u001a\u0010m\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\bm\u0010¯\u0001\u001a\u0006\b¾\u0001\u0010±\u0001R\u001b\u0010n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bn\u0010¬\u0001\u001a\u0005\b¿\u0001\u0010\u001aR\u001b\u0010o\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bo\u0010¬\u0001\u001a\u0005\b\u00c0\u0001\u0010\u001aR\u001c\u0010p\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0005\bp\u0010\u00c1\u0001\u001a\u0006\b\u00c2\u0001\u0010\u00c3\u0001R\u001b\u0010q\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bq\u0010¬\u0001\u001a\u0005\b\u00c4\u0001\u0010\u001aR\u001c\u0010r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\br\u0010\u009b\u0001\u001a\u0006\b\u00c5\u0001\u0010\u009d\u0001R\u001b\u0010s\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\bs\u0010\u00c6\u0001\u001a\u0005\b\u00c7\u0001\u00101R&\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00158\u0006¢\u0006\u000f\n\u0005\bt\u0010©\u0001\u001a\u0006\b\u00c8\u0001\u0010«\u0001R&\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00158\u0006¢\u0006\u000f\n\u0005\bu\u0010©\u0001\u001a\u0006\b\u00c9\u0001\u0010«\u0001R\u001c\u0010v\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0005\bv\u0010\u00ca\u0001\u001a\u0006\b\u00cb\u0001\u0010\u00cc\u0001R\u001c\u0010w\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000f\n\u0005\bw\u0010\u00cd\u0001\u001a\u0006\b\u00ce\u0001\u0010\u00cf\u0001R\u001d\u0010x\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bx\u0010¢\u0001\u001a\u0006\b\u00d0\u0001\u0010¤\u0001R\u001d\u0010y\u001a\u0002098\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\by\u0010\u00d1\u0001\u001a\u0006\b\u00d2\u0001\u0010\u00d3\u0001R\"\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bz\u0010©\u0001\u001a\u0006\b\u00d4\u0001\u0010«\u0001R#\u0010{\u001a\b\u0012\u0004\u0012\u00020<0\u00158\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b{\u0010©\u0001\u001a\u0006\b\u00d5\u0001\u0010«\u0001R#\u0010|\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b|\u0010©\u0001\u001a\u0006\b\u00d6\u0001\u0010«\u0001R\u001c\u0010}\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\b}\u0010\u009b\u0001\u001a\u0006\b\u00d7\u0001\u0010\u009d\u0001R\u001c\u0010~\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\b~\u0010\u009b\u0001\u001a\u0006\b\u00d8\u0001\u0010\u009d\u0001R\u001c\u0010\u007f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u009b\u0001\u001a\u0006\b\u00d9\u0001\u0010\u009d\u0001R\u001e\u0010\u0080\u0001\u001a\u0004\u0018\u00010B8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u00da\u0001\u001a\u0006\b\u00db\u0001\u0010\u00dc\u0001R\u001c\u0010\u0081\u0001\u001a\u00020\t8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u009b\u0001\u001a\u0006\b\u00dd\u0001\u0010\u009d\u0001R\u001c\u0010\u0082\u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010¯\u0001\u001a\u0006\b\u00de\u0001\u0010±\u0001R*\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020G\u0018\u00010F8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u00df\u0001\u001a\u0006\b\u00e0\u0001\u0010\u00e1\u0001R\u001e\u0010\u0084\u0001\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u00e2\u0001\u001a\u0006\b\u00e3\u0001\u0010\u00e4\u0001R\u001e\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u009b\u0001\u001a\u0006\b\u00e5\u0001\u0010\u009d\u0001R\u001d\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010¬\u0001\u001a\u0005\b\u00e6\u0001\u0010\u001aR\u001d\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010¬\u0001\u001a\u0005\b\u0087\u0001\u0010\u001aR\u001e\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u009b\u0001\u001a\u0006\b\u00e7\u0001\u0010\u009d\u0001R\u001e\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u009b\u0001\u001a\u0006\b\u00e8\u0001\u0010\u009d\u0001R\u001e\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u009b\u0001\u001a\u0006\b\u00e9\u0001\u0010\u009d\u0001R\u001c\u0010\u008b\u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010¯\u0001\u001a\u0006\b\u00ea\u0001\u0010±\u0001R\u001c\u0010\u008c\u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010¯\u0001\u001a\u0006\b\u00eb\u0001\u0010±\u0001R\u001e\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u009b\u0001\u001a\u0006\b\u00ec\u0001\u0010\u009d\u0001R\u0017\u0010\u00ee\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ed\u0001\u0010\u009d\u0001R\u0017\u0010\u00f0\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ef\u0001\u0010\u009d\u0001¨\u0006\u00f3\u0001" }, d2 = { "Lcom/reddit/domain/model/Comment;", "Lcom/reddit/domain/model/IComment;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/ApiComment;", "Lcom/reddit/domain/model/AnalyticableComment;", "", "getInternalCommentReplies", "", "isPredictionSystemComment", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "component11", "Lcom/reddit/domain/model/Nullean;", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "Lcom/reddit/domain/model/mod/BannedBy;", "component30", "component31", "component32", "component33", "()Ljava/lang/Integer;", "component34", "component35", "Lcom/reddit/domain/modtools/ModQueueTriggers;", "component36", "Lcom/reddit/mod/notes/domain/model/NoteLabel;", "component37", "component38", "", "component39", "component40", "Lcom/reddit/domain/awards/model/Award;", "component41", "component42", "component43", "component44", "component45", "Lcom/reddit/domain/model/RichTextResponse;", "component46", "component47", "component48", "", "Lcom/reddit/domain/model/MediaMetaData;", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "id", "kindWithId", "parentKindWithId", "body", "bodyHtml", "score", "author", "modProxyAuthor", "modProxyAuthorKindWithId", "authorFlairText", "authorFlairRichText", "authorCakeDay", "authorIconUrl", "archived", "locked", "voteState", "linkTitle", "distinguished", "stickied", "subreddit", "subredditKindWithId", "subredditNamePrefixed", "linkKindWithId", "scoreHidden", "linkUrl", "subscribed", "saved", "approved", "spam", "bannedBy", "removed", "approvedBy", "numReports", "modReports", "userReports", "modQueueTriggers", "modNoteLabel", "depth", "createdUtc", "replies", "awards", "treatmentTags", "authorFlairTemplateId", "authorFlairBackgroundColor", "authorFlairTextColor", "rtjson", "authorKindWithId", "collapsed", "mediaMetadata", "associatedAward", "profileImg", "profileOver18", "isCollapsedBecauseOfCrowdControl", "collapsedReasonCode", "unrepliableReason", "snoovatarImg", "authorIconIsDefault", "authorIconIsNsfw", "commentType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/domain/model/mod/BannedBy;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/reddit/domain/modtools/ModQueueTriggers;Lcom/reddit/mod/notes/domain/model/NoteLabel;IJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/RichTextResponse;Ljava/lang/String;ZLjava/util/Map;Lcom/reddit/domain/awards/model/Award;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/reddit/domain/model/Comment;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "getParentKindWithId", "getBody", "getBodyHtml", "I", "getScore", "()I", "getAuthor", "getModProxyAuthor", "getModProxyAuthorKindWithId", "getAuthorFlairText", "Ljava/util/List;", "getAuthorFlairRichText", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getAuthorCakeDay", "getAuthorIconUrl", "Z", "getArchived", "()Z", "getLocked", "getVoteState", "getLinkTitle", "getDistinguished", "getStickied", "getSubreddit", "getSubredditKindWithId", "getSubredditNamePrefixed", "getLinkKindWithId", "getScoreHidden", "getLinkUrl", "getSubscribed", "getSaved", "getApproved", "getSpam", "Lcom/reddit/domain/model/mod/BannedBy;", "getBannedBy", "()Lcom/reddit/domain/model/mod/BannedBy;", "getRemoved", "getApprovedBy", "Ljava/lang/Integer;", "getNumReports", "getModReports", "getUserReports", "Lcom/reddit/domain/modtools/ModQueueTriggers;", "getModQueueTriggers", "()Lcom/reddit/domain/modtools/ModQueueTriggers;", "Lcom/reddit/mod/notes/domain/model/NoteLabel;", "getModNoteLabel", "()Lcom/reddit/mod/notes/domain/model/NoteLabel;", "getDepth", "J", "getCreatedUtc", "()J", "getReplies", "getAwards", "getTreatmentTags", "getAuthorFlairTemplateId", "getAuthorFlairBackgroundColor", "getAuthorFlairTextColor", "Lcom/reddit/domain/model/RichTextResponse;", "getRtjson", "()Lcom/reddit/domain/model/RichTextResponse;", "getAuthorKindWithId", "getCollapsed", "Ljava/util/Map;", "getMediaMetadata", "()Ljava/util/Map;", "Lcom/reddit/domain/awards/model/Award;", "getAssociatedAward", "()Lcom/reddit/domain/awards/model/Award;", "getProfileImg", "getProfileOver18", "getCollapsedReasonCode", "getUnrepliableReason", "getSnoovatarImg", "getAuthorIconIsDefault", "getAuthorIconIsNsfw", "getCommentType", "getSubredditId", "subredditId", "getLinkId", "linkId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/domain/model/mod/BannedBy;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/reddit/domain/modtools/ModQueueTriggers;Lcom/reddit/mod/notes/domain/model/NoteLabel;IJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/RichTextResponse;Ljava/lang/String;ZLjava/util/Map;Lcom/reddit/domain/awards/model/Award;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Comment extends IComment implements ApiComment, AnalyticableComment
{
    public static final Parcelable$Creator<Comment> CREATOR;
    private final Boolean approved;
    private final String approvedBy;
    private final boolean archived;
    private final Award associatedAward;
    private final String author;
    private final Boolean authorCakeDay;
    private final String authorFlairBackgroundColor;
    private final List<FlairRichTextItem> authorFlairRichText;
    private final String authorFlairTemplateId;
    private final String authorFlairText;
    private final String authorFlairTextColor;
    private final boolean authorIconIsDefault;
    private final boolean authorIconIsNsfw;
    private final String authorIconUrl;
    private final String authorKindWithId;
    private final List<Award> awards;
    private final BannedBy bannedBy;
    private final String body;
    private final String bodyHtml;
    private final boolean collapsed;
    private final String collapsedReasonCode;
    private final String commentType;
    private final long createdUtc;
    private final int depth;
    private final String distinguished;
    private final String id;
    private final Boolean isCollapsedBecauseOfCrowdControl;
    private final String kindWithId;
    private final String linkKindWithId;
    private final String linkTitle;
    private final String linkUrl;
    private final boolean locked;
    private final Map<String, MediaMetaData> mediaMetadata;
    private final NoteLabel modNoteLabel;
    private final String modProxyAuthor;
    private final String modProxyAuthorKindWithId;
    private final transient ModQueueTriggers modQueueTriggers;
    private final List<List<String>> modReports;
    private final Integer numReports;
    private final String parentKindWithId;
    private final String profileImg;
    private final Boolean profileOver18;
    private final Boolean removed;
    private final transient List<IComment> replies;
    private final RichTextResponse rtjson;
    private final boolean saved;
    private final int score;
    private final boolean scoreHidden;
    private final String snoovatarImg;
    private final Boolean spam;
    private final boolean stickied;
    private final String subreddit;
    private final String subredditKindWithId;
    private final String subredditNamePrefixed;
    private final boolean subscribed;
    private final List<String> treatmentTags;
    private final String unrepliableReason;
    private final List<List<String>> userReports;
    private final Boolean voteState;
    
    static {
        CREATOR = (Parcelable$Creator)new Comment$Creator();
    }
    
    public Comment() {
        this(null, null, null, null, null, 0, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, -1, 134217727, null);
    }
    
    public Comment(final String id, @n(name = "name") final String kindWithId, @n(name = "parent_id") final String parentKindWithId, final String body, @n(name = "body_html") final String bodyHtml, final int score, final String author, final String modProxyAuthor, final String modProxyAuthorKindWithId, @n(name = "author_flair_text") final String authorFlairText, @n(name = "author_flair_richtext") final List<FlairRichTextItem> authorFlairRichText, @n(name = "author_cakeday") final Boolean authorCakeDay, final String authorIconUrl, final boolean archived, final boolean locked, @n(name = "likes") final Boolean voteState, @n(name = "link_title") final String linkTitle, final String distinguished, final boolean stickied, final String subreddit, @n(name = "subreddit_id") final String subredditKindWithId, @n(name = "subreddit_name_prefixed") final String subredditNamePrefixed, @n(name = "link_id") final String linkKindWithId, @n(name = "score_hidden") final boolean scoreHidden, @n(name = "link_url") final String linkUrl, final boolean subscribed, final boolean saved, final Boolean approved, final Boolean spam, @n(name = "banned_by") final BannedBy bannedBy, final Boolean removed, @n(name = "approved_by") final String approvedBy, @n(name = "num_reports") final Integer numReports, @n(name = "mod_reports") final List<? extends List<String>> modReports, @n(name = "user_reports") final List<? extends List<String>> userReports, final ModQueueTriggers modQueueTriggers, final NoteLabel modNoteLabel, final int depth, @n(name = "created_utc") final long createdUtc, final List<? extends IComment> replies, @n(name = "all_awardings") final List<Award> awards, @n(name = "treatment_tags") final List<String> treatmentTags, @n(name = "author_flair_template_id") final String authorFlairTemplateId, @n(name = "author_flair_background_color") final String authorFlairBackgroundColor, @n(name = "author_flair_text_color") final String authorFlairTextColor, final RichTextResponse rtjson, @n(name = "author_fullname") final String authorKindWithId, final boolean collapsed, @n(name = "media_metadata") final Map<String, MediaMetaData> mediaMetadata, @n(name = "associated_award") final Award associatedAward, @n(name = "profile_img") final String profileImg, @n(name = "profile_over_18") final Boolean profileOver18, @n(name = "collapsed_because_crowd_control") final Boolean isCollapsedBecauseOfCrowdControl, @n(name = "collapsed_reason_code") final String collapsedReasonCode, @n(name = "unrepliable_reason") final String unrepliableReason, @n(name = "author_snoovatar_img") final String snoovatarImg, final boolean authorIconIsDefault, final boolean authorIconIsNsfw, @n(name = "comment_type") final String commentType) {
        e.f((Object)id, "id");
        e.f((Object)kindWithId, "kindWithId");
        e.f((Object)parentKindWithId, "parentKindWithId");
        e.f((Object)body, "body");
        e.f((Object)bodyHtml, "bodyHtml");
        e.f((Object)author, "author");
        e.f((Object)subreddit, "subreddit");
        e.f((Object)subredditKindWithId, "subredditKindWithId");
        e.f((Object)subredditNamePrefixed, "subredditNamePrefixed");
        e.f((Object)linkKindWithId, "linkKindWithId");
        e.f((Object)modReports, "modReports");
        e.f((Object)userReports, "userReports");
        e.f((Object)awards, "awards");
        e.f((Object)treatmentTags, "treatmentTags");
        e.f((Object)authorKindWithId, "authorKindWithId");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.kindWithId = kindWithId;
        this.parentKindWithId = parentKindWithId;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.score = score;
        this.author = author;
        this.modProxyAuthor = modProxyAuthor;
        this.modProxyAuthorKindWithId = modProxyAuthorKindWithId;
        this.authorFlairText = authorFlairText;
        this.authorFlairRichText = authorFlairRichText;
        this.authorCakeDay = authorCakeDay;
        this.authorIconUrl = authorIconUrl;
        this.archived = archived;
        this.locked = locked;
        this.voteState = voteState;
        this.linkTitle = linkTitle;
        this.distinguished = distinguished;
        this.stickied = stickied;
        this.subreddit = subreddit;
        this.subredditKindWithId = subredditKindWithId;
        this.subredditNamePrefixed = subredditNamePrefixed;
        this.linkKindWithId = linkKindWithId;
        this.scoreHidden = scoreHidden;
        this.linkUrl = linkUrl;
        this.subscribed = subscribed;
        this.saved = saved;
        this.approved = approved;
        this.spam = spam;
        this.bannedBy = bannedBy;
        this.removed = removed;
        this.approvedBy = approvedBy;
        this.numReports = numReports;
        this.modReports = (List<List<String>>)modReports;
        this.userReports = (List<List<String>>)userReports;
        this.modQueueTriggers = modQueueTriggers;
        this.modNoteLabel = modNoteLabel;
        this.depth = depth;
        this.createdUtc = createdUtc;
        this.replies = (List<IComment>)replies;
        this.awards = awards;
        this.treatmentTags = treatmentTags;
        this.authorFlairTemplateId = authorFlairTemplateId;
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
        this.authorFlairTextColor = authorFlairTextColor;
        this.rtjson = rtjson;
        this.authorKindWithId = authorKindWithId;
        this.collapsed = collapsed;
        this.mediaMetadata = mediaMetadata;
        this.associatedAward = associatedAward;
        this.profileImg = profileImg;
        this.profileOver18 = profileOver18;
        this.isCollapsedBecauseOfCrowdControl = isCollapsedBecauseOfCrowdControl;
        this.collapsedReasonCode = collapsedReasonCode;
        this.unrepliableReason = unrepliableReason;
        this.snoovatarImg = snoovatarImg;
        this.authorIconIsDefault = authorIconIsDefault;
        this.authorIconIsNsfw = authorIconIsNsfw;
        this.commentType = commentType;
    }
    
    public Comment(String s, String s2, String s3, String s4, String s5, int n, String s6, String s7, String s8, String s9, List list, Boolean b, String s10, boolean b2, boolean b3, Boolean b4, String s11, String s12, boolean b5, String s13, String s14, String s15, String s16, boolean b6, String s17, boolean b7, boolean b8, Boolean b9, Boolean b10, BannedBy bannedBy, Boolean b11, String s18, Integer n2, List instance, List instance2, ModQueueTriggers modQueueTriggers, NoteLabel noteLabel, int n3, long n4, List list2, List instance3, List instance4, String s19, String s20, String s21, RichTextResponse richTextResponse, String s22, boolean b12, Map map, Award award, String s23, Boolean false, Boolean b13, String s24, String s25, String s26, boolean b14, boolean b15, String s27, final int n5, final int n6, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n5 & 0x1) != 0x0) {
            s = "";
        }
        if ((n5 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n5 & 0x4) != 0x0) {
            s3 = "";
        }
        if ((n5 & 0x8) != 0x0) {
            s4 = "";
        }
        if ((n5 & 0x10) != 0x0) {
            s5 = "";
        }
        if ((n5 & 0x20) != 0x0) {
            n = 0;
        }
        if ((n5 & 0x40) != 0x0) {
            s6 = "";
        }
        if ((n5 & 0x80) != 0x0) {
            s7 = null;
        }
        if ((n5 & 0x100) != 0x0) {
            s8 = null;
        }
        if ((n5 & 0x200) != 0x0) {
            s9 = null;
        }
        if ((n5 & 0x400) != 0x0) {
            list = null;
        }
        if ((n5 & 0x800) != 0x0) {
            b = null;
        }
        if ((n5 & 0x1000) != 0x0) {
            s10 = null;
        }
        if ((n5 & 0x2000) != 0x0) {
            b2 = false;
        }
        if ((n5 & 0x4000) != 0x0) {
            b3 = false;
        }
        if ((n5 & 0x8000) != 0x0) {
            b4 = null;
        }
        if ((n5 & 0x10000) != 0x0) {
            s11 = null;
        }
        if ((n5 & 0x20000) != 0x0) {
            s12 = null;
        }
        if ((n5 & 0x40000) != 0x0) {
            b5 = false;
        }
        if ((n5 & 0x80000) != 0x0) {
            s13 = "";
        }
        if ((n5 & 0x100000) != 0x0) {
            s14 = "";
        }
        if ((n5 & 0x200000) != 0x0) {
            s15 = "";
        }
        if ((n5 & 0x400000) != 0x0) {
            s16 = "";
        }
        if ((n5 & 0x800000) != 0x0) {
            b6 = false;
        }
        if ((n5 & 0x1000000) != 0x0) {
            s17 = null;
        }
        if ((n5 & 0x2000000) != 0x0) {
            b7 = false;
        }
        if ((n5 & 0x4000000) != 0x0) {
            b8 = false;
        }
        if ((n5 & 0x8000000) != 0x0) {
            b9 = null;
        }
        if ((n5 & 0x10000000) != 0x0) {
            b10 = null;
        }
        if ((n5 & 0x20000000) != 0x0) {
            bannedBy = null;
        }
        if ((n5 & 0x40000000) != 0x0) {
            b11 = null;
        }
        if ((n5 & Integer.MIN_VALUE) != 0x0) {
            s18 = null;
        }
        if ((n6 & 0x1) != 0x0) {
            n2 = null;
        }
        if ((n6 & 0x2) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n6 & 0x4) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        if ((n6 & 0x8) != 0x0) {
            modQueueTriggers = null;
        }
        if ((n6 & 0x10) != 0x0) {
            noteLabel = null;
        }
        if ((n6 & 0x20) != 0x0) {
            n3 = 0;
        }
        if ((n6 & 0x40) != 0x0) {
            n4 = 0L;
        }
        if ((n6 & 0x80) != 0x0) {
            list2 = null;
        }
        if ((n6 & 0x100) != 0x0) {
            instance3 = EmptyList.INSTANCE;
        }
        if ((n6 & 0x200) != 0x0) {
            instance4 = EmptyList.INSTANCE;
        }
        if ((n6 & 0x400) != 0x0) {
            s19 = null;
        }
        if ((n6 & 0x800) != 0x0) {
            s20 = null;
        }
        if ((n6 & 0x1000) != 0x0) {
            s21 = null;
        }
        if ((n6 & 0x2000) != 0x0) {
            richTextResponse = null;
        }
        if ((n6 & 0x4000) != 0x0) {
            s22 = "";
        }
        if ((n6 & 0x8000) != 0x0) {
            b12 = false;
        }
        if ((n6 & 0x10000) != 0x0) {
            map = null;
        }
        if ((n6 & 0x20000) != 0x0) {
            award = null;
        }
        if ((n6 & 0x40000) != 0x0) {
            s23 = null;
        }
        if ((n6 & 0x80000) != 0x0) {
            false = Boolean.FALSE;
        }
        if ((n6 & 0x100000) != 0x0) {
            b13 = null;
        }
        if ((n6 & 0x200000) != 0x0) {
            s24 = null;
        }
        if ((n6 & 0x400000) != 0x0) {
            s25 = null;
        }
        if ((n6 & 0x800000) != 0x0) {
            s26 = null;
        }
        if ((n6 & 0x1000000) != 0x0) {
            b14 = false;
        }
        if ((n6 & 0x2000000) != 0x0) {
            b15 = false;
        }
        if ((n6 & 0x4000000) != 0x0) {
            s27 = null;
        }
        this(s, s2, s3, s4, s5, n, s6, s7, s8, s9, list, b, s10, b2, b3, b4, s11, s12, b5, s13, s14, s15, s16, b6, s17, b7, b8, b9, b10, bannedBy, b11, s18, n2, (List<? extends List<String>>)instance, (List<? extends List<String>>)instance2, modQueueTriggers, noteLabel, n3, n4, list2, (List<Award>)instance3, (List<String>)instance4, s19, s20, s21, richTextResponse, s22, b12, map, award, s23, false, b13, s24, s25, s26, b14, b15, s27);
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component10() {
        return this.getAuthorFlairText();
    }
    
    public final List<FlairRichTextItem> component11() {
        return this.getAuthorFlairRichText();
    }
    
    public final Boolean component12() {
        return this.getAuthorCakeDay();
    }
    
    public final String component13() {
        return this.authorIconUrl;
    }
    
    public final boolean component14() {
        return this.archived;
    }
    
    public final boolean component15() {
        return this.locked;
    }
    
    public final Boolean component16() {
        return this.voteState;
    }
    
    public final String component17() {
        return this.linkTitle;
    }
    
    public final String component18() {
        return this.getDistinguished();
    }
    
    public final boolean component19() {
        return this.stickied;
    }
    
    public final String component2() {
        return this.getKindWithId();
    }
    
    public final String component20() {
        return this.getSubreddit();
    }
    
    public final String component21() {
        return this.subredditKindWithId;
    }
    
    public final String component22() {
        return this.subredditNamePrefixed;
    }
    
    public final String component23() {
        return this.linkKindWithId;
    }
    
    public final boolean component24() {
        return this.scoreHidden;
    }
    
    public final String component25() {
        return this.linkUrl;
    }
    
    public final boolean component26() {
        return this.subscribed;
    }
    
    public final boolean component27() {
        return this.saved;
    }
    
    public final Boolean component28() {
        return this.approved;
    }
    
    public final Boolean component29() {
        return this.spam;
    }
    
    public final String component3() {
        return this.getParentKindWithId();
    }
    
    public final BannedBy component30() {
        return this.bannedBy;
    }
    
    public final Boolean component31() {
        return this.removed;
    }
    
    public final String component32() {
        return this.approvedBy;
    }
    
    public final Integer component33() {
        return this.numReports;
    }
    
    public final List<List<String>> component34() {
        return this.modReports;
    }
    
    public final List<List<String>> component35() {
        return this.userReports;
    }
    
    public final ModQueueTriggers component36() {
        return this.modQueueTriggers;
    }
    
    public final NoteLabel component37() {
        return this.modNoteLabel;
    }
    
    public final int component38() {
        return this.getDepth();
    }
    
    public final long component39() {
        return this.getCreatedUtc();
    }
    
    public final String component4() {
        return this.body;
    }
    
    public final List<IComment> component40() {
        return this.replies;
    }
    
    public final List<Award> component41() {
        return this.getAwards();
    }
    
    public final List<String> component42() {
        return this.getTreatmentTags();
    }
    
    public final String component43() {
        return this.authorFlairTemplateId;
    }
    
    public final String component44() {
        return this.authorFlairBackgroundColor;
    }
    
    public final String component45() {
        return this.authorFlairTextColor;
    }
    
    public final RichTextResponse component46() {
        return this.rtjson;
    }
    
    public final String component47() {
        return this.authorKindWithId;
    }
    
    public final boolean component48() {
        return this.collapsed;
    }
    
    public final Map<String, MediaMetaData> component49() {
        return this.mediaMetadata;
    }
    
    public final String component5() {
        return this.getBodyHtml();
    }
    
    public final Award component50() {
        return this.associatedAward;
    }
    
    public final String component51() {
        return this.profileImg;
    }
    
    public final Boolean component52() {
        return this.profileOver18;
    }
    
    public final Boolean component53() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    public final String component54() {
        return this.collapsedReasonCode;
    }
    
    public final String component55() {
        return this.unrepliableReason;
    }
    
    public final String component56() {
        return this.snoovatarImg;
    }
    
    public final boolean component57() {
        return this.authorIconIsDefault;
    }
    
    public final boolean component58() {
        return this.authorIconIsNsfw;
    }
    
    public final String component59() {
        return this.commentType;
    }
    
    public final int component6() {
        return this.getScore();
    }
    
    public final String component7() {
        return this.getAuthor();
    }
    
    public final String component8() {
        return this.modProxyAuthor;
    }
    
    public final String component9() {
        return this.modProxyAuthorKindWithId;
    }
    
    public final Comment copy(final String s, @n(name = "name") final String s2, @n(name = "parent_id") final String s3, final String s4, @n(name = "body_html") final String s5, final int n, final String s6, final String s7, final String s8, @n(name = "author_flair_text") final String s9, @n(name = "author_flair_richtext") final List<FlairRichTextItem> list, @n(name = "author_cakeday") final Boolean b, final String s10, final boolean b2, final boolean b3, @n(name = "likes") final Boolean b4, @n(name = "link_title") final String s11, final String s12, final boolean b5, final String s13, @n(name = "subreddit_id") final String s14, @n(name = "subreddit_name_prefixed") final String s15, @n(name = "link_id") final String s16, @n(name = "score_hidden") final boolean b6, @n(name = "link_url") final String s17, final boolean b7, final boolean b8, final Boolean b9, final Boolean b10, @n(name = "banned_by") final BannedBy bannedBy, final Boolean b11, @n(name = "approved_by") final String s18, @n(name = "num_reports") final Integer n2, @n(name = "mod_reports") final List<? extends List<String>> list2, @n(name = "user_reports") final List<? extends List<String>> list3, final ModQueueTriggers modQueueTriggers, final NoteLabel noteLabel, final int n3, @n(name = "created_utc") final long n4, final List<? extends IComment> list4, @n(name = "all_awardings") final List<Award> list5, @n(name = "treatment_tags") final List<String> list6, @n(name = "author_flair_template_id") final String s19, @n(name = "author_flair_background_color") final String s20, @n(name = "author_flair_text_color") final String s21, final RichTextResponse richTextResponse, @n(name = "author_fullname") final String s22, final boolean b12, @n(name = "media_metadata") final Map<String, MediaMetaData> map, @n(name = "associated_award") final Award award, @n(name = "profile_img") final String s23, @n(name = "profile_over_18") final Boolean b13, @n(name = "collapsed_because_crowd_control") final Boolean b14, @n(name = "collapsed_reason_code") final String s24, @n(name = "unrepliable_reason") final String s25, @n(name = "author_snoovatar_img") final String s26, final boolean b15, final boolean b16, @n(name = "comment_type") final String s27) {
        e.f((Object)s, "id");
        e.f((Object)s2, "kindWithId");
        e.f((Object)s3, "parentKindWithId");
        e.f((Object)s4, "body");
        e.f((Object)s5, "bodyHtml");
        e.f((Object)s6, "author");
        e.f((Object)s13, "subreddit");
        e.f((Object)s14, "subredditKindWithId");
        e.f((Object)s15, "subredditNamePrefixed");
        e.f((Object)s16, "linkKindWithId");
        e.f((Object)list2, "modReports");
        e.f((Object)list3, "userReports");
        e.f((Object)list5, "awards");
        e.f((Object)list6, "treatmentTags");
        e.f((Object)s22, "authorKindWithId");
        return new Comment(s, s2, s3, s4, s5, n, s6, s7, s8, s9, list, b, s10, b2, b3, b4, s11, s12, b5, s13, s14, s15, s16, b6, s17, b7, b8, b9, b10, bannedBy, b11, s18, n2, list2, list3, modQueueTriggers, noteLabel, n3, n4, list4, list5, list6, s19, s20, s21, richTextResponse, s22, b12, map, award, s23, b13, b14, s24, s25, s26, b15, b16, s27);
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
        return e.a((Object)this.getId(), (Object)comment.getId()) && e.a((Object)this.getKindWithId(), (Object)comment.getKindWithId()) && e.a((Object)this.getParentKindWithId(), (Object)comment.getParentKindWithId()) && e.a((Object)this.body, (Object)comment.body) && e.a((Object)this.getBodyHtml(), (Object)comment.getBodyHtml()) && this.getScore() == comment.getScore() && e.a((Object)this.getAuthor(), (Object)comment.getAuthor()) && e.a((Object)this.modProxyAuthor, (Object)comment.modProxyAuthor) && e.a((Object)this.modProxyAuthorKindWithId, (Object)comment.modProxyAuthorKindWithId) && e.a((Object)this.getAuthorFlairText(), (Object)comment.getAuthorFlairText()) && e.a((Object)this.getAuthorFlairRichText(), (Object)comment.getAuthorFlairRichText()) && e.a((Object)this.getAuthorCakeDay(), (Object)comment.getAuthorCakeDay()) && e.a((Object)this.authorIconUrl, (Object)comment.authorIconUrl) && this.archived == comment.archived && this.locked == comment.locked && e.a((Object)this.voteState, (Object)comment.voteState) && e.a((Object)this.linkTitle, (Object)comment.linkTitle) && e.a((Object)this.getDistinguished(), (Object)comment.getDistinguished()) && this.stickied == comment.stickied && e.a((Object)this.getSubreddit(), (Object)comment.getSubreddit()) && e.a((Object)this.subredditKindWithId, (Object)comment.subredditKindWithId) && e.a((Object)this.subredditNamePrefixed, (Object)comment.subredditNamePrefixed) && e.a((Object)this.linkKindWithId, (Object)comment.linkKindWithId) && this.scoreHidden == comment.scoreHidden && e.a((Object)this.linkUrl, (Object)comment.linkUrl) && this.subscribed == comment.subscribed && this.saved == comment.saved && e.a((Object)this.approved, (Object)comment.approved) && e.a((Object)this.spam, (Object)comment.spam) && e.a((Object)this.bannedBy, (Object)comment.bannedBy) && e.a((Object)this.removed, (Object)comment.removed) && e.a((Object)this.approvedBy, (Object)comment.approvedBy) && e.a((Object)this.numReports, (Object)comment.numReports) && e.a((Object)this.modReports, (Object)comment.modReports) && e.a((Object)this.userReports, (Object)comment.userReports) && e.a((Object)this.modQueueTriggers, (Object)comment.modQueueTriggers) && this.modNoteLabel == comment.modNoteLabel && this.getDepth() == comment.getDepth() && this.getCreatedUtc() == comment.getCreatedUtc() && e.a((Object)this.replies, (Object)comment.replies) && e.a((Object)this.getAwards(), (Object)comment.getAwards()) && e.a((Object)this.getTreatmentTags(), (Object)comment.getTreatmentTags()) && e.a((Object)this.authorFlairTemplateId, (Object)comment.authorFlairTemplateId) && e.a((Object)this.authorFlairBackgroundColor, (Object)comment.authorFlairBackgroundColor) && e.a((Object)this.authorFlairTextColor, (Object)comment.authorFlairTextColor) && e.a((Object)this.rtjson, (Object)comment.rtjson) && e.a((Object)this.authorKindWithId, (Object)comment.authorKindWithId) && this.collapsed == comment.collapsed && e.a((Object)this.mediaMetadata, (Object)comment.mediaMetadata) && e.a((Object)this.associatedAward, (Object)comment.associatedAward) && e.a((Object)this.profileImg, (Object)comment.profileImg) && e.a((Object)this.profileOver18, (Object)comment.profileOver18) && e.a((Object)this.isCollapsedBecauseOfCrowdControl, (Object)comment.isCollapsedBecauseOfCrowdControl) && e.a((Object)this.collapsedReasonCode, (Object)comment.collapsedReasonCode) && e.a((Object)this.unrepliableReason, (Object)comment.unrepliableReason) && e.a((Object)this.snoovatarImg, (Object)comment.snoovatarImg) && this.authorIconIsDefault == comment.authorIconIsDefault && this.authorIconIsNsfw == comment.authorIconIsNsfw && e.a((Object)this.commentType, (Object)comment.commentType);
    }
    
    public final Boolean getApproved() {
        return this.approved;
    }
    
    public final String getApprovedBy() {
        return this.approvedBy;
    }
    
    public final boolean getArchived() {
        return this.archived;
    }
    
    public final Award getAssociatedAward() {
        return this.associatedAward;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public Boolean getAuthorCakeDay() {
        return this.authorCakeDay;
    }
    
    public final String getAuthorFlairBackgroundColor() {
        return this.authorFlairBackgroundColor;
    }
    
    public List<FlairRichTextItem> getAuthorFlairRichText() {
        return this.authorFlairRichText;
    }
    
    public final String getAuthorFlairTemplateId() {
        return this.authorFlairTemplateId;
    }
    
    public String getAuthorFlairText() {
        return this.authorFlairText;
    }
    
    public final String getAuthorFlairTextColor() {
        return this.authorFlairTextColor;
    }
    
    public final boolean getAuthorIconIsDefault() {
        return this.authorIconIsDefault;
    }
    
    public final boolean getAuthorIconIsNsfw() {
        return this.authorIconIsNsfw;
    }
    
    public final String getAuthorIconUrl() {
        return this.authorIconUrl;
    }
    
    public final String getAuthorKindWithId() {
        return this.authorKindWithId;
    }
    
    public List<Award> getAwards() {
        return this.awards;
    }
    
    public final BannedBy getBannedBy() {
        return this.bannedBy;
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public String getBodyHtml() {
        return this.bodyHtml;
    }
    
    public final boolean getCollapsed() {
        return this.collapsed;
    }
    
    public final String getCollapsedReasonCode() {
        return this.collapsedReasonCode;
    }
    
    public final String getCommentType() {
        return this.commentType;
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    public String getDistinguished() {
        return this.distinguished;
    }
    
    public String getId() {
        return this.id;
    }
    
    public List<IComment> getInternalCommentReplies() {
        final List<IComment> replies = this.replies;
        List list;
        if (replies != null) {
            list = CollectionsKt___CollectionsKt.r4((Collection)replies);
        }
        else {
            list = super.getInternalCommentReplies();
        }
        return list;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public String getLinkId() {
        return this.linkKindWithId;
    }
    
    public final String getLinkKindWithId() {
        return this.linkKindWithId;
    }
    
    public final String getLinkTitle() {
        return this.linkTitle;
    }
    
    public final String getLinkUrl() {
        return this.linkUrl;
    }
    
    public final boolean getLocked() {
        return this.locked;
    }
    
    public final Map<String, MediaMetaData> getMediaMetadata() {
        return this.mediaMetadata;
    }
    
    public final NoteLabel getModNoteLabel() {
        return this.modNoteLabel;
    }
    
    public final String getModProxyAuthor() {
        return this.modProxyAuthor;
    }
    
    public final String getModProxyAuthorKindWithId() {
        return this.modProxyAuthorKindWithId;
    }
    
    public final ModQueueTriggers getModQueueTriggers() {
        return this.modQueueTriggers;
    }
    
    public final List<List<String>> getModReports() {
        return this.modReports;
    }
    
    public final Integer getNumReports() {
        return this.numReports;
    }
    
    public String getParentKindWithId() {
        return this.parentKindWithId;
    }
    
    public final String getProfileImg() {
        return this.profileImg;
    }
    
    public final Boolean getProfileOver18() {
        return this.profileOver18;
    }
    
    public final Boolean getRemoved() {
        return this.removed;
    }
    
    public final List<IComment> getReplies() {
        return this.replies;
    }
    
    public final RichTextResponse getRtjson() {
        return this.rtjson;
    }
    
    public final boolean getSaved() {
        return this.saved;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public final boolean getScoreHidden() {
        return this.scoreHidden;
    }
    
    public final String getSnoovatarImg() {
        return this.snoovatarImg;
    }
    
    public final Boolean getSpam() {
        return this.spam;
    }
    
    public final boolean getStickied() {
        return this.stickied;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public String getSubredditId() {
        return this.subredditKindWithId;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    public final String getSubredditNamePrefixed() {
        return this.subredditNamePrefixed;
    }
    
    public final boolean getSubscribed() {
        return this.subscribed;
    }
    
    public List<String> getTreatmentTags() {
        return this.treatmentTags;
    }
    
    public final String getUnrepliableReason() {
        return this.unrepliableReason;
    }
    
    public final List<List<String>> getUserReports() {
        return this.userReports;
    }
    
    public final Boolean getVoteState() {
        return this.voteState;
    }
    
    public int hashCode() {
        final int c = b.c(this.body, (this.getParentKindWithId().hashCode() + (this.getKindWithId().hashCode() + this.getId().hashCode() * 31) * 31) * 31, 31);
        final int hashCode = this.getBodyHtml().hashCode();
        final int hashCode2 = Integer.hashCode(this.getScore());
        final int hashCode3 = this.getAuthor().hashCode();
        final String modProxyAuthor = this.modProxyAuthor;
        final int n = 0;
        int hashCode4;
        if (modProxyAuthor == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = modProxyAuthor.hashCode();
        }
        final String modProxyAuthorKindWithId = this.modProxyAuthorKindWithId;
        int hashCode5;
        if (modProxyAuthorKindWithId == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = modProxyAuthorKindWithId.hashCode();
        }
        int hashCode6;
        if (this.getAuthorFlairText() == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getAuthorFlairText().hashCode();
        }
        int hashCode7;
        if (this.getAuthorFlairRichText() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getAuthorFlairRichText().hashCode();
        }
        int hashCode8;
        if (this.getAuthorCakeDay() == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = this.getAuthorCakeDay().hashCode();
        }
        final String authorIconUrl = this.authorIconUrl;
        int hashCode9;
        if (authorIconUrl == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = authorIconUrl.hashCode();
        }
        final int archived = this.archived ? 1 : 0;
        final int n2 = 1;
        int n3 = archived;
        if (archived != 0) {
            n3 = 1;
        }
        int locked;
        if ((locked = (this.locked ? 1 : 0)) != 0) {
            locked = 1;
        }
        final Boolean voteState = this.voteState;
        int hashCode10;
        if (voteState == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = voteState.hashCode();
        }
        final String linkTitle = this.linkTitle;
        int hashCode11;
        if (linkTitle == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = linkTitle.hashCode();
        }
        int hashCode12;
        if (this.getDistinguished() == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = this.getDistinguished().hashCode();
        }
        int stickied;
        if ((stickied = (this.stickied ? 1 : 0)) != 0) {
            stickied = 1;
        }
        final int c2 = b.c(this.linkKindWithId, b.c(this.subredditNamePrefixed, b.c(this.subredditKindWithId, (this.getSubreddit().hashCode() + (((((((((((((hashCode3 + (hashCode2 + (hashCode + c) * 31) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + n3) * 31 + locked) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + stickied) * 31) * 31, 31), 31), 31);
        int scoreHidden;
        if ((scoreHidden = (this.scoreHidden ? 1 : 0)) != 0) {
            scoreHidden = 1;
        }
        final String linkUrl = this.linkUrl;
        int hashCode13;
        if (linkUrl == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = linkUrl.hashCode();
        }
        int subscribed;
        if ((subscribed = (this.subscribed ? 1 : 0)) != 0) {
            subscribed = 1;
        }
        int saved;
        if ((saved = (this.saved ? 1 : 0)) != 0) {
            saved = 1;
        }
        final Boolean approved = this.approved;
        int hashCode14;
        if (approved == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = approved.hashCode();
        }
        final Boolean spam = this.spam;
        int hashCode15;
        if (spam == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = spam.hashCode();
        }
        final BannedBy bannedBy = this.bannedBy;
        int hashCode16;
        if (bannedBy == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = bannedBy.hashCode();
        }
        final Boolean removed = this.removed;
        int hashCode17;
        if (removed == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = removed.hashCode();
        }
        final String approvedBy = this.approvedBy;
        int hashCode18;
        if (approvedBy == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = approvedBy.hashCode();
        }
        final Integer numReports = this.numReports;
        int hashCode19;
        if (numReports == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = numReports.hashCode();
        }
        final int c3 = aw.b.c((List)this.userReports, aw.b.c((List)this.modReports, ((((((((((c2 + scoreHidden) * 31 + hashCode13) * 31 + subscribed) * 31 + saved) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31, 31), 31);
        final ModQueueTriggers modQueueTriggers = this.modQueueTriggers;
        int hashCode20;
        if (modQueueTriggers == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = modQueueTriggers.hashCode();
        }
        final NoteLabel modNoteLabel = this.modNoteLabel;
        int hashCode21;
        if (modNoteLabel == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = modNoteLabel.hashCode();
        }
        final int hashCode22 = Integer.hashCode(this.getDepth());
        final int hashCode23 = Long.hashCode(this.getCreatedUtc());
        final List<IComment> replies = this.replies;
        int hashCode24;
        if (replies == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = replies.hashCode();
        }
        final int hashCode25 = this.getAwards().hashCode();
        final int hashCode26 = this.getTreatmentTags().hashCode();
        final String authorFlairTemplateId = this.authorFlairTemplateId;
        int hashCode27;
        if (authorFlairTemplateId == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = authorFlairTemplateId.hashCode();
        }
        final String authorFlairBackgroundColor = this.authorFlairBackgroundColor;
        int hashCode28;
        if (authorFlairBackgroundColor == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = authorFlairBackgroundColor.hashCode();
        }
        final String authorFlairTextColor = this.authorFlairTextColor;
        int hashCode29;
        if (authorFlairTextColor == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = authorFlairTextColor.hashCode();
        }
        final RichTextResponse rtjson = this.rtjson;
        int hashCode30;
        if (rtjson == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = rtjson.hashCode();
        }
        final int c4 = b.c(this.authorKindWithId, (((((hashCode26 + (hashCode25 + ((hashCode23 + (hashCode22 + ((c3 + hashCode20) * 31 + hashCode21) * 31) * 31) * 31 + hashCode24) * 31) * 31) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + hashCode30) * 31, 31);
        int collapsed;
        if ((collapsed = (this.collapsed ? 1 : 0)) != 0) {
            collapsed = 1;
        }
        final Map<String, MediaMetaData> mediaMetadata = this.mediaMetadata;
        int hashCode31;
        if (mediaMetadata == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = mediaMetadata.hashCode();
        }
        final Award associatedAward = this.associatedAward;
        int hashCode32;
        if (associatedAward == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = associatedAward.hashCode();
        }
        final String profileImg = this.profileImg;
        int hashCode33;
        if (profileImg == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = profileImg.hashCode();
        }
        final Boolean profileOver18 = this.profileOver18;
        int hashCode34;
        if (profileOver18 == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = profileOver18.hashCode();
        }
        final Boolean isCollapsedBecauseOfCrowdControl = this.isCollapsedBecauseOfCrowdControl;
        int hashCode35;
        if (isCollapsedBecauseOfCrowdControl == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = isCollapsedBecauseOfCrowdControl.hashCode();
        }
        final String collapsedReasonCode = this.collapsedReasonCode;
        int hashCode36;
        if (collapsedReasonCode == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = collapsedReasonCode.hashCode();
        }
        final String unrepliableReason = this.unrepliableReason;
        int hashCode37;
        if (unrepliableReason == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = unrepliableReason.hashCode();
        }
        final String snoovatarImg = this.snoovatarImg;
        int hashCode38;
        if (snoovatarImg == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = snoovatarImg.hashCode();
        }
        int authorIconIsDefault;
        if ((authorIconIsDefault = (this.authorIconIsDefault ? 1 : 0)) != 0) {
            authorIconIsDefault = 1;
        }
        int authorIconIsNsfw = this.authorIconIsNsfw ? 1 : 0;
        if (authorIconIsNsfw != 0) {
            authorIconIsNsfw = n2;
        }
        final String commentType = this.commentType;
        int hashCode39;
        if (commentType == null) {
            hashCode39 = n;
        }
        else {
            hashCode39 = commentType.hashCode();
        }
        return (((((((((((c4 + collapsed) * 31 + hashCode31) * 31 + hashCode32) * 31 + hashCode33) * 31 + hashCode34) * 31 + hashCode35) * 31 + hashCode36) * 31 + hashCode37) * 31 + hashCode38) * 31 + authorIconIsDefault) * 31 + authorIconIsNsfw) * 31 + hashCode39;
    }
    
    public final Boolean isCollapsedBecauseOfCrowdControl() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    public final boolean isPredictionSystemComment() {
        return e.a((Object)this.commentType, (Object)"PREDICTION");
    }
    
    public String toString() {
        final StringBuilder r = a.r("Comment(id=");
        r.append(this.getId());
        r.append(", kindWithId=");
        r.append(this.getKindWithId());
        r.append(", parentKindWithId=");
        r.append(this.getParentKindWithId());
        r.append(", body=");
        r.append(this.body);
        r.append(", bodyHtml=");
        r.append(this.getBodyHtml());
        r.append(", score=");
        r.append(this.getScore());
        r.append(", author=");
        r.append(this.getAuthor());
        r.append(", modProxyAuthor=");
        r.append(this.modProxyAuthor);
        r.append(", modProxyAuthorKindWithId=");
        r.append(this.modProxyAuthorKindWithId);
        r.append(", authorFlairText=");
        r.append(this.getAuthorFlairText());
        r.append(", authorFlairRichText=");
        r.append(this.getAuthorFlairRichText());
        r.append(", authorCakeDay=");
        r.append(this.getAuthorCakeDay());
        r.append(", authorIconUrl=");
        r.append(this.authorIconUrl);
        r.append(", archived=");
        r.append(this.archived);
        r.append(", locked=");
        r.append(this.locked);
        r.append(", voteState=");
        r.append(this.voteState);
        r.append(", linkTitle=");
        r.append(this.linkTitle);
        r.append(", distinguished=");
        r.append(this.getDistinguished());
        r.append(", stickied=");
        r.append(this.stickied);
        r.append(", subreddit=");
        r.append(this.getSubreddit());
        r.append(", subredditKindWithId=");
        r.append(this.subredditKindWithId);
        r.append(", subredditNamePrefixed=");
        r.append(this.subredditNamePrefixed);
        r.append(", linkKindWithId=");
        r.append(this.linkKindWithId);
        r.append(", scoreHidden=");
        r.append(this.scoreHidden);
        r.append(", linkUrl=");
        r.append(this.linkUrl);
        r.append(", subscribed=");
        r.append(this.subscribed);
        r.append(", saved=");
        r.append(this.saved);
        r.append(", approved=");
        r.append(this.approved);
        r.append(", spam=");
        r.append(this.spam);
        r.append(", bannedBy=");
        r.append(this.bannedBy);
        r.append(", removed=");
        r.append(this.removed);
        r.append(", approvedBy=");
        r.append(this.approvedBy);
        r.append(", numReports=");
        r.append(this.numReports);
        r.append(", modReports=");
        r.append(this.modReports);
        r.append(", userReports=");
        r.append(this.userReports);
        r.append(", modQueueTriggers=");
        r.append(this.modQueueTriggers);
        r.append(", modNoteLabel=");
        r.append(this.modNoteLabel);
        r.append(", depth=");
        r.append(this.getDepth());
        r.append(", createdUtc=");
        r.append(this.getCreatedUtc());
        r.append(", replies=");
        r.append(this.replies);
        r.append(", awards=");
        r.append(this.getAwards());
        r.append(", treatmentTags=");
        r.append(this.getTreatmentTags());
        r.append(", authorFlairTemplateId=");
        r.append(this.authorFlairTemplateId);
        r.append(", authorFlairBackgroundColor=");
        r.append(this.authorFlairBackgroundColor);
        r.append(", authorFlairTextColor=");
        r.append(this.authorFlairTextColor);
        r.append(", rtjson=");
        r.append(this.rtjson);
        r.append(", authorKindWithId=");
        r.append(this.authorKindWithId);
        r.append(", collapsed=");
        r.append(this.collapsed);
        r.append(", mediaMetadata=");
        r.append(this.mediaMetadata);
        r.append(", associatedAward=");
        r.append(this.associatedAward);
        r.append(", profileImg=");
        r.append(this.profileImg);
        r.append(", profileOver18=");
        r.append(this.profileOver18);
        r.append(", isCollapsedBecauseOfCrowdControl=");
        r.append(this.isCollapsedBecauseOfCrowdControl);
        r.append(", collapsedReasonCode=");
        r.append(this.collapsedReasonCode);
        r.append(", unrepliableReason=");
        r.append(this.unrepliableReason);
        r.append(", snoovatarImg=");
        r.append(this.snoovatarImg);
        r.append(", authorIconIsDefault=");
        r.append(this.authorIconIsDefault);
        r.append(", authorIconIsNsfw=");
        r.append(this.authorIconIsNsfw);
        r.append(", commentType=");
        return f0.n(r, this.commentType, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.parentKindWithId);
        parcel.writeString(this.body);
        parcel.writeString(this.bodyHtml);
        parcel.writeInt(this.score);
        parcel.writeString(this.author);
        parcel.writeString(this.modProxyAuthor);
        parcel.writeString(this.modProxyAuthorKindWithId);
        parcel.writeString(this.authorFlairText);
        final List<FlairRichTextItem> authorFlairRichText = this.authorFlairRichText;
        if (authorFlairRichText == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator t = d.t(parcel, 1, (List)authorFlairRichText);
            while (t.hasNext()) {
                ((FlairRichTextItem)t.next()).writeToParcel(parcel, n);
            }
        }
        final Boolean authorCakeDay = this.authorCakeDay;
        if (authorCakeDay == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, authorCakeDay);
        }
        parcel.writeString(this.authorIconUrl);
        parcel.writeInt((int)(this.archived ? 1 : 0));
        parcel.writeInt((int)(this.locked ? 1 : 0));
        final Boolean voteState = this.voteState;
        if (voteState == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, voteState);
        }
        parcel.writeString(this.linkTitle);
        parcel.writeString(this.distinguished);
        parcel.writeInt((int)(this.stickied ? 1 : 0));
        parcel.writeString(this.subreddit);
        parcel.writeString(this.subredditKindWithId);
        parcel.writeString(this.subredditNamePrefixed);
        parcel.writeString(this.linkKindWithId);
        parcel.writeInt((int)(this.scoreHidden ? 1 : 0));
        parcel.writeString(this.linkUrl);
        parcel.writeInt((int)(this.subscribed ? 1 : 0));
        parcel.writeInt((int)(this.saved ? 1 : 0));
        final Boolean approved = this.approved;
        if (approved == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, approved);
        }
        final Boolean spam = this.spam;
        if (spam == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, spam);
        }
        final BannedBy bannedBy = this.bannedBy;
        if (bannedBy == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            bannedBy.writeToParcel(parcel, n);
        }
        final Boolean removed = this.removed;
        if (removed == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, removed);
        }
        parcel.writeString(this.approvedBy);
        final Integer numReports = this.numReports;
        if (numReports == null) {
            parcel.writeInt(0);
        }
        else {
            b.l(parcel, 1, numReports);
        }
        final Iterator s = al0.a.s((List)this.modReports, parcel);
        while (s.hasNext()) {
            parcel.writeStringList((List)s.next());
        }
        final Iterator s2 = al0.a.s((List)this.userReports, parcel);
        while (s2.hasNext()) {
            parcel.writeStringList((List)s2.next());
        }
        final ModQueueTriggers modQueueTriggers = this.modQueueTriggers;
        if (modQueueTriggers == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            modQueueTriggers.writeToParcel(parcel, n);
        }
        parcel.writeParcelable((Parcelable)this.modNoteLabel, n);
        parcel.writeInt(this.depth);
        parcel.writeLong(this.createdUtc);
        final List<IComment> replies = this.replies;
        if (replies == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator t2 = d.t(parcel, 1, (List)replies);
            while (t2.hasNext()) {
                parcel.writeParcelable((Parcelable)t2.next(), n);
            }
        }
        final Iterator s3 = al0.a.s((List)this.awards, parcel);
        while (s3.hasNext()) {
            parcel.writeParcelable((Parcelable)s3.next(), n);
        }
        parcel.writeStringList((List)this.treatmentTags);
        parcel.writeString(this.authorFlairTemplateId);
        parcel.writeString(this.authorFlairBackgroundColor);
        parcel.writeString(this.authorFlairTextColor);
        final RichTextResponse rtjson = this.rtjson;
        if (rtjson == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            rtjson.writeToParcel(parcel, n);
        }
        parcel.writeString(this.authorKindWithId);
        parcel.writeInt((int)(this.collapsed ? 1 : 0));
        final Map<String, MediaMetaData> mediaMetadata = this.mediaMetadata;
        if (mediaMetadata == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(mediaMetadata.size());
            for (final Map.Entry<String, V> entry : mediaMetadata.entrySet()) {
                parcel.writeString((String)entry.getKey());
                ((MediaMetaData)entry.getValue()).writeToParcel(parcel, n);
            }
        }
        parcel.writeParcelable((Parcelable)this.associatedAward, n);
        parcel.writeString(this.profileImg);
        final Boolean profileOver18 = this.profileOver18;
        if (profileOver18 == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, profileOver18);
        }
        final Boolean isCollapsedBecauseOfCrowdControl = this.isCollapsedBecauseOfCrowdControl;
        if (isCollapsedBecauseOfCrowdControl == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, isCollapsedBecauseOfCrowdControl);
        }
        parcel.writeString(this.collapsedReasonCode);
        parcel.writeString(this.unrepliableReason);
        parcel.writeString(this.snoovatarImg);
        parcel.writeInt((int)(this.authorIconIsDefault ? 1 : 0));
        parcel.writeInt((int)(this.authorIconIsNsfw ? 1 : 0));
        parcel.writeString(this.commentType);
    }
}
