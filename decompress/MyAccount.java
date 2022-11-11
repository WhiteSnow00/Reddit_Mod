// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.f0;
import v10.v;
import com.reddit.common.ThingType;
import ml0.a;
import kotlin.collections.EmptyList;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;
import com.reddit.session.n;

@DisallowInBundle
@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u007f\b\u0087\b\u0018\u00002\u00020\u0001B\u00e1\u0003\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010<\u001a\u00020\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\f\u0012\b\b\u0002\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010?\u001a\u00020\f\u0012\b\b\u0002\u0010@\u001a\u00020\f\u0012\b\b\u0002\u0010A\u001a\u00020\f\u0012\b\b\u0002\u0010B\u001a\u00020\u0007\u0012\b\b\u0002\u0010C\u001a\u00020\u0007\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010F\u001a\u00020\u0007\u0012\b\b\u0002\u0010G\u001a\u00020\u0007\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010M\u001a\u00020\u0002\u0012\b\b\u0002\u0010N\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\b\u0002\u0010P\u001a\u00020\u0007\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010R\u001a\u00020\u0007\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010V\u001a\u00020\f\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010X\u001a\u00020\u0007\u0012\b\b\u0002\u0010Y\u001a\u00020\u0007\u0012\b\b\u0002\u0010Z\u001a\u00020\u0007\u0012\b\b\u0002\u0010[\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000201\u0012\b\b\u0002\u0010]\u001a\u00020\u0007\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\fH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u0019\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010(\u001a\u0004\u0018\u00010\fH\u00c6\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b)\u0010\nJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b*\u0010\nJ\t\u0010+\u001a\u00020\fH\u00c6\u0003J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b,\u0010\nJ\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000201H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u0012\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b4\u0010\nJ\u0012\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b5\u0010\nJ\u000b\u00106\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u00e8\u0003\u0010a\u001a\u00020\u00002\b\b\u0002\u00107\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\f2\b\b\u0002\u0010>\u001a\u00020\f2\b\b\u0002\u0010?\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\f2\b\b\u0002\u0010B\u001a\u00020\u00072\b\b\u0002\u0010C\u001a\u00020\u00072\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010F\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u00072\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010M\u001a\u00020\u00022\b\b\u0002\u0010N\u001a\u00020\u00072\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!2\b\b\u0002\u0010P\u001a\u00020\u00072\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010R\u001a\u00020\u00072\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010V\u001a\u00020\f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010X\u001a\u00020\u00072\b\b\u0002\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010Z\u001a\u00020\u00072\b\b\u0002\u0010[\u001a\u00020\u00072\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u0002012\b\b\u0002\u0010]\u001a\u00020\u00072\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\ba\u0010bJ\t\u0010c\u001a\u00020\u0002H\u00d6\u0001J\t\u0010d\u001a\u00020\fH\u00d6\u0001J\u0013\u0010f\u001a\u00020\u00072\b\u0010e\u001a\u0004\u0018\u00010\"H\u00d6\u0003R\u001a\u00107\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010g\u001a\u0004\bh\u0010iR\u001a\u00108\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010g\u001a\u0004\bj\u0010iR\u001a\u00109\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010:\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010n\u001a\u0004\b:\u0010oR\u0019\u0010;\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u0010p\u001a\u0004\b;\u0010\nR\u0017\u0010<\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b<\u0010n\u001a\u0004\bq\u0010oR\u0017\u0010=\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010>\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010r\u001a\u0004\bu\u0010tR\u0017\u0010?\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u0010r\u001a\u0004\bv\u0010tR\u0017\u0010@\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010r\u001a\u0004\bw\u0010tR\u0017\u0010A\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bA\u0010r\u001a\u0004\bx\u0010tR\"\u0010B\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010n\u001a\u0004\by\u0010o\"\u0004\bz\u0010{R\"\u0010C\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010n\u001a\u0004\bC\u0010o\"\u0004\b|\u0010{R%\u0010D\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0013\n\u0004\bD\u0010}\u001a\u0004\b~\u0010\u0015\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010E\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bE\u0010}\u001a\u0005\b\u0081\u0001\u0010\u0015\"\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001b\u0010F\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\bF\u0010n\u001a\u0005\b\u0083\u0001\u0010oR\u001a\u0010G\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010n\u001a\u0004\bG\u0010oR\u001d\u0010H\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\bH\u0010p\u001a\u0005\b\u0084\u0001\u0010\nR\u001a\u0010I\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bI\u0010g\u001a\u0005\b\u0085\u0001\u0010iR\u001a\u0010J\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bJ\u0010g\u001a\u0005\b\u0086\u0001\u0010iR\u001a\u0010K\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bK\u0010g\u001a\u0005\b\u0087\u0001\u0010iR\u001c\u0010L\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000f\n\u0005\bL\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010M\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bM\u0010g\u001a\u0005\b\u008b\u0001\u0010iR\u0018\u0010N\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bN\u0010n\u001a\u0005\b\u008c\u0001\u0010oR(\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\u000f\n\u0005\bO\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010P\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010n\u001a\u0004\bP\u0010oR\u001e\u0010Q\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bQ\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010&R$\u0010R\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bR\u0010n\u001a\u0005\b\u0092\u0001\u0010o\"\u0005\b\u0093\u0001\u0010{R\u001b\u0010S\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\bS\u0010\u0090\u0001\u001a\u0005\b\u0094\u0001\u0010&R\u001a\u0010T\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\bT\u0010p\u001a\u0005\b\u0095\u0001\u0010\nR\u001a\u0010U\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\bU\u0010p\u001a\u0005\b\u0096\u0001\u0010\nR%\u0010V\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bV\u0010r\u001a\u0005\b\u0097\u0001\u0010t\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010W\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\bW\u0010p\u001a\u0005\b\u009a\u0001\u0010\nR\u0018\u0010X\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bX\u0010n\u001a\u0005\b\u009b\u0001\u0010oR\u0018\u0010Y\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\bY\u0010n\u001a\u0005\b\u009c\u0001\u0010oR\u001b\u0010Z\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\bZ\u0010n\u001a\u0005\b\u009d\u0001\u0010oR\u001b\u0010[\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\b[\u0010n\u001a\u0005\b\u009e\u0001\u0010oR#\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\\\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001b\u0010]\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\r\n\u0004\b]\u0010n\u001a\u0005\b¢\u0001\u0010oR\u001a\u0010^\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b^\u0010p\u001a\u0005\b£\u0001\u0010\nR\u001a\u0010_\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b_\u0010p\u001a\u0005\b¤\u0001\u0010\nR\u001a\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b`\u0010g\u001a\u0005\b¥\u0001\u0010iR\u0016\u0010§\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010oR\u0016\u0010¨\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010oR\u0016\u0010ª\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010iR\u0016\u0010«\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010oR\u0016\u0010\u00ad\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010o¨\u0006°\u0001" }, d2 = { "Lcom/reddit/domain/model/MyAccount;", "Lcom/reddit/session/n;", "", "component1", "component2", "", "component3", "", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Long;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "Lcom/reddit/domain/model/UserSubreddit;", "component22", "component23", "component24", "", "", "component25", "component26", "component27", "()Ljava/lang/Integer;", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "", "component38", "component39", "component40", "component41", "component42", "id", "username", "createdUtc", "isEmployee", "isFriend", "hideFromRobots", "totalKarma", "linkKarma", "commentKarma", "awarderKarma", "awardeeKarma", "hasPremium", "isPremiumSubscriber", "premiumExpirationUtcSeconds", "premiumSinceUtcSeconds", "hasSubscribedToPremium", "isMod", "hasVerifiedEmail", "email", "phoneCountryCode", "phoneMaskedNumber", "subreddit", "iconUrl", "hasBeenVisited", "features", "isSuspended", "suspensionExpirationUtc", "forcePasswordReset", "inboxCount", "hasMail", "hasModMail", "coins", "showMyActiveCommunities", "hideAds", "outboundClickTracking", "canCreateSubreddit", "canEditName", "linkedIdentities", "hasPasswordSet", "acceptChats", "acceptPrivateMessages", "snoovatarUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/Boolean;ZIIIIIZZLjava/lang/Long;Ljava/lang/Long;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/UserSubreddit;Ljava/lang/String;ZLjava/util/Map;ZLjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;ZZZZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/reddit/domain/model/MyAccount;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getUsername", "J", "getCreatedUtc", "()J", "Z", "()Z", "Ljava/lang/Boolean;", "getHideFromRobots", "I", "getTotalKarma", "()I", "getLinkKarma", "getCommentKarma", "getAwarderKarma", "getAwardeeKarma", "getHasPremium", "setHasPremium", "(Z)V", "setPremiumSubscriber", "Ljava/lang/Long;", "getPremiumExpirationUtcSeconds", "setPremiumExpirationUtcSeconds", "(Ljava/lang/Long;)V", "getPremiumSinceUtcSeconds", "setPremiumSinceUtcSeconds", "getHasSubscribedToPremium", "getHasVerifiedEmail", "getEmail", "getPhoneCountryCode", "getPhoneMaskedNumber", "Lcom/reddit/domain/model/UserSubreddit;", "getSubreddit", "()Lcom/reddit/domain/model/UserSubreddit;", "getIconUrl", "getHasBeenVisited", "Ljava/util/Map;", "getFeatures", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getSuspensionExpirationUtc", "getForcePasswordReset", "setForcePasswordReset", "getInboxCount", "getHasMail", "getHasModMail", "getCoins", "setCoins", "(I)V", "getShowMyActiveCommunities", "getHideAds", "getOutboundClickTracking", "getCanCreateSubreddit", "getCanEditName", "Ljava/util/List;", "getLinkedIdentities", "()Ljava/util/List;", "getHasPasswordSet", "getAcceptChats", "getAcceptPrivateMessages", "getSnoovatarUrl", "getChatMessageReports", "chatMessageReports", "isEmailPermissionRequired", "getKindWithId", "kindWithId", "isEmailAccessible", "getHasPhoneNumberSet", "hasPhoneNumberSet", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/Boolean;ZIIIIIZZLjava/lang/Long;Ljava/lang/Long;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/UserSubreddit;Ljava/lang/String;ZLjava/util/Map;ZLjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;ZZZZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MyAccount implements n
{
    private final Boolean acceptChats;
    private final Boolean acceptPrivateMessages;
    private final int awardeeKarma;
    private final int awarderKarma;
    private final boolean canCreateSubreddit;
    private final boolean canEditName;
    private int coins;
    private final int commentKarma;
    private final long createdUtc;
    private final String email;
    private final Map<String, Object> features;
    private boolean forcePasswordReset;
    private final boolean hasBeenVisited;
    private final Boolean hasMail;
    private final Boolean hasModMail;
    private final boolean hasPasswordSet;
    private boolean hasPremium;
    private final boolean hasSubscribedToPremium;
    private final Boolean hasVerifiedEmail;
    private final boolean hideAds;
    private final boolean hideFromRobots;
    private final String iconUrl;
    private final String id;
    private final Integer inboxCount;
    private final boolean isEmployee;
    private final Boolean isFriend;
    private final boolean isMod;
    private boolean isPremiumSubscriber;
    private final boolean isSuspended;
    private final int linkKarma;
    private final List<String> linkedIdentities;
    private final boolean outboundClickTracking;
    private final String phoneCountryCode;
    private final String phoneMaskedNumber;
    private Long premiumExpirationUtcSeconds;
    private Long premiumSinceUtcSeconds;
    private final Boolean showMyActiveCommunities;
    private final String snoovatarUrl;
    private final UserSubreddit subreddit;
    private final Integer suspensionExpirationUtc;
    private final int totalKarma;
    private final String username;
    
    public MyAccount() {
        this(null, null, 0L, false, null, false, 0, 0, 0, 0, 0, false, false, null, null, false, false, null, null, null, null, null, null, false, null, false, null, false, null, null, null, 0, null, false, false, false, false, null, false, null, null, null, -1, 1023, null);
    }
    
    public MyAccount(final String id, final String username, final long createdUtc, final boolean isEmployee, final Boolean isFriend, final boolean hideFromRobots, final int totalKarma, final int linkKarma, final int commentKarma, final int awarderKarma, final int awardeeKarma, final boolean hasPremium, final boolean isPremiumSubscriber, final Long premiumExpirationUtcSeconds, final Long premiumSinceUtcSeconds, final boolean hasSubscribedToPremium, final boolean isMod, final Boolean hasVerifiedEmail, final String email, final String phoneCountryCode, final String phoneMaskedNumber, final UserSubreddit subreddit, final String iconUrl, final boolean hasBeenVisited, final Map<String, ?> features, final boolean isSuspended, final Integer suspensionExpirationUtc, final boolean forcePasswordReset, final Integer inboxCount, final Boolean hasMail, final Boolean hasModMail, final int coins, final Boolean showMyActiveCommunities, final boolean hideAds, final boolean outboundClickTracking, final boolean canCreateSubreddit, final boolean canEditName, final List<String> linkedIdentities, final boolean hasPasswordSet, final Boolean acceptChats, final Boolean acceptPrivateMessages, final String snoovatarUrl) {
        e.f((Object)id, "id");
        e.f((Object)username, "username");
        e.f((Object)iconUrl, "iconUrl");
        e.f((Object)linkedIdentities, "linkedIdentities");
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
        this.hasSubscribedToPremium = hasSubscribedToPremium;
        this.isMod = isMod;
        this.hasVerifiedEmail = hasVerifiedEmail;
        this.email = email;
        this.phoneCountryCode = phoneCountryCode;
        this.phoneMaskedNumber = phoneMaskedNumber;
        this.subreddit = subreddit;
        this.iconUrl = iconUrl;
        this.hasBeenVisited = hasBeenVisited;
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
        this.acceptChats = acceptChats;
        this.acceptPrivateMessages = acceptPrivateMessages;
        this.snoovatarUrl = snoovatarUrl;
    }
    
    public MyAccount(String s, String s2, long n, boolean b, Boolean b2, boolean b3, int n2, int n3, int n4, int n5, int n6, boolean b4, boolean b5, Long n7, Long n8, boolean b6, boolean b7, Boolean b8, String s3, String s4, String s5, UserSubreddit userSubreddit, String s6, boolean b9, Map map, boolean b10, Integer n9, boolean b11, Integer value, Boolean b12, Boolean b13, int n10, Boolean b14, boolean b15, boolean b16, boolean b17, boolean b18, List instance, boolean b19, Boolean b20, Boolean b21, String s7, final int n11, final int n12, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n11 & 0x1) != 0x0) {
            s = "";
        }
        if ((n11 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n11 & 0x4) != 0x0) {
            n = 0L;
        }
        if ((n11 & 0x8) != 0x0) {
            b = false;
        }
        if ((n11 & 0x10) != 0x0) {
            b2 = null;
        }
        if ((n11 & 0x20) != 0x0) {
            b3 = false;
        }
        if ((n11 & 0x40) != 0x0) {
            n2 = 0;
        }
        if ((n11 & 0x80) != 0x0) {
            n3 = 0;
        }
        if ((n11 & 0x100) != 0x0) {
            n4 = 0;
        }
        if ((n11 & 0x200) != 0x0) {
            n5 = 0;
        }
        if ((n11 & 0x400) != 0x0) {
            n6 = 0;
        }
        if ((n11 & 0x800) != 0x0) {
            b4 = false;
        }
        if ((n11 & 0x1000) != 0x0) {
            b5 = false;
        }
        if ((n11 & 0x2000) != 0x0) {
            n7 = null;
        }
        if ((n11 & 0x4000) != 0x0) {
            n8 = null;
        }
        if ((n11 & 0x8000) != 0x0) {
            b6 = false;
        }
        if ((n11 & 0x10000) != 0x0) {
            b7 = false;
        }
        if ((n11 & 0x20000) != 0x0) {
            b8 = null;
        }
        if ((n11 & 0x40000) != 0x0) {
            s3 = null;
        }
        if ((n11 & 0x80000) != 0x0) {
            s4 = null;
        }
        if ((n11 & 0x100000) != 0x0) {
            s5 = null;
        }
        if ((n11 & 0x200000) != 0x0) {
            userSubreddit = null;
        }
        if ((n11 & 0x400000) != 0x0) {
            s6 = "";
        }
        if ((n11 & 0x800000) != 0x0) {
            b9 = false;
        }
        if ((n11 & 0x1000000) != 0x0) {
            map = null;
        }
        if ((n11 & 0x2000000) != 0x0) {
            b10 = false;
        }
        if ((n11 & 0x4000000) != 0x0) {
            n9 = null;
        }
        if ((n11 & 0x8000000) != 0x0) {
            b11 = false;
        }
        if ((n11 & 0x10000000) != 0x0) {
            value = 0;
        }
        final boolean b22 = false;
        if ((n11 & 0x20000000) != 0x0) {
            b12 = null;
        }
        if ((n11 & 0x40000000) != 0x0) {
            b13 = null;
        }
        if ((n11 & Integer.MIN_VALUE) != 0x0) {
            n10 = 0;
        }
        if ((n12 & 0x1) != 0x0) {
            b14 = null;
        }
        if ((n12 & 0x2) != 0x0) {
            b15 = false;
        }
        if ((n12 & 0x4) != 0x0) {
            b16 = false;
        }
        if ((n12 & 0x8) != 0x0) {
            b17 = false;
        }
        if ((n12 & 0x10) != 0x0) {
            b18 = false;
        }
        if ((n12 & 0x20) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n12 & 0x40) != 0x0) {
            b19 = b22;
        }
        if ((n12 & 0x80) != 0x0) {
            b20 = null;
        }
        if ((n12 & 0x100) != 0x0) {
            b21 = null;
        }
        if ((n12 & 0x200) != 0x0) {
            s7 = null;
        }
        this(s, s2, n, b, b2, b3, n2, n3, n4, n5, n6, b4, b5, n7, n8, b6, b7, b8, s3, s4, s5, userSubreddit, s6, b9, map, b10, n9, b11, value, b12, b13, n10, b14, b15, b16, b17, b18, (List<String>)instance, b19, b20, b21, s7);
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
        return this.getHasSubscribedToPremium();
    }
    
    public final boolean component17() {
        return this.isMod();
    }
    
    public final Boolean component18() {
        return this.getHasVerifiedEmail();
    }
    
    public final String component19() {
        return this.email;
    }
    
    public final String component2() {
        return this.getUsername();
    }
    
    public final String component20() {
        return this.phoneCountryCode;
    }
    
    public final String component21() {
        return this.phoneMaskedNumber;
    }
    
    public final UserSubreddit component22() {
        return this.subreddit;
    }
    
    public final String component23() {
        return this.iconUrl;
    }
    
    public final boolean component24() {
        return this.hasBeenVisited;
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
    
    public final Integer component29() {
        return this.inboxCount;
    }
    
    public final long component3() {
        return this.getCreatedUtc();
    }
    
    public final Boolean component30() {
        return this.hasMail;
    }
    
    public final Boolean component31() {
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
    
    public final Boolean component40() {
        return this.acceptChats;
    }
    
    public final Boolean component41() {
        return this.acceptPrivateMessages;
    }
    
    public final String component42() {
        return this.snoovatarUrl;
    }
    
    public final Boolean component5() {
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
    
    public final MyAccount copy(final String s, final String s2, final long n, final boolean b, final Boolean b2, final boolean b3, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b4, final boolean b5, final Long n7, final Long n8, final boolean b6, final boolean b7, final Boolean b8, final String s3, final String s4, final String s5, final UserSubreddit userSubreddit, final String s6, final boolean b9, final Map<String, ?> map, final boolean b10, final Integer n9, final boolean b11, final Integer n10, final Boolean b12, final Boolean b13, final int n11, final Boolean b14, final boolean b15, final boolean b16, final boolean b17, final boolean b18, final List<String> list, final boolean b19, final Boolean b20, final Boolean b21, final String s7) {
        e.f((Object)s, "id");
        e.f((Object)s2, "username");
        e.f((Object)s6, "iconUrl");
        e.f((Object)list, "linkedIdentities");
        return new MyAccount(s, s2, n, b, b2, b3, n2, n3, n4, n5, n6, b4, b5, n7, n8, b6, b7, b8, s3, s4, s5, userSubreddit, s6, b9, map, b10, n9, b11, n10, b12, b13, n11, b14, b15, b16, b17, b18, list, b19, b20, b21, s7);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyAccount)) {
            return false;
        }
        final MyAccount myAccount = (MyAccount)o;
        return e.a((Object)this.getId(), (Object)myAccount.getId()) && e.a((Object)this.getUsername(), (Object)myAccount.getUsername()) && this.getCreatedUtc() == myAccount.getCreatedUtc() && this.isEmployee() == myAccount.isEmployee() && e.a((Object)this.isFriend, (Object)myAccount.isFriend) && this.hideFromRobots == myAccount.hideFromRobots && this.totalKarma == myAccount.totalKarma && this.linkKarma == myAccount.linkKarma && this.commentKarma == myAccount.commentKarma && this.awarderKarma == myAccount.awarderKarma && this.awardeeKarma == myAccount.awardeeKarma && this.getHasPremium() == myAccount.getHasPremium() && this.isPremiumSubscriber() == myAccount.isPremiumSubscriber() && e.a((Object)this.getPremiumExpirationUtcSeconds(), (Object)myAccount.getPremiumExpirationUtcSeconds()) && e.a((Object)this.getPremiumSinceUtcSeconds(), (Object)myAccount.getPremiumSinceUtcSeconds()) && this.getHasSubscribedToPremium() == myAccount.getHasSubscribedToPremium() && this.isMod() == myAccount.isMod() && e.a((Object)this.getHasVerifiedEmail(), (Object)myAccount.getHasVerifiedEmail()) && e.a((Object)this.email, (Object)myAccount.email) && e.a((Object)this.phoneCountryCode, (Object)myAccount.phoneCountryCode) && e.a((Object)this.phoneMaskedNumber, (Object)myAccount.phoneMaskedNumber) && e.a((Object)this.subreddit, (Object)myAccount.subreddit) && e.a((Object)this.iconUrl, (Object)myAccount.iconUrl) && this.hasBeenVisited == myAccount.hasBeenVisited && e.a((Object)this.features, (Object)myAccount.features) && this.isSuspended() == myAccount.isSuspended() && e.a((Object)this.getSuspensionExpirationUtc(), (Object)myAccount.getSuspensionExpirationUtc()) && this.getForcePasswordReset() == myAccount.getForcePasswordReset() && e.a((Object)this.inboxCount, (Object)myAccount.inboxCount) && e.a((Object)this.hasMail, (Object)myAccount.hasMail) && e.a((Object)this.hasModMail, (Object)myAccount.hasModMail) && this.getCoins() == myAccount.getCoins() && e.a((Object)this.showMyActiveCommunities, (Object)myAccount.showMyActiveCommunities) && this.hideAds == myAccount.hideAds && this.outboundClickTracking == myAccount.outboundClickTracking && this.getCanCreateSubreddit() == myAccount.getCanCreateSubreddit() && this.getCanEditName() == myAccount.getCanEditName() && e.a((Object)this.getLinkedIdentities(), (Object)myAccount.getLinkedIdentities()) && this.getHasPasswordSet() == myAccount.getHasPasswordSet() && e.a((Object)this.acceptChats, (Object)myAccount.acceptChats) && e.a((Object)this.acceptPrivateMessages, (Object)myAccount.acceptPrivateMessages) && e.a((Object)this.snoovatarUrl, (Object)myAccount.snoovatarUrl);
    }
    
    public final Boolean getAcceptChats() {
        return this.acceptChats;
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
    
    public final Boolean getHasMail() {
        return this.hasMail;
    }
    
    public final Boolean getHasModMail() {
        return this.hasModMail;
    }
    
    public boolean getHasPasswordSet() {
        return this.hasPasswordSet;
    }
    
    public boolean getHasPhoneNumberSet() {
        return a.X((CharSequence)this.phoneCountryCode) && a.X((CharSequence)this.phoneMaskedNumber);
    }
    
    public boolean getHasPremium() {
        return this.hasPremium;
    }
    
    public boolean getHasSubscribedToPremium() {
        return this.hasSubscribedToPremium;
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
    
    public final Integer getInboxCount() {
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
    
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }
    
    public final String getPhoneMaskedNumber() {
        return this.phoneMaskedNumber;
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
    
    public final String getSnoovatarUrl() {
        return this.snoovatarUrl;
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
        int n = 1;
        int n2 = employee;
        if (employee != 0) {
            n2 = 1;
        }
        final Boolean isFriend = this.isFriend;
        int hashCode4 = 0;
        int hashCode5;
        if (isFriend == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = isFriend.hashCode();
        }
        int hideFromRobots;
        if ((hideFromRobots = (this.hideFromRobots ? 1 : 0)) != 0) {
            hideFromRobots = 1;
        }
        final int c = a.c(this.awardeeKarma, a.c(this.awarderKarma, a.c(this.commentKarma, a.c(this.linkKarma, a.c(this.totalKarma, ((((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + n2) * 31 + hashCode5) * 31 + hideFromRobots) * 31, 31), 31), 31), 31), 31);
        int hasPremium;
        if ((hasPremium = (this.getHasPremium() ? 1 : 0)) != 0) {
            hasPremium = 1;
        }
        int premiumSubscriber;
        if ((premiumSubscriber = (this.isPremiumSubscriber() ? 1 : 0)) != 0) {
            premiumSubscriber = 1;
        }
        int hashCode6;
        if (this.getPremiumExpirationUtcSeconds() == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getPremiumExpirationUtcSeconds().hashCode();
        }
        int hashCode7;
        if (this.getPremiumSinceUtcSeconds() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getPremiumSinceUtcSeconds().hashCode();
        }
        int hasSubscribedToPremium;
        if ((hasSubscribedToPremium = (this.getHasSubscribedToPremium() ? 1 : 0)) != 0) {
            hasSubscribedToPremium = 1;
        }
        int mod;
        if ((mod = (this.isMod() ? 1 : 0)) != 0) {
            mod = 1;
        }
        int hashCode8;
        if (this.getHasVerifiedEmail() == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = this.getHasVerifiedEmail().hashCode();
        }
        final String email = this.email;
        int hashCode9;
        if (email == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = email.hashCode();
        }
        final String phoneCountryCode = this.phoneCountryCode;
        int hashCode10;
        if (phoneCountryCode == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = phoneCountryCode.hashCode();
        }
        final String phoneMaskedNumber = this.phoneMaskedNumber;
        int hashCode11;
        if (phoneMaskedNumber == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = phoneMaskedNumber.hashCode();
        }
        final UserSubreddit subreddit = this.subreddit;
        int hashCode12;
        if (subreddit == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = subreddit.hashCode();
        }
        final int c2 = b.c(this.iconUrl, (((((((((((c + hasPremium) * 31 + premiumSubscriber) * 31 + hashCode6) * 31 + hashCode7) * 31 + hasSubscribedToPremium) * 31 + mod) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31, 31);
        int hasBeenVisited;
        if ((hasBeenVisited = (this.hasBeenVisited ? 1 : 0)) != 0) {
            hasBeenVisited = 1;
        }
        final Map<String, Object> features = this.features;
        int hashCode13;
        if (features == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = features.hashCode();
        }
        int suspended;
        if ((suspended = (this.isSuspended() ? 1 : 0)) != 0) {
            suspended = 1;
        }
        int hashCode14;
        if (this.getSuspensionExpirationUtc() == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = this.getSuspensionExpirationUtc().hashCode();
        }
        int forcePasswordReset;
        if ((forcePasswordReset = (this.getForcePasswordReset() ? 1 : 0)) != 0) {
            forcePasswordReset = 1;
        }
        final Integer inboxCount = this.inboxCount;
        int hashCode15;
        if (inboxCount == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = inboxCount.hashCode();
        }
        final Boolean hasMail = this.hasMail;
        int hashCode16;
        if (hasMail == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = hasMail.hashCode();
        }
        final Boolean hasModMail = this.hasModMail;
        int hashCode17;
        if (hasModMail == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = hasModMail.hashCode();
        }
        final int hashCode18 = Integer.hashCode(this.getCoins());
        final Boolean showMyActiveCommunities = this.showMyActiveCommunities;
        int hashCode19;
        if (showMyActiveCommunities == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = showMyActiveCommunities.hashCode();
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
        final int hashCode20 = this.getLinkedIdentities().hashCode();
        final int hasPasswordSet = this.getHasPasswordSet() ? 1 : 0;
        if (hasPasswordSet == 0) {
            n = hasPasswordSet;
        }
        final Boolean acceptChats = this.acceptChats;
        int hashCode21;
        if (acceptChats == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = acceptChats.hashCode();
        }
        final Boolean acceptPrivateMessages = this.acceptPrivateMessages;
        int hashCode22;
        if (acceptPrivateMessages == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = acceptPrivateMessages.hashCode();
        }
        final String snoovatarUrl = this.snoovatarUrl;
        if (snoovatarUrl != null) {
            hashCode4 = snoovatarUrl.hashCode();
        }
        return ((((hashCode20 + ((((((hashCode18 + ((((((((c2 + hasBeenVisited) * 31 + hashCode13) * 31 + suspended) * 31 + hashCode14) * 31 + forcePasswordReset) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31) * 31 + hashCode19) * 31 + hideAds) * 31 + outboundClickTracking) * 31 + canCreateSubreddit) * 31 + canEditName) * 31) * 31 + n) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode4;
    }
    
    public boolean isEmailAccessible() {
        return !e.a((Object)this.email, (Object)"") && this.email != null;
    }
    
    public boolean isEmailPermissionRequired() {
        final Map<String, Object> features = this.features;
        return features != null && e.a(features.get("is_email_permission_required"), (Object)Boolean.TRUE);
    }
    
    public boolean isEmployee() {
        return this.isEmployee;
    }
    
    public final Boolean isFriend() {
        return this.isFriend;
    }
    
    public boolean isMod() {
        return this.isMod;
    }
    
    public boolean isPremiumSubscriber() {
        return true;
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
        final StringBuilder r = a.r("MyAccount(id=");
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
        r.append(", hasSubscribedToPremium=");
        r.append(this.getHasSubscribedToPremium());
        r.append(", isMod=");
        r.append(this.isMod());
        r.append(", hasVerifiedEmail=");
        r.append(this.getHasVerifiedEmail());
        r.append(", email=");
        r.append(this.email);
        r.append(", phoneCountryCode=");
        r.append(this.phoneCountryCode);
        r.append(", phoneMaskedNumber=");
        r.append(this.phoneMaskedNumber);
        r.append(", subreddit=");
        r.append(this.subreddit);
        r.append(", iconUrl=");
        r.append(this.iconUrl);
        r.append(", hasBeenVisited=");
        r.append(this.hasBeenVisited);
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
        r.append(", acceptChats=");
        r.append(this.acceptChats);
        r.append(", acceptPrivateMessages=");
        r.append(this.acceptPrivateMessages);
        r.append(", snoovatarUrl=");
        return f0.n(r, this.snoovatarUrl, ')');
    }
}
