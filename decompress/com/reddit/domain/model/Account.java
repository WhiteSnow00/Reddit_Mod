// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import v10.v;
import com.reddit.common.ThingType;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.reddit.domain.model.sociallink.SocialLink;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;
import com.reddit.session.n;

@DisallowInBundle
@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b}\b\u0087\b\u0018\u00002\u00020\u0001B\u00e1\u0003\u0012\u0006\u00109\u001a\u00020\u0002\u0012\b\b\u0001\u0010:\u001a\u00020\u0002\u0012\b\b\u0001\u0010;\u001a\u00020\u0005\u0012\b\b\u0003\u0010<\u001a\u00020\u0007\u0012\b\b\u0003\u0010=\u001a\u00020\u0007\u0012\b\b\u0003\u0010>\u001a\u00020\u0007\u0012\b\b\u0003\u0010?\u001a\u00020\u000b\u0012\b\b\u0003\u0010@\u001a\u00020\u000b\u0012\b\b\u0003\u0010A\u001a\u00020\u000b\u0012\b\b\u0003\u0010B\u001a\u00020\u000b\u0012\b\b\u0003\u0010C\u001a\u00020\u000b\u0012\b\b\u0003\u0010D\u001a\u00020\u0007\u0012\b\b\u0003\u0010E\u001a\u00020\u0007\u0012\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010H\u001a\u00020\u0007\u0012\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0003\u0010K\u001a\u00020\u0002\u0012\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010N\u001a\u00020\u0007\u0012\b\b\u0002\u0010O\u001a\u00020\u0007\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\b\u0003\u0010R\u001a\u00020\u0007\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010T\u001a\u00020\u0007\u0012\b\b\u0003\u0010U\u001a\u00020\u000b\u0012\b\b\u0003\u0010V\u001a\u00020\u0007\u0012\b\b\u0003\u0010W\u001a\u00020\u0007\u0012\b\b\u0003\u0010X\u001a\u00020\u000b\u0012\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010Z\u001a\u00020\u0007\u0012\b\b\u0003\u0010[\u001a\u00020\u0007\u0012\b\b\u0003\u0010\\\u001a\u00020\u0007\u0012\b\b\u0003\u0010]\u001a\u00020\u0007\u0012\u0010\b\u0003\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101\u0012\b\b\u0003\u0010_\u001a\u00020\u0007\u0012\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020501\u0012\u000e\b\u0002\u0010b\u001a\b\u0012\u0004\u0012\u00020701¢\u0006\u0006\b²\u0001\u0010³\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b,\u0010\u0018J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020501H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020701H\u00c6\u0003J\u00ea\u0003\u0010c\u001a\u00020\u00002\b\b\u0002\u00109\u001a\u00020\u00022\b\b\u0003\u0010:\u001a\u00020\u00022\b\b\u0003\u0010;\u001a\u00020\u00052\b\b\u0003\u0010<\u001a\u00020\u00072\b\b\u0003\u0010=\u001a\u00020\u00072\b\b\u0003\u0010>\u001a\u00020\u00072\b\b\u0003\u0010?\u001a\u00020\u000b2\b\b\u0003\u0010@\u001a\u00020\u000b2\b\b\u0003\u0010A\u001a\u00020\u000b2\b\b\u0003\u0010B\u001a\u00020\u000b2\b\b\u0003\u0010C\u001a\u00020\u000b2\b\b\u0003\u0010D\u001a\u00020\u00072\b\b\u0003\u0010E\u001a\u00020\u00072\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010H\u001a\u00020\u00072\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u00192\b\b\u0003\u0010K\u001a\u00020\u00022\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010N\u001a\u00020\u00072\b\b\u0002\u0010O\u001a\u00020\u00072\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!2\b\b\u0003\u0010R\u001a\u00020\u00072\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010T\u001a\u00020\u00072\b\b\u0003\u0010U\u001a\u00020\u000b2\b\b\u0003\u0010V\u001a\u00020\u00072\b\b\u0003\u0010W\u001a\u00020\u00072\b\b\u0003\u0010X\u001a\u00020\u000b2\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010Z\u001a\u00020\u00072\b\b\u0003\u0010[\u001a\u00020\u00072\b\b\u0003\u0010\\\u001a\u00020\u00072\b\b\u0003\u0010]\u001a\u00020\u00072\u0010\b\u0003\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001012\b\b\u0003\u0010_\u001a\u00020\u00072\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u000205012\u000e\b\u0002\u0010b\u001a\b\u0012\u0004\u0012\u00020701H\u00c6\u0001¢\u0006\u0004\bc\u0010dJ\t\u0010e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010h\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010\"H\u00d6\u0003R\u001a\u00109\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010:\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010i\u001a\u0004\bl\u0010kR\u001a\u0010;\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010<\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010p\u001a\u0004\b<\u0010qR\u0017\u0010=\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u0010p\u001a\u0004\b=\u0010qR\u0017\u0010>\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010p\u001a\u0004\br\u0010qR\u0017\u0010?\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010@\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010s\u001a\u0004\bv\u0010uR\u0017\u0010A\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010s\u001a\u0004\bw\u0010uR\u0017\u0010B\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010s\u001a\u0004\bx\u0010uR\u0017\u0010C\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010s\u001a\u0004\by\u0010uR\"\u0010D\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010p\u001a\u0004\bz\u0010q\"\u0004\b{\u0010|R\"\u0010E\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010p\u001a\u0004\bE\u0010q\"\u0004\b}\u0010|R&\u0010F\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bF\u0010~\u001a\u0004\b\u007f\u0010\u0014\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010G\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bG\u0010~\u001a\u0005\b\u0082\u0001\u0010\u0014\"\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001a\u0010H\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010p\u001a\u0004\bH\u0010qR\u001e\u0010I\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bI\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010\u0018R\u001c\u0010J\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u000f\n\u0005\bJ\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010K\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bK\u0010i\u001a\u0005\b\u0089\u0001\u0010kR\u001b\u0010L\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bL\u0010\u0084\u0001\u001a\u0005\b\u008a\u0001\u0010\u0018R\u001b\u0010M\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bM\u0010\u0084\u0001\u001a\u0005\b\u008b\u0001\u0010\u0018R\u0018\u0010N\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bN\u0010p\u001a\u0005\b\u008c\u0001\u0010qR\u0018\u0010O\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bO\u0010p\u001a\u0005\b\u008d\u0001\u0010qR\u001a\u0010P\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bP\u0010i\u001a\u0005\b\u008e\u0001\u0010kR(\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\u000f\n\u0005\bQ\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010R\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010p\u001a\u0004\bR\u0010qR\u001e\u0010S\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bS\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010&R$\u0010T\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bT\u0010p\u001a\u0005\b\u0094\u0001\u0010q\"\u0005\b\u0095\u0001\u0010|R\u0018\u0010U\u001a\u00020\u000b8\u0006¢\u0006\r\n\u0004\bU\u0010s\u001a\u0005\b\u0096\u0001\u0010uR\u0018\u0010V\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bV\u0010p\u001a\u0005\b\u0097\u0001\u0010qR\u0018\u0010W\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bW\u0010p\u001a\u0005\b\u0098\u0001\u0010qR%\u0010X\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bX\u0010s\u001a\u0005\b\u0099\u0001\u0010u\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010Y\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bY\u0010\u0084\u0001\u001a\u0005\b\u009c\u0001\u0010\u0018R\u0018\u0010Z\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bZ\u0010p\u001a\u0005\b\u009d\u0001\u0010qR\u0018\u0010[\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b[\u0010p\u001a\u0005\b\u009e\u0001\u0010qR\u001b\u0010\\\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\\\u0010p\u001a\u0005\b\u009f\u0001\u0010qR\u001b\u0010]\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\b]\u0010p\u001a\u0005\b \u0001\u0010qR%\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b^\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010_\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\b_\u0010p\u001a\u0005\b¤\u0001\u0010qR\u001a\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b`\u0010i\u001a\u0005\b¥\u0001\u0010kR \u0010a\u001a\b\u0012\u0004\u0012\u000205018\u0006¢\u0006\u000f\n\u0005\ba\u0010¡\u0001\u001a\u0006\b¦\u0001\u0010£\u0001R \u0010b\u001a\b\u0012\u0004\u0012\u000207018\u0006¢\u0006\u000f\n\u0005\bb\u0010¡\u0001\u001a\u0006\b§\u0001\u0010£\u0001R\u0016\u0010©\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010qR\u0016\u0010ª\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010qR\u0016\u0010¬\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010kR\u0016\u0010\u00ad\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010qR\u0016\u0010¯\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010qR\u0016\u0010±\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010q¨\u0006´\u0001" }, d2 = { "Lcom/reddit/domain/model/Account;", "Lcom/reddit/session/n;", "", "component1", "component2", "", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Long;", "component15", "component16", "component17", "()Ljava/lang/Boolean;", "Lcom/reddit/domain/model/UserSubreddit;", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "", "", "component25", "component26", "component27", "()Ljava/lang/Integer;", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "", "component38", "component39", "component40", "Lcom/reddit/domain/model/sociallink/SocialLink;", "component41", "Lcom/reddit/domain/model/CommunityHub;", "component42", "id", "username", "createdUtc", "isEmployee", "isFriend", "hideFromRobots", "totalKarma", "linkKarma", "commentKarma", "awarderKarma", "awardeeKarma", "hasPremium", "isPremiumSubscriber", "premiumExpirationUtcSeconds", "premiumSinceUtcSeconds", "isMod", "hasVerifiedEmail", "subreddit", "iconUrl", "acceptChats", "acceptPrivateMessages", "acceptFollowers", "hasBeenVisited", "email", "features", "isSuspended", "suspensionExpirationUtc", "forcePasswordReset", "inboxCount", "hasMail", "hasModMail", "coins", "showMyActiveCommunities", "hideAds", "outboundClickTracking", "canCreateSubreddit", "canEditName", "linkedIdentities", "hasPasswordSet", "snoovatarImg", "socialLinks", "communityHubs", "copy", "(Ljava/lang/String;Ljava/lang/String;JZZZIIIIIZZLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/Boolean;Lcom/reddit/domain/model/UserSubreddit;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/util/Map;ZLjava/lang/Integer;ZIZZILjava/lang/Boolean;ZZZZLjava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/reddit/domain/model/Account;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getUsername", "J", "getCreatedUtc", "()J", "Z", "()Z", "getHideFromRobots", "I", "getTotalKarma", "()I", "getLinkKarma", "getCommentKarma", "getAwarderKarma", "getAwardeeKarma", "getHasPremium", "setHasPremium", "(Z)V", "setPremiumSubscriber", "Ljava/lang/Long;", "getPremiumExpirationUtcSeconds", "setPremiumExpirationUtcSeconds", "(Ljava/lang/Long;)V", "getPremiumSinceUtcSeconds", "setPremiumSinceUtcSeconds", "Ljava/lang/Boolean;", "getHasVerifiedEmail", "Lcom/reddit/domain/model/UserSubreddit;", "getSubreddit", "()Lcom/reddit/domain/model/UserSubreddit;", "getIconUrl", "getAcceptChats", "getAcceptPrivateMessages", "getAcceptFollowers", "getHasBeenVisited", "getEmail", "Ljava/util/Map;", "getFeatures", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getSuspensionExpirationUtc", "getForcePasswordReset", "setForcePasswordReset", "getInboxCount", "getHasMail", "getHasModMail", "getCoins", "setCoins", "(I)V", "getShowMyActiveCommunities", "getHideAds", "getOutboundClickTracking", "getCanCreateSubreddit", "getCanEditName", "Ljava/util/List;", "getLinkedIdentities", "()Ljava/util/List;", "getHasPasswordSet", "getSnoovatarImg", "getSocialLinks", "getCommunityHubs", "getChatMessageReports", "chatMessageReports", "isEmailPermissionRequired", "getKindWithId", "kindWithId", "isEmailAccessible", "getHasSubscribedToPremium", "hasSubscribedToPremium", "getHasPhoneNumberSet", "hasPhoneNumberSet", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZZZIIIIIZZLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/Boolean;Lcom/reddit/domain/model/UserSubreddit;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/util/Map;ZLjava/lang/Integer;ZIZZILjava/lang/Boolean;ZZZZLjava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Account implements n
{
    private final Boolean acceptChats;
    private final boolean acceptFollowers;
    private final Boolean acceptPrivateMessages;
    private final int awardeeKarma;
    private final int awarderKarma;
    private final boolean canCreateSubreddit;
    private final boolean canEditName;
    private int coins;
    private final int commentKarma;
    private final List<CommunityHub> communityHubs;
    private final long createdUtc;
    private final String email;
    private final Map<String, Object> features;
    private boolean forcePasswordReset;
    private final boolean hasBeenVisited;
    private final boolean hasMail;
    private final boolean hasModMail;
    private final boolean hasPasswordSet;
    private boolean hasPremium;
    private final Boolean hasVerifiedEmail;
    private final boolean hideAds;
    private final boolean hideFromRobots;
    private final String iconUrl;
    private final String id;
    private final int inboxCount;
    private final boolean isEmployee;
    private final boolean isFriend;
    private final boolean isMod;
    private boolean isPremiumSubscriber;
    private final boolean isSuspended;
    private final int linkKarma;
    private final List<String> linkedIdentities;
    private final boolean outboundClickTracking;
    private Long premiumExpirationUtcSeconds;
    private Long premiumSinceUtcSeconds;
    private final Boolean showMyActiveCommunities;
    private final String snoovatarImg;
    private final List<SocialLink> socialLinks;
    private final UserSubreddit subreddit;
    private final Integer suspensionExpirationUtc;
    private final int totalKarma;
    private final String username;
    
    public Account(final String id, @com.squareup.moshi.n(name = "name") final String username, @com.squareup.moshi.n(name = "created_utc") final long createdUtc, @com.squareup.moshi.n(name = "is_employee") final boolean isEmployee, @com.squareup.moshi.n(name = "is_friend") final boolean isFriend, @com.squareup.moshi.n(name = "hide_from_robots") final boolean hideFromRobots, @com.squareup.moshi.n(name = "total_karma") final int totalKarma, @com.squareup.moshi.n(name = "link_karma") final int linkKarma, @com.squareup.moshi.n(name = "comment_karma") final int commentKarma, @com.squareup.moshi.n(name = "awarder_karma") final int awarderKarma, @com.squareup.moshi.n(name = "awardee_karma") final int awardeeKarma, @com.squareup.moshi.n(name = "is_gold") final boolean hasPremium, @com.squareup.moshi.n(name = "has_gold_subscription") final boolean isPremiumSubscriber, @com.squareup.moshi.n(name = "gold_expiration") final Long premiumExpirationUtcSeconds, @com.squareup.moshi.n(name = "premium_since") final Long premiumSinceUtcSeconds, @com.squareup.moshi.n(name = "is_mod") final boolean isMod, @com.squareup.moshi.n(name = "has_verified_email") final Boolean hasVerifiedEmail, @com.squareup.moshi.n(name = "subreddit") final UserSubreddit subreddit, @com.squareup.moshi.n(name = "icon_img") final String iconUrl, @com.squareup.moshi.n(name = "accept_chats") final Boolean acceptChats, @com.squareup.moshi.n(name = "accept_pms") final Boolean acceptPrivateMessages, @com.squareup.moshi.n(name = "accept_followers") final boolean acceptFollowers, final boolean hasBeenVisited, final String email, final Map<String, ?> features, @com.squareup.moshi.n(name = "is_suspended") final boolean isSuspended, @com.squareup.moshi.n(name = "suspension_expiration_utc") final Integer suspensionExpirationUtc, @com.squareup.moshi.n(name = "force_password_reset") final boolean forcePasswordReset, @com.squareup.moshi.n(name = "inbox_count") final int inboxCount, @com.squareup.moshi.n(name = "has_mail") final boolean hasMail, @com.squareup.moshi.n(name = "has_mod_mail") final boolean hasModMail, @com.squareup.moshi.n(name = "coins") final int coins, @com.squareup.moshi.n(name = "pref_top_karma_subreddits") final Boolean showMyActiveCommunities, @com.squareup.moshi.n(name = "hide_ads") final boolean hideAds, @com.squareup.moshi.n(name = "outbound_clicktracking") final boolean outboundClickTracking, @com.squareup.moshi.n(name = "can_create_subreddit") final boolean canCreateSubreddit, @com.squareup.moshi.n(name = "can_edit_name") final boolean canEditName, @com.squareup.moshi.n(name = "linked_identities") final List<String> linkedIdentities, @com.squareup.moshi.n(name = "password_set") final boolean hasPasswordSet, @com.squareup.moshi.n(name = "snoovatar_img") final String snoovatarImg, final List<SocialLink> socialLinks, final List<CommunityHub> communityHubs) {
        e.f((Object)id, "id");
        e.f((Object)username, "username");
        e.f((Object)iconUrl, "iconUrl");
        e.f((Object)socialLinks, "socialLinks");
        e.f((Object)communityHubs, "communityHubs");
        this.id = id;
        this.username = username;
        this.createdUtc = createdUtc;
        this.isEmployee = isEmployee;
        this.isFriend = isFriend;
        this.hideFromRobots = hideFromRobots;
        this.totalKarma = totalKarma;
        this.linkKarma = linkKarma;
        this.commentKarma = commentKarma;
        this.awarderKarma = awarderKarma;
        this.awardeeKarma = awardeeKarma;
        this.hasPremium = hasPremium;
        this.isPremiumSubscriber = isPremiumSubscriber;
        this.premiumExpirationUtcSeconds = premiumExpirationUtcSeconds;
        this.premiumSinceUtcSeconds = premiumSinceUtcSeconds;
        this.isMod = isMod;
        this.hasVerifiedEmail = hasVerifiedEmail;
        this.subreddit = subreddit;
        this.iconUrl = iconUrl;
        this.acceptChats = acceptChats;
        this.acceptPrivateMessages = acceptPrivateMessages;
        this.acceptFollowers = acceptFollowers;
        this.hasBeenVisited = hasBeenVisited;
        this.email = email;
        this.features = (Map<String, Object>)features;
        this.isSuspended = isSuspended;
        this.suspensionExpirationUtc = suspensionExpirationUtc;
        this.forcePasswordReset = forcePasswordReset;
        this.inboxCount = inboxCount;
        this.hasMail = hasMail;
        this.hasModMail = hasModMail;
        this.coins = coins;
        this.showMyActiveCommunities = showMyActiveCommunities;
        this.hideAds = hideAds;
        this.outboundClickTracking = outboundClickTracking;
        this.canCreateSubreddit = canCreateSubreddit;
        this.canEditName = canEditName;
        this.linkedIdentities = linkedIdentities;
        this.hasPasswordSet = hasPasswordSet;
        this.snoovatarImg = snoovatarImg;
        this.socialLinks = socialLinks;
        this.communityHubs = communityHubs;
    }
    
    public Account(final String s, final String s2, final long n, boolean b, boolean b2, boolean b3, int n2, int n3, int n4, int n5, int n6, boolean b4, boolean b5, Long n7, Long n8, boolean b6, Boolean b7, UserSubreddit userSubreddit, String s3, Boolean b8, Boolean b9, boolean b10, boolean b11, String s4, Map map, boolean b12, Integer n9, boolean b13, int n10, boolean b14, boolean b15, int n11, Boolean b16, boolean b17, boolean b18, boolean b19, boolean b20, List list, boolean b21, String s5, List instance, List instance2, final int n12, final int n13, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n12 & 0x8) != 0x0) {
            b = false;
        }
        if ((n12 & 0x10) != 0x0) {
            b2 = false;
        }
        if ((n12 & 0x20) != 0x0) {
            b3 = false;
        }
        if ((n12 & 0x40) != 0x0) {
            n2 = 0;
        }
        if ((n12 & 0x80) != 0x0) {
            n3 = 0;
        }
        if ((n12 & 0x100) != 0x0) {
            n4 = 0;
        }
        if ((n12 & 0x200) != 0x0) {
            n5 = 0;
        }
        if ((n12 & 0x400) != 0x0) {
            n6 = 0;
        }
        if ((n12 & 0x800) != 0x0) {
            b4 = false;
        }
        if ((n12 & 0x1000) != 0x0) {
            b5 = false;
        }
        if ((n12 & 0x2000) != 0x0) {
            n7 = null;
        }
        if ((n12 & 0x4000) != 0x0) {
            n8 = null;
        }
        if ((0x8000 & n12) != 0x0) {
            b6 = false;
        }
        if ((0x10000 & n12) != 0x0) {
            b7 = null;
        }
        if ((0x20000 & n12) != 0x0) {
            userSubreddit = null;
        }
        if ((0x40000 & n12) != 0x0) {
            s3 = "";
        }
        if ((0x80000 & n12) != 0x0) {
            b8 = null;
        }
        if ((0x100000 & n12) != 0x0) {
            b9 = null;
        }
        if ((0x200000 & n12) != 0x0) {
            b10 = true;
        }
        if ((0x400000 & n12) != 0x0) {
            b11 = false;
        }
        if ((0x800000 & n12) != 0x0) {
            s4 = null;
        }
        if ((0x1000000 & n12) != 0x0) {
            map = null;
        }
        if ((0x2000000 & n12) != 0x0) {
            b12 = false;
        }
        if ((0x4000000 & n12) != 0x0) {
            n9 = null;
        }
        if ((0x8000000 & n12) != 0x0) {
            b13 = false;
        }
        if ((0x10000000 & n12) != 0x0) {
            n10 = 0;
        }
        if ((0x20000000 & n12) != 0x0) {
            b14 = false;
        }
        if ((0x40000000 & n12) != 0x0) {
            b15 = false;
        }
        if ((n12 & Integer.MIN_VALUE) != 0x0) {
            n11 = 0;
        }
        if ((n13 & 0x1) != 0x0) {
            b16 = null;
        }
        if ((n13 & 0x2) != 0x0) {
            b17 = false;
        }
        if ((n13 & 0x4) != 0x0) {
            b18 = false;
        }
        if ((n13 & 0x8) != 0x0) {
            b19 = false;
        }
        if ((n13 & 0x10) != 0x0) {
            b20 = false;
        }
        if ((n13 & 0x20) != 0x0) {
            list = null;
        }
        if ((n13 & 0x40) != 0x0) {
            b21 = false;
        }
        if ((n13 & 0x80) != 0x0) {
            s5 = null;
        }
        if ((n13 & 0x100) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n13 & 0x200) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        this(s, s2, n, b, b2, b3, n2, n3, n4, n5, n6, b4, b5, n7, n8, b6, b7, userSubreddit, s3, b8, b9, b10, b11, s4, map, b12, n9, b13, n10, b14, b15, n11, b16, b17, b18, b19, b20, list, b21, s5, (List<SocialLink>)instance, (List<CommunityHub>)instance2);
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final int component10() {
        return this.awarderKarma;
    }
    
    public final int component11() {
        return this.awardeeKarma;
    }
    
    public final boolean component12() {
        return this.getHasPremium();
    }
    
    public final boolean component13() {
        return this.isPremiumSubscriber();
    }
    
    public final Long component14() {
        return this.getPremiumExpirationUtcSeconds();
    }
    
    public final Long component15() {
        return this.getPremiumSinceUtcSeconds();
    }
    
    public final boolean component16() {
        return this.isMod();
    }
    
    public final Boolean component17() {
        return this.getHasVerifiedEmail();
    }
    
    public final UserSubreddit component18() {
        return this.subreddit;
    }
    
    public final String component19() {
        return this.iconUrl;
    }
    
    public final String component2() {
        return this.getUsername();
    }
    
    public final Boolean component20() {
        return this.acceptChats;
    }
    
    public final Boolean component21() {
        return this.acceptPrivateMessages;
    }
    
    public final boolean component22() {
        return this.acceptFollowers;
    }
    
    public final boolean component23() {
        return this.hasBeenVisited;
    }
    
    public final String component24() {
        return this.email;
    }
    
    public final Map<String, Object> component25() {
        return this.features;
    }
    
    public final boolean component26() {
        return this.isSuspended();
    }
    
    public final Integer component27() {
        return this.getSuspensionExpirationUtc();
    }
    
    public final boolean component28() {
        return this.getForcePasswordReset();
    }
    
    public final int component29() {
        return this.inboxCount;
    }
    
    public final long component3() {
        return this.getCreatedUtc();
    }
    
    public final boolean component30() {
        return this.hasMail;
    }
    
    public final boolean component31() {
        return this.hasModMail;
    }
    
    public final int component32() {
        return this.getCoins();
    }
    
    public final Boolean component33() {
        return this.showMyActiveCommunities;
    }
    
    public final boolean component34() {
        return this.hideAds;
    }
    
    public final boolean component35() {
        return this.outboundClickTracking;
    }
    
    public final boolean component36() {
        return this.getCanCreateSubreddit();
    }
    
    public final boolean component37() {
        return this.getCanEditName();
    }
    
    public final List<String> component38() {
        return this.getLinkedIdentities();
    }
    
    public final boolean component39() {
        return this.getHasPasswordSet();
    }
    
    public final boolean component4() {
        return this.isEmployee();
    }
    
    public final String component40() {
        return this.snoovatarImg;
    }
    
    public final List<SocialLink> component41() {
        return this.socialLinks;
    }
    
    public final List<CommunityHub> component42() {
        return this.communityHubs;
    }
    
    public final boolean component5() {
        return this.isFriend;
    }
    
    public final boolean component6() {
        return this.hideFromRobots;
    }
    
    public final int component7() {
        return this.totalKarma;
    }
    
    public final int component8() {
        return this.linkKarma;
    }
    
    public final int component9() {
        return this.commentKarma;
    }
    
    public final Account copy(final String s, @com.squareup.moshi.n(name = "name") final String s2, @com.squareup.moshi.n(name = "created_utc") final long n, @com.squareup.moshi.n(name = "is_employee") final boolean b, @com.squareup.moshi.n(name = "is_friend") final boolean b2, @com.squareup.moshi.n(name = "hide_from_robots") final boolean b3, @com.squareup.moshi.n(name = "total_karma") final int n2, @com.squareup.moshi.n(name = "link_karma") final int n3, @com.squareup.moshi.n(name = "comment_karma") final int n4, @com.squareup.moshi.n(name = "awarder_karma") final int n5, @com.squareup.moshi.n(name = "awardee_karma") final int n6, @com.squareup.moshi.n(name = "is_gold") final boolean b4, @com.squareup.moshi.n(name = "has_gold_subscription") final boolean b5, @com.squareup.moshi.n(name = "gold_expiration") final Long n7, @com.squareup.moshi.n(name = "premium_since") final Long n8, @com.squareup.moshi.n(name = "is_mod") final boolean b6, @com.squareup.moshi.n(name = "has_verified_email") final Boolean b7, @com.squareup.moshi.n(name = "subreddit") final UserSubreddit userSubreddit, @com.squareup.moshi.n(name = "icon_img") final String s3, @com.squareup.moshi.n(name = "accept_chats") final Boolean b8, @com.squareup.moshi.n(name = "accept_pms") final Boolean b9, @com.squareup.moshi.n(name = "accept_followers") final boolean b10, final boolean b11, final String s4, final Map<String, ?> map, @com.squareup.moshi.n(name = "is_suspended") final boolean b12, @com.squareup.moshi.n(name = "suspension_expiration_utc") final Integer n9, @com.squareup.moshi.n(name = "force_password_reset") final boolean b13, @com.squareup.moshi.n(name = "inbox_count") final int n10, @com.squareup.moshi.n(name = "has_mail") final boolean b14, @com.squareup.moshi.n(name = "has_mod_mail") final boolean b15, @com.squareup.moshi.n(name = "coins") final int n11, @com.squareup.moshi.n(name = "pref_top_karma_subreddits") final Boolean b16, @com.squareup.moshi.n(name = "hide_ads") final boolean b17, @com.squareup.moshi.n(name = "outbound_clicktracking") final boolean b18, @com.squareup.moshi.n(name = "can_create_subreddit") final boolean b19, @com.squareup.moshi.n(name = "can_edit_name") final boolean b20, @com.squareup.moshi.n(name = "linked_identities") final List<String> list, @com.squareup.moshi.n(name = "password_set") final boolean b21, @com.squareup.moshi.n(name = "snoovatar_img") final String s5, final List<SocialLink> list2, final List<CommunityHub> list3) {
        e.f((Object)s, "id");
        e.f((Object)s2, "username");
        e.f((Object)s3, "iconUrl");
        e.f((Object)list2, "socialLinks");
        e.f((Object)list3, "communityHubs");
        return new Account(s, s2, n, b, b2, b3, n2, n3, n4, n5, n6, b4, b5, n7, n8, b6, b7, userSubreddit, s3, b8, b9, b10, b11, s4, map, b12, n9, b13, n10, b14, b15, n11, b16, b17, b18, b19, b20, list, b21, s5, list2, list3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        final Account account = (Account)o;
        return e.a((Object)this.getId(), (Object)account.getId()) && e.a((Object)this.getUsername(), (Object)account.getUsername()) && this.getCreatedUtc() == account.getCreatedUtc() && this.isEmployee() == account.isEmployee() && this.isFriend == account.isFriend && this.hideFromRobots == account.hideFromRobots && this.totalKarma == account.totalKarma && this.linkKarma == account.linkKarma && this.commentKarma == account.commentKarma && this.awarderKarma == account.awarderKarma && this.awardeeKarma == account.awardeeKarma && this.getHasPremium() == account.getHasPremium() && this.isPremiumSubscriber() == account.isPremiumSubscriber() && e.a((Object)this.getPremiumExpirationUtcSeconds(), (Object)account.getPremiumExpirationUtcSeconds()) && e.a((Object)this.getPremiumSinceUtcSeconds(), (Object)account.getPremiumSinceUtcSeconds()) && this.isMod() == account.isMod() && e.a((Object)this.getHasVerifiedEmail(), (Object)account.getHasVerifiedEmail()) && e.a((Object)this.subreddit, (Object)account.subreddit) && e.a((Object)this.iconUrl, (Object)account.iconUrl) && e.a((Object)this.acceptChats, (Object)account.acceptChats) && e.a((Object)this.acceptPrivateMessages, (Object)account.acceptPrivateMessages) && this.acceptFollowers == account.acceptFollowers && this.hasBeenVisited == account.hasBeenVisited && e.a((Object)this.email, (Object)account.email) && e.a((Object)this.features, (Object)account.features) && this.isSuspended() == account.isSuspended() && e.a((Object)this.getSuspensionExpirationUtc(), (Object)account.getSuspensionExpirationUtc()) && this.getForcePasswordReset() == account.getForcePasswordReset() && this.inboxCount == account.inboxCount && this.hasMail == account.hasMail && this.hasModMail == account.hasModMail && this.getCoins() == account.getCoins() && e.a((Object)this.showMyActiveCommunities, (Object)account.showMyActiveCommunities) && this.hideAds == account.hideAds && this.outboundClickTracking == account.outboundClickTracking && this.getCanCreateSubreddit() == account.getCanCreateSubreddit() && this.getCanEditName() == account.getCanEditName() && e.a((Object)this.getLinkedIdentities(), (Object)account.getLinkedIdentities()) && this.getHasPasswordSet() == account.getHasPasswordSet() && e.a((Object)this.snoovatarImg, (Object)account.snoovatarImg) && e.a((Object)this.socialLinks, (Object)account.socialLinks) && e.a((Object)this.communityHubs, (Object)account.communityHubs);
    }
    
    public final Boolean getAcceptChats() {
        return this.acceptChats;
    }
    
    public final boolean getAcceptFollowers() {
        return this.acceptFollowers;
    }
    
    public final Boolean getAcceptPrivateMessages() {
        return this.acceptPrivateMessages;
    }
    
    public final int getAwardeeKarma() {
        return this.awardeeKarma;
    }
    
    public final int getAwarderKarma() {
        return this.awarderKarma;
    }
    
    public boolean getCanCreateSubreddit() {
        return this.canCreateSubreddit;
    }
    
    public boolean getCanEditName() {
        return this.canEditName;
    }
    
    public boolean getChatMessageReports() {
        final Map<String, Object> features = this.features;
        return features != null && e.a(features.get("chat_message_reports"), (Object)Boolean.TRUE);
    }
    
    public int getCoins() {
        return this.coins;
    }
    
    public final int getCommentKarma() {
        return this.commentKarma;
    }
    
    public final List<CommunityHub> getCommunityHubs() {
        return this.communityHubs;
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getEmail() {
        return this.email;
    }
    
    public final Map<String, Object> getFeatures() {
        return this.features;
    }
    
    public boolean getForcePasswordReset() {
        return this.forcePasswordReset;
    }
    
    public final boolean getHasBeenVisited() {
        return this.hasBeenVisited;
    }
    
    public final boolean getHasMail() {
        return this.hasMail;
    }
    
    public final boolean getHasModMail() {
        return this.hasModMail;
    }
    
    public boolean getHasPasswordSet() {
        return this.hasPasswordSet;
    }
    
    public boolean getHasPhoneNumberSet() {
        return false;
    }
    
    public boolean getHasPremium() {
        return this.hasPremium;
    }
    
    public boolean getHasSubscribedToPremium() {
        return false;
    }
    
    public Boolean getHasVerifiedEmail() {
        return this.hasVerifiedEmail;
    }
    
    public final boolean getHideAds() {
        return this.hideAds;
    }
    
    public final boolean getHideFromRobots() {
        return this.hideFromRobots;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public String getId() {
        return this.id;
    }
    
    public final int getInboxCount() {
        return this.inboxCount;
    }
    
    public String getKindWithId() {
        return v.d(this.getId(), ThingType.USER);
    }
    
    public final int getLinkKarma() {
        return this.linkKarma;
    }
    
    public List<String> getLinkedIdentities() {
        return this.linkedIdentities;
    }
    
    public final boolean getOutboundClickTracking() {
        return this.outboundClickTracking;
    }
    
    public Long getPremiumExpirationUtcSeconds() {
        return this.premiumExpirationUtcSeconds;
    }
    
    public Long getPremiumSinceUtcSeconds() {
        return this.premiumSinceUtcSeconds;
    }
    
    public final Boolean getShowMyActiveCommunities() {
        return this.showMyActiveCommunities;
    }
    
    public final String getSnoovatarImg() {
        return this.snoovatarImg;
    }
    
    public final List<SocialLink> getSocialLinks() {
        return this.socialLinks;
    }
    
    public final UserSubreddit getSubreddit() {
        return this.subreddit;
    }
    
    public Integer getSuspensionExpirationUtc() {
        return this.suspensionExpirationUtc;
    }
    
    public final int getTotalKarma() {
        return this.totalKarma;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getId().hashCode();
        final int hashCode2 = this.getUsername().hashCode();
        final int hashCode3 = Long.hashCode(this.getCreatedUtc());
        final int employee = this.isEmployee() ? 1 : 0;
        final int n = 1;
        int n2 = employee;
        if (employee != 0) {
            n2 = 1;
        }
        int isFriend;
        if ((isFriend = (this.isFriend ? 1 : 0)) != 0) {
            isFriend = 1;
        }
        int hideFromRobots;
        if ((hideFromRobots = (this.hideFromRobots ? 1 : 0)) != 0) {
            hideFromRobots = 1;
        }
        final int c = a.c(this.awardeeKarma, a.c(this.awarderKarma, a.c(this.commentKarma, a.c(this.linkKarma, a.c(this.totalKarma, ((((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + n2) * 31 + isFriend) * 31 + hideFromRobots) * 31, 31), 31), 31), 31), 31);
        int hasPremium;
        if ((hasPremium = (this.getHasPremium() ? 1 : 0)) != 0) {
            hasPremium = 1;
        }
        int premiumSubscriber;
        if ((premiumSubscriber = (this.isPremiumSubscriber() ? 1 : 0)) != 0) {
            premiumSubscriber = 1;
        }
        final Long premiumExpirationUtcSeconds = this.getPremiumExpirationUtcSeconds();
        final int n3 = 0;
        int hashCode4;
        if (premiumExpirationUtcSeconds == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = this.getPremiumExpirationUtcSeconds().hashCode();
        }
        int hashCode5;
        if (this.getPremiumSinceUtcSeconds() == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = this.getPremiumSinceUtcSeconds().hashCode();
        }
        int mod;
        if ((mod = (this.isMod() ? 1 : 0)) != 0) {
            mod = 1;
        }
        int hashCode6;
        if (this.getHasVerifiedEmail() == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getHasVerifiedEmail().hashCode();
        }
        final UserSubreddit subreddit = this.subreddit;
        int hashCode7;
        if (subreddit == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subreddit.hashCode();
        }
        final int c2 = b.c(this.iconUrl, (((((((c + hasPremium) * 31 + premiumSubscriber) * 31 + hashCode4) * 31 + hashCode5) * 31 + mod) * 31 + hashCode6) * 31 + hashCode7) * 31, 31);
        final Boolean acceptChats = this.acceptChats;
        int hashCode8;
        if (acceptChats == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = acceptChats.hashCode();
        }
        final Boolean acceptPrivateMessages = this.acceptPrivateMessages;
        int hashCode9;
        if (acceptPrivateMessages == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = acceptPrivateMessages.hashCode();
        }
        int acceptFollowers;
        if ((acceptFollowers = (this.acceptFollowers ? 1 : 0)) != 0) {
            acceptFollowers = 1;
        }
        int hasBeenVisited;
        if ((hasBeenVisited = (this.hasBeenVisited ? 1 : 0)) != 0) {
            hasBeenVisited = 1;
        }
        final String email = this.email;
        int hashCode10;
        if (email == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = email.hashCode();
        }
        final Map<String, Object> features = this.features;
        int hashCode11;
        if (features == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = features.hashCode();
        }
        int suspended;
        if ((suspended = (this.isSuspended() ? 1 : 0)) != 0) {
            suspended = 1;
        }
        int hashCode12;
        if (this.getSuspensionExpirationUtc() == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = this.getSuspensionExpirationUtc().hashCode();
        }
        int forcePasswordReset;
        if ((forcePasswordReset = (this.getForcePasswordReset() ? 1 : 0)) != 0) {
            forcePasswordReset = 1;
        }
        final int c3 = a.c(this.inboxCount, (((((((((c2 + hashCode8) * 31 + hashCode9) * 31 + acceptFollowers) * 31 + hasBeenVisited) * 31 + hashCode10) * 31 + hashCode11) * 31 + suspended) * 31 + hashCode12) * 31 + forcePasswordReset) * 31, 31);
        int hasMail;
        if ((hasMail = (this.hasMail ? 1 : 0)) != 0) {
            hasMail = 1;
        }
        int hasModMail;
        if ((hasModMail = (this.hasModMail ? 1 : 0)) != 0) {
            hasModMail = 1;
        }
        final int hashCode13 = Integer.hashCode(this.getCoins());
        final Boolean showMyActiveCommunities = this.showMyActiveCommunities;
        int hashCode14;
        if (showMyActiveCommunities == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = showMyActiveCommunities.hashCode();
        }
        int hideAds;
        if ((hideAds = (this.hideAds ? 1 : 0)) != 0) {
            hideAds = 1;
        }
        int outboundClickTracking;
        if ((outboundClickTracking = (this.outboundClickTracking ? 1 : 0)) != 0) {
            outboundClickTracking = 1;
        }
        int canCreateSubreddit;
        if ((canCreateSubreddit = (this.getCanCreateSubreddit() ? 1 : 0)) != 0) {
            canCreateSubreddit = 1;
        }
        int canEditName;
        if ((canEditName = (this.getCanEditName() ? 1 : 0)) != 0) {
            canEditName = 1;
        }
        int hashCode15;
        if (this.getLinkedIdentities() == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = this.getLinkedIdentities().hashCode();
        }
        int hasPasswordSet = this.getHasPasswordSet() ? 1 : 0;
        if (hasPasswordSet != 0) {
            hasPasswordSet = n;
        }
        final String snoovatarImg = this.snoovatarImg;
        int hashCode16;
        if (snoovatarImg == null) {
            hashCode16 = n3;
        }
        else {
            hashCode16 = snoovatarImg.hashCode();
        }
        return this.communityHubs.hashCode() + aw.b.c((List)this.socialLinks, (((((((((hashCode13 + ((c3 + hasMail) * 31 + hasModMail) * 31) * 31 + hashCode14) * 31 + hideAds) * 31 + outboundClickTracking) * 31 + canCreateSubreddit) * 31 + canEditName) * 31 + hashCode15) * 31 + hasPasswordSet) * 31 + hashCode16) * 31, 31);
    }
    
    public boolean isEmailAccessible() {
        return false;
    }
    
    public boolean isEmailPermissionRequired() {
        final Map<String, Object> features = this.features;
        return features != null && e.a(features.get("is_email_permission_required"), (Object)Boolean.TRUE);
    }
    
    public boolean isEmployee() {
        return this.isEmployee;
    }
    
    public final boolean isFriend() {
        return this.isFriend;
    }
    
    public boolean isMod() {
        return this.isMod;
    }
    
    public boolean isPremiumSubscriber() {
        return this.isPremiumSubscriber;
    }
    
    public boolean isSuspended() {
        return this.isSuspended;
    }
    
    public void setCoins(final int coins) {
        this.coins = coins;
    }
    
    public void setForcePasswordReset(final boolean forcePasswordReset) {
        this.forcePasswordReset = forcePasswordReset;
    }
    
    public void setHasPremium(final boolean hasPremium) {
        this.hasPremium = hasPremium;
    }
    
    public void setPremiumExpirationUtcSeconds(final Long premiumExpirationUtcSeconds) {
        this.premiumExpirationUtcSeconds = premiumExpirationUtcSeconds;
    }
    
    public void setPremiumSinceUtcSeconds(final Long premiumSinceUtcSeconds) {
        this.premiumSinceUtcSeconds = premiumSinceUtcSeconds;
    }
    
    public void setPremiumSubscriber(final boolean isPremiumSubscriber) {
        this.isPremiumSubscriber = isPremiumSubscriber;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Account(id=");
        r.append(this.getId());
        r.append(", username=");
        r.append(this.getUsername());
        r.append(", createdUtc=");
        r.append(this.getCreatedUtc());
        r.append(", isEmployee=");
        r.append(this.isEmployee());
        r.append(", isFriend=");
        r.append(this.isFriend);
        r.append(", hideFromRobots=");
        r.append(this.hideFromRobots);
        r.append(", totalKarma=");
        r.append(this.totalKarma);
        r.append(", linkKarma=");
        r.append(this.linkKarma);
        r.append(", commentKarma=");
        r.append(this.commentKarma);
        r.append(", awarderKarma=");
        r.append(this.awarderKarma);
        r.append(", awardeeKarma=");
        r.append(this.awardeeKarma);
        r.append(", hasPremium=");
        r.append(this.getHasPremium());
        r.append(", isPremiumSubscriber=");
        r.append(this.isPremiumSubscriber());
        r.append(", premiumExpirationUtcSeconds=");
        r.append(this.getPremiumExpirationUtcSeconds());
        r.append(", premiumSinceUtcSeconds=");
        r.append(this.getPremiumSinceUtcSeconds());
        r.append(", isMod=");
        r.append(this.isMod());
        r.append(", hasVerifiedEmail=");
        r.append(this.getHasVerifiedEmail());
        r.append(", subreddit=");
        r.append(this.subreddit);
        r.append(", iconUrl=");
        r.append(this.iconUrl);
        r.append(", acceptChats=");
        r.append(this.acceptChats);
        r.append(", acceptPrivateMessages=");
        r.append(this.acceptPrivateMessages);
        r.append(", acceptFollowers=");
        r.append(this.acceptFollowers);
        r.append(", hasBeenVisited=");
        r.append(this.hasBeenVisited);
        r.append(", email=");
        r.append(this.email);
        r.append(", features=");
        r.append(this.features);
        r.append(", isSuspended=");
        r.append(this.isSuspended());
        r.append(", suspensionExpirationUtc=");
        r.append(this.getSuspensionExpirationUtc());
        r.append(", forcePasswordReset=");
        r.append(this.getForcePasswordReset());
        r.append(", inboxCount=");
        r.append(this.inboxCount);
        r.append(", hasMail=");
        r.append(this.hasMail);
        r.append(", hasModMail=");
        r.append(this.hasModMail);
        r.append(", coins=");
        r.append(this.getCoins());
        r.append(", showMyActiveCommunities=");
        r.append(this.showMyActiveCommunities);
        r.append(", hideAds=");
        r.append(this.hideAds);
        r.append(", outboundClickTracking=");
        r.append(this.outboundClickTracking);
        r.append(", canCreateSubreddit=");
        r.append(this.getCanCreateSubreddit());
        r.append(", canEditName=");
        r.append(this.getCanEditName());
        r.append(", linkedIdentities=");
        r.append(this.getLinkedIdentities());
        r.append(", hasPasswordSet=");
        r.append(this.getHasPasswordSet());
        r.append(", snoovatarImg=");
        r.append(this.snoovatarImg);
        r.append(", socialLinks=");
        r.append(this.socialLinks);
        r.append(", communityHubs=");
        return d.o(r, (List)this.communityHubs, ')');
    }
}
