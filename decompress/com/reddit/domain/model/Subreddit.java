// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import aq2.a;
import xi2.j;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.structuredstyles.model.widgets.RuleWidget;
import java.util.Map;
import com.reddit.structuredstyles.model.widgets.BaseWidget;
import java.util.ArrayList;
import com.reddit.structuredstyles.model.Style;
import com.reddit.session.m;
import com.reddit.domain.powerups.PowerupsBenefit;
import bd0.l;
import kotlin.collections.EmptyList;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.media.MediaInCommentType;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 ª\u00022\u00020\u00012\u00020\u0002:\u0002ª\u0002B\u00e1\u0006\u0012\b\b\u0003\u0010]\u001a\u00020\u000e\u0012\b\b\u0003\u0010^\u001a\u00020\u000e\u0012\b\b\u0003\u0010_\u001a\u00020\u000e\u0012\b\b\u0003\u0010`\u001a\u00020\u000e\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0003\u0010g\u001a\u00020\u000e\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010i\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0003\u0010j\u001a\u00020\u001a\u0012\b\b\u0003\u0010k\u001a\u00020\u000e\u0012\b\b\u0002\u0010l\u001a\u00020\u000e\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010o\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010p\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010q\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010s\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010u\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010w\u001a\u00020\u0007\u0012\n\b\u0003\u0010x\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010y\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010z\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010{\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010|\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010}\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010~\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u007f\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0086\u0001\u001a\u0004\u0018\u00010;\u0012\u000b\b\u0003\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u0011\b\u0003\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H\u0012\u000b\b\u0003\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0003\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000f\b\u0003\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020Q0H\u0012\u000b\b\u0003\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000e\u0012\u000b\b\u0003\u0010\u009c\u0001\u001a\u0004\u0018\u00010U\u0012\u000b\b\u0003\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u0011\b\u0003\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010H\u0012\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0007\u0012\t\b\u0002\u0010 \u0001\u001a\u00020\u0007\u0012\t\b\u0002\u0010¡\u0001\u001a\u00020\u0007¢\u0006\u0006\b¨\u0002\u0010©\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\t\u0010\u001e\u001a\u00020\u001aH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010 \u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b#\u0010\"J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b'\u0010\"J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b1\u0010\"J\u0012\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b2\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b3\u0010\"J\u0012\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b4\u0010\"J\u0012\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b5\u0010\"J\u0012\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b6\u0010\"J\u0012\u00107\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b7\u0010\"J\u0012\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b8\u0010\"J\u0012\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b9\u0010\"J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b:\u0010\"J\u000b\u0010<\u001a\u0004\u0018\u00010;H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bA\u0010\"J\u0012\u0010B\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bB\u0010\"J\u0012\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bC\u0010\"J\u000b\u0010D\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010HH\u00c6\u0003J\u0012\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bK\u0010\"J\u0012\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bL\u0010\"J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bO\u0010\"J\u0012\u0010P\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bP\u0010\"J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0HH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010UH\u00c6\u0003J\u0012\u0010W\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bW\u0010\"J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010HH\u00c6\u0003J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\bZ\u0010\"J\t\u0010[\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0007H\u00c6\u0003J\u00eb\u0006\u0010¢\u0001\u001a\u00020\u00002\b\b\u0003\u0010]\u001a\u00020\u000e2\b\b\u0003\u0010^\u001a\u00020\u000e2\b\b\u0003\u0010_\u001a\u00020\u000e2\b\b\u0003\u0010`\u001a\u00020\u000e2\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010g\u001a\u00020\u000e2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010i\u001a\u0004\u0018\u00010\u001a2\b\b\u0003\u0010j\u001a\u00020\u001a2\b\b\u0003\u0010k\u001a\u00020\u000e2\b\b\u0002\u0010l\u001a\u00020\u000e2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010o\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010p\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010q\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010s\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010u\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010w\u001a\u00020\u00072\n\b\u0003\u0010x\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010y\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010z\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010{\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010|\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010}\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010~\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u007f\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0086\u0001\u001a\u0004\u0018\u00010;2\u000b\b\u0003\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000e2\u0011\b\u0003\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H2\u000b\b\u0003\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00072\u000b\b\u0003\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00072\u000f\b\u0003\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020Q0H2\u000b\b\u0003\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0003\u0010\u009c\u0001\u001a\u0004\u0018\u00010U2\u000b\b\u0003\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00072\u0011\b\u0003\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010H2\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00072\t\b\u0002\u0010 \u0001\u001a\u00020\u00072\t\b\u0002\u0010¡\u0001\u001a\u00020\u0007H\u00c6\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\n\u0010¤\u0001\u001a\u00020\u000eH\u00d6\u0001J\u000b\u0010¦\u0001\u001a\u00030¥\u0001H\u00d6\u0001J\u0016\u0010©\u0001\u001a\u00020\u00072\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u00d6\u0003J\u000b\u0010ª\u0001\u001a\u00030¥\u0001H\u00d6\u0001J\u001f\u0010¯\u0001\u001a\u00030®\u00012\b\u0010¬\u0001\u001a\u00030«\u00012\b\u0010\u00ad\u0001\u001a\u00030¥\u0001H\u00d6\u0001J\u001d\u0010²\u0001\u001a\u00030±\u00012\u0007\u0010°\u0001\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002R\u001a\u0010]\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\b]\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u001d\u0010^\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b^\u0010³\u0001\u001a\u0006\b¶\u0001\u0010µ\u0001R\u001a\u0010_\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\b_\u0010³\u0001\u001a\u0006\b·\u0001\u0010µ\u0001R\u001a\u0010`\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\b`\u0010³\u0001\u001a\u0006\b¸\u0001\u0010µ\u0001R\u001c\u0010a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\ba\u0010³\u0001\u001a\u0006\b¹\u0001\u0010µ\u0001R\u001c\u0010b\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bb\u0010³\u0001\u001a\u0006\bº\u0001\u0010µ\u0001R\u001c\u0010c\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bc\u0010³\u0001\u001a\u0006\b»\u0001\u0010µ\u0001R\u001c\u0010d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bd\u0010³\u0001\u001a\u0006\b¼\u0001\u0010µ\u0001R\u001c\u0010e\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\be\u0010³\u0001\u001a\u0006\b½\u0001\u0010µ\u0001R\u001c\u0010f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bf\u0010³\u0001\u001a\u0006\b¾\u0001\u0010µ\u0001R\u001a\u0010g\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\bg\u0010³\u0001\u001a\u0006\b¿\u0001\u0010µ\u0001R\u001b\u0010h\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\bh\u0010\u00c0\u0001\u001a\u0005\b\u00c1\u0001\u0010\u001cR\u001b\u0010i\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\bi\u0010\u00c0\u0001\u001a\u0005\b\u00c2\u0001\u0010\u001cR\u001a\u0010j\u001a\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\bj\u0010\u00c3\u0001\u001a\u0006\b\u00c4\u0001\u0010\u00c5\u0001R\u001a\u0010k\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\bk\u0010³\u0001\u001a\u0006\b\u00c6\u0001\u0010µ\u0001R\u001a\u0010l\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\bl\u0010³\u0001\u001a\u0006\b\u00c7\u0001\u0010µ\u0001R\u001b\u0010m\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bm\u0010\u00c8\u0001\u001a\u0005\b\u00c9\u0001\u0010\"R\u001b\u0010n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bn\u0010\u00c8\u0001\u001a\u0005\b\u00ca\u0001\u0010\"R\u001c\u0010o\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bo\u0010³\u0001\u001a\u0006\b\u00cb\u0001\u0010µ\u0001R&\u0010p\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bp\u0010\u00c8\u0001\u0012\u0006\b\u00cd\u0001\u0010\u00ce\u0001\u001a\u0005\b\u00cc\u0001\u0010\"R\u001b\u0010q\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bq\u0010\u00c8\u0001\u001a\u0005\b\u00cf\u0001\u0010\"R\u001b\u0010r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\br\u0010\u00c8\u0001\u001a\u0005\b\u00d0\u0001\u0010\"R\u001c\u0010s\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bs\u0010³\u0001\u001a\u0006\b\u00d1\u0001\u0010µ\u0001R\u001c\u0010t\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bt\u0010³\u0001\u001a\u0006\b\u00d2\u0001\u0010µ\u0001R\u001c\u0010u\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bu\u0010³\u0001\u001a\u0006\b\u00d3\u0001\u0010µ\u0001R\u001c\u0010v\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bv\u0010³\u0001\u001a\u0006\b\u00d4\u0001\u0010µ\u0001R\u001a\u0010w\u001a\u00020\u00078\u0006¢\u0006\u000f\n\u0005\bw\u0010\u00d5\u0001\u001a\u0006\b\u00d6\u0001\u0010\u00d7\u0001R\u001c\u0010x\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\bx\u0010³\u0001\u001a\u0006\b\u00d8\u0001\u0010µ\u0001R\u001b\u0010y\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\by\u0010\u00c8\u0001\u001a\u0005\b\u00d9\u0001\u0010\"R\u001b\u0010z\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\bz\u0010\u00c8\u0001\u001a\u0005\b\u00da\u0001\u0010\"R\u001b\u0010{\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b{\u0010\u00c8\u0001\u001a\u0005\b\u00db\u0001\u0010\"R\u001b\u0010|\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b|\u0010\u00c8\u0001\u001a\u0005\b\u00dc\u0001\u0010\"R\u001a\u0010}\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0005\b}\u0010\u00c8\u0001\u001a\u0004\b}\u0010\"R\u001b\u0010~\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b~\u0010\u00c8\u0001\u001a\u0005\b\u00dd\u0001\u0010\"R\u001b\u0010\u007f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u00c8\u0001\u001a\u0005\b\u00de\u0001\u0010\"R\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00df\u0001\u0010\"R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00e0\u0001\u0010\"\"\u0006\b\u00e1\u0001\u0010\u00e2\u0001R*\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00e3\u0001\u0010\"\"\u0006\b\u00e4\u0001\u0010\u00e2\u0001R*\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00e5\u0001\u0010\"\"\u0006\b\u00e6\u0001\u0010\u00e2\u0001R*\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00e7\u0001\u0010\"\"\u0006\b\u00e8\u0001\u0010\u00e2\u0001R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00e9\u0001\u0010\"\"\u0006\b\u00ea\u0001\u0010\u00e2\u0001R\u001e\u0010\u0086\u0001\u001a\u0004\u0018\u00010;8\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u00eb\u0001\u001a\u0006\b\u00ec\u0001\u0010\u00ed\u0001R\u001e\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010³\u0001\u001a\u0006\b\u00ee\u0001\u0010µ\u0001R\u001e\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010³\u0001\u001a\u0006\b\u00ef\u0001\u0010µ\u0001R\u001e\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010³\u0001\u001a\u0006\b\u00f0\u0001\u0010µ\u0001R\u001e\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010³\u0001\u001a\u0006\b\u00f1\u0001\u0010µ\u0001R\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00f2\u0001\u0010\"R\u001d\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00f3\u0001\u0010\"R\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00f4\u0001\u0010\"R\u001e\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010³\u0001\u001a\u0006\b\u00f5\u0001\u0010µ\u0001R\u001e\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010³\u0001\u001a\u0006\b\u00f6\u0001\u0010µ\u0001R\u001e\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010³\u0001\u001a\u0006\b\u00f7\u0001\u0010µ\u0001R\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010³\u0001\u001a\u0006\b\u00f8\u0001\u0010µ\u0001R1\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u00f9\u0001\u001a\u0006\b\u00fa\u0001\u0010\u00fb\u0001\"\u0006\b\u00fc\u0001\u0010\u00fd\u0001R\u001d\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00fe\u0001\u0010\"R\u001d\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u00c8\u0001\u001a\u0005\b\u00ff\u0001\u0010\"R\u001e\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010³\u0001\u001a\u0006\b\u0080\u0002\u0010µ\u0001R\u001e\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010³\u0001\u001a\u0006\b\u0081\u0002\u0010µ\u0001R\u001d\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u00c8\u0001\u001a\u0005\b\u0082\u0002\u0010\"R\u001d\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u00c8\u0001\u001a\u0005\b\u0098\u0001\u0010\"R\"\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020Q0H8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u00f9\u0001\u001a\u0006\b\u0083\u0002\u0010\u00fb\u0001R\u001e\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010³\u0001\u001a\u0006\b\u0084\u0002\u0010µ\u0001R\u001e\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010³\u0001\u001a\u0006\b\u0085\u0002\u0010µ\u0001R\u001e\u0010\u009c\u0001\u001a\u0004\u0018\u00010U8\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001d\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u009d\u0001\u0010\u00c8\u0001\u001a\u0005\b\u0089\u0002\u0010\"R1\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u00f9\u0001\u001a\u0006\b\u008a\u0002\u0010\u00fb\u0001\"\u0006\b\u008b\u0002\u0010\u00fd\u0001R\u001d\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u00c8\u0001\u001a\u0005\b\u009f\u0001\u0010\"R\u001c\u0010 \u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010\u00d5\u0001\u001a\u0006\b \u0001\u0010\u00d7\u0001R\u001c\u0010¡\u0001\u001a\u00020\u00078\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u00d5\u0001\u001a\u0006\b¡\u0001\u0010\u00d7\u0001R4\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0006@\u0006X\u0086\u000e¢\u0006 \n\u0006\b\u008d\u0002\u0010\u008e\u0002\u0012\u0006\b\u0093\u0002\u0010\u00ce\u0001\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0014\u0010\u0094\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u00d7\u0001R\u0014\u0010\u0095\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u00d7\u0001R\u0014\u0010\u0096\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u00d7\u0001R\u0014\u0010\u0097\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u00d7\u0001R\u0014\u0010\u0098\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u00d7\u0001R\u0014\u0010\u0099\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u00d7\u0001R\u0014\u0010\u009a\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u00d7\u0001R\u0014\u0010\u009b\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u00d7\u0001R\u0016\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010µ\u0001R\u0016\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010µ\u0001R\u0016\u0010¡\u0002\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b \u0002\u0010µ\u0001R\u0016\u0010£\u0002\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b¢\u0002\u0010µ\u0001R\u0016\u0010¥\u0002\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b¤\u0002\u0010µ\u0001R\u0014\u0010§\u0002\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b¦\u0002\u0010\u00d7\u0001¨\u0006«\u0002" }, d2 = { "Lcom/reddit/domain/model/Subreddit;", "Lcom/reddit/domain/model/RedditModel;", "Landroid/os/Parcelable;", "Lbd0/l;", "powerupsStatus", "Lcom/reddit/domain/model/PostPermissions;", "getPostPermissions", "", "hasDescriptionInfo", "hasPredictionsLeaderboardEntryInFeedUnit", "hasPredictionsLeaderboardEntryInSubredditHeader", "Lcom/reddit/session/m;", "account", "canUserPost", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "()Ljava/lang/Long;", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "Lcom/reddit/notification/common/NotificationLevel;", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "Lcom/reddit/domain/model/Rule;", "component61", "component62", "component63", "Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "component64", "component65", "Lcom/reddit/domain/model/media/MediaInCommentType;", "component66", "component67", "component68", "component69", "id", "kindWithId", "displayName", "displayNamePrefixed", "iconImg", "keyColor", "bannerImg", "title", "description", "descriptionRtJson", "publicDescription", "subscribers", "accountsActive", "createdUtc", "subredditType", "url", "over18", "wikiEnabled", "whitelistStatus", "newModMailEnabled", "restrictPosting", "quarantined", "quarantineMessage", "quarantineMessageRtJson", "interstitialWarningMessage", "interstitialWarningMessageRtJson", "hasBeenVisited", "submitType", "allowImages", "allowVideos", "allowGifs", "allowChatPostCreation", "isChatPostFeatureEnabled", "spoilersEnabled", "allowPolls", "allowPredictions", "userIsBanned", "userIsContributor", "userIsModerator", "userIsSubscriber", "userHasFavorited", "notificationLevel", "primaryColorKey", "communityIconUrl", "bannerBackgroundImageUrl", "mobileBannerImageUrl", "userFlairEnabled", "canAssignUserFlair", "userSubredditFlairEnabled", "userFlairTemplateId", "userFlairBackgroundColor", "userFlairTextColor", "userFlairText", "user_flair_richtext", "postFlairEnabled", "canAssignLinkFlair", "contentCategory", "predictionLeaderboardEntryType", "allowPredictionsTournament", "isUserBanned", "rules", "countrySiteCountry", "countrySiteLanguage", "subredditCountrySiteSettings", "shouldShowMediaInCommentsSetting", "allowedMediaInComments", "isTitleSafe", "isMyReddit", "isMuted", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/notification/common/NotificationLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/SubredditCountrySiteSettings;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZ)Lcom/reddit/domain/model/Subreddit;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "linksEnabled", "Lcom/reddit/domain/model/PostPermission;", "getPostVideoPermission", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "getDisplayName", "getDisplayNamePrefixed", "getIconImg", "getKeyColor", "getBannerImg", "getTitle", "getDescription", "getDescriptionRtJson", "getPublicDescription", "Ljava/lang/Long;", "getSubscribers", "getAccountsActive", "J", "getCreatedUtc", "()J", "getSubredditType", "getUrl", "Ljava/lang/Boolean;", "getOver18", "getWikiEnabled", "getWhitelistStatus", "getNewModMailEnabled", "getNewModMailEnabled$annotations", "()V", "getRestrictPosting", "getQuarantined", "getQuarantineMessage", "getQuarantineMessageRtJson", "getInterstitialWarningMessage", "getInterstitialWarningMessageRtJson", "Z", "getHasBeenVisited", "()Z", "getSubmitType", "getAllowImages", "getAllowVideos", "getAllowGifs", "getAllowChatPostCreation", "getSpoilersEnabled", "getAllowPolls", "getAllowPredictions", "getUserIsBanned", "setUserIsBanned", "(Ljava/lang/Boolean;)V", "getUserIsContributor", "setUserIsContributor", "getUserIsModerator", "setUserIsModerator", "getUserIsSubscriber", "setUserIsSubscriber", "getUserHasFavorited", "setUserHasFavorited", "Lcom/reddit/notification/common/NotificationLevel;", "getNotificationLevel", "()Lcom/reddit/notification/common/NotificationLevel;", "getPrimaryColorKey", "getCommunityIconUrl", "getBannerBackgroundImageUrl", "getMobileBannerImageUrl", "getUserFlairEnabled", "getCanAssignUserFlair", "getUserSubredditFlairEnabled", "getUserFlairTemplateId", "getUserFlairBackgroundColor", "getUserFlairTextColor", "getUserFlairText", "Ljava/util/List;", "getUser_flair_richtext", "()Ljava/util/List;", "setUser_flair_richtext", "(Ljava/util/List;)V", "getPostFlairEnabled", "getCanAssignLinkFlair", "getContentCategory", "getPredictionLeaderboardEntryType", "getAllowPredictionsTournament", "getRules", "getCountrySiteCountry", "getCountrySiteLanguage", "Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "getSubredditCountrySiteSettings", "()Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "getShouldShowMediaInCommentsSetting", "getAllowedMediaInComments", "setAllowedMediaInComments", "Lcom/reddit/structuredstyles/model/StructuredStyle;", "structuredStyle", "Lcom/reddit/structuredstyles/model/StructuredStyle;", "getStructuredStyle", "()Lcom/reddit/structuredstyles/model/StructuredStyle;", "setStructuredStyle", "(Lcom/reddit/structuredstyles/model/StructuredStyle;)V", "getStructuredStyle$annotations", "isUser", "isPublic", "isPrivate", "isPremium", "isGoldRestricted", "isRestricted", "isArchived", "isEmployeeOnly", "getPrimaryColor", "primaryColor", "getSecondaryColor", "secondaryColor", "getCommunityIcon", "communityIcon", "getBannerBackgroundImage", "bannerBackgroundImage", "getBannerBackgroundColor", "bannerBackgroundColor", "getHasRules", "hasRules", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/notification/common/NotificationLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/SubredditCountrySiteSettings;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZ)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Subreddit implements RedditModel, Parcelable
{
    public static final Parcelable$Creator<Subreddit> CREATOR;
    public static final Companion Companion;
    public static final String PREDICTION_LEADERBOARD_ENTRY_TYPE_IN_FEED = "IN_FEED";
    public static final String PREDICTION_LEADERBOARD_ENTRY_TYPE_SUBREDDIT_HEADER = "SUBREDDIT_HEADER";
    public static final String SUBREDDIT_TYPE_ARCHIVED = "archived";
    public static final String SUBREDDIT_TYPE_EMPLOYEES_ONLY = "employees_only";
    public static final String SUBREDDIT_TYPE_GOLD_RESTRICTED = "gold_restricted";
    public static final String SUBREDDIT_TYPE_PREMIUM = "gold_only";
    public static final String SUBREDDIT_TYPE_PRIVATE = "private";
    public static final String SUBREDDIT_TYPE_PUBLIC = "public";
    public static final String SUBREDDIT_TYPE_RESTRICTED = "restricted";
    public static final String SUBREDDIT_TYPE_USER = "user";
    private final Long accountsActive;
    private final Boolean allowChatPostCreation;
    private final Boolean allowGifs;
    private final Boolean allowImages;
    private final Boolean allowPolls;
    private final Boolean allowPredictions;
    private final Boolean allowPredictionsTournament;
    private final Boolean allowVideos;
    private List<? extends MediaInCommentType> allowedMediaInComments;
    private final String bannerBackgroundImageUrl;
    private final String bannerImg;
    private final Boolean canAssignLinkFlair;
    private final Boolean canAssignUserFlair;
    private final String communityIconUrl;
    private final String contentCategory;
    private final String countrySiteCountry;
    private final String countrySiteLanguage;
    private final long createdUtc;
    private final String description;
    private final transient String descriptionRtJson;
    private final String displayName;
    private final String displayNamePrefixed;
    private final boolean hasBeenVisited;
    private final String iconImg;
    private final String id;
    private final String interstitialWarningMessage;
    private final transient String interstitialWarningMessageRtJson;
    private final Boolean isChatPostFeatureEnabled;
    private final boolean isMuted;
    private final boolean isMyReddit;
    private final Boolean isTitleSafe;
    private final Boolean isUserBanned;
    private final String keyColor;
    private final String kindWithId;
    private final String mobileBannerImageUrl;
    private final Boolean newModMailEnabled;
    private final NotificationLevel notificationLevel;
    private final Boolean over18;
    private final Boolean postFlairEnabled;
    private final String predictionLeaderboardEntryType;
    private final String primaryColorKey;
    private final String publicDescription;
    private final String quarantineMessage;
    private final transient String quarantineMessageRtJson;
    private final Boolean quarantined;
    private final Boolean restrictPosting;
    private final List<Rule> rules;
    private final Boolean shouldShowMediaInCommentsSetting;
    private final Boolean spoilersEnabled;
    private StructuredStyle structuredStyle;
    private final String submitType;
    private final SubredditCountrySiteSettings subredditCountrySiteSettings;
    private final String subredditType;
    private final Long subscribers;
    private final String title;
    private final String url;
    private final String userFlairBackgroundColor;
    private final Boolean userFlairEnabled;
    private final String userFlairTemplateId;
    private final String userFlairText;
    private final String userFlairTextColor;
    private Boolean userHasFavorited;
    private Boolean userIsBanned;
    private Boolean userIsContributor;
    private Boolean userIsModerator;
    private Boolean userIsSubscriber;
    private final Boolean userSubredditFlairEnabled;
    private List<FlairRichTextItem> user_flair_richtext;
    private final String whitelistStatus;
    private final Boolean wikiEnabled;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Subreddit(@n(name = "id") final String id, @n(name = "name") final String kindWithId, @n(name = "display_name") final String displayName, @n(name = "display_name_prefixed") final String displayNamePrefixed, @n(name = "icon_img") final String iconImg, @n(name = "key_color") final String keyColor, @n(name = "banner_img") final String bannerImg, final String title, final String description, final String descriptionRtJson, @n(name = "public_description") final String publicDescription, final Long subscribers, @n(name = "accounts_active") final Long accountsActive, @n(name = "created_utc") final long createdUtc, @n(name = "subreddit_type") final String subredditType, final String url, final Boolean over18, @n(name = "wiki_enabled") final Boolean wikiEnabled, @n(name = "whitelist_status") final String whitelistStatus, @n(name = "is_enrolled_in_new_modmail") final Boolean newModMailEnabled, @n(name = "restrict_posting") final Boolean restrictPosting, @n(name = "quarantine") final Boolean quarantined, @n(name = "quarantine_message") final String quarantineMessage, final String quarantineMessageRtJson, @n(name = "interstitial_warning_message_html") final String interstitialWarningMessage, final String interstitialWarningMessageRtJson, final boolean hasBeenVisited, @n(name = "submission_type") final String submitType, @n(name = "allow_images") final Boolean allowImages, @n(name = "allow_videos") final Boolean allowVideos, @n(name = "allow_videogifs") final Boolean allowGifs, @n(name = "allow_chat_post_creation") final Boolean allowChatPostCreation, @n(name = "is_chat_post_feature_enabled") final Boolean isChatPostFeatureEnabled, @n(name = "spoilers_enabled") final Boolean spoilersEnabled, @n(name = "allow_polls") final Boolean allowPolls, @n(name = "allow_predictions") final Boolean allowPredictions, @n(name = "user_is_banned") final Boolean userIsBanned, @n(name = "user_is_contributor") final Boolean userIsContributor, @n(name = "user_is_moderator") final Boolean userIsModerator, @n(name = "user_is_subscriber") final Boolean userIsSubscriber, @n(name = "user_has_favorited") final Boolean userHasFavorited, @n(name = "notification_level") final NotificationLevel notificationLevel, @n(name = "primary_color") final String primaryColorKey, @n(name = "community_icon") final String communityIconUrl, @n(name = "banner_background_image") final String bannerBackgroundImageUrl, @n(name = "mobile_banner_image") final String mobileBannerImageUrl, @n(name = "user_flair_enabled_in_sr") final Boolean userFlairEnabled, @n(name = "can_assign_user_flair") final Boolean canAssignUserFlair, @n(name = "user_sr_flair_enabled") final Boolean userSubredditFlairEnabled, @n(name = "user_flair_template_id") final String userFlairTemplateId, @n(name = "user_flair_background_color") final String userFlairBackgroundColor, @n(name = "user_flair_text_color") final String userFlairTextColor, @n(name = "user_flair_text") final String userFlairText, @n(name = "user_flair_richtext") final List<FlairRichTextItem> user_flair_richtext, @n(name = "link_flair_enabled") final Boolean postFlairEnabled, @n(name = "can_assign_link_flair") final Boolean canAssignLinkFlair, @n(name = "content_category") final String contentCategory, @n(name = "prediction_leaderboard_entry_type") final String predictionLeaderboardEntryType, @n(name = "allow_predictions_tournament") final Boolean allowPredictionsTournament, @n(name = "is_user_banned") final Boolean isUserBanned, @n(name = "rules") final List<Rule> rules, @n(name = "country_site_country") final String countrySiteCountry, @n(name = "country_site_language") final String countrySiteLanguage, @n(name = "subreddit_country_site_settings") final SubredditCountrySiteSettings subredditCountrySiteSettings, @n(name = "should_show_media_in_comments_setting") final Boolean shouldShowMediaInCommentsSetting, @n(name = "allowed_media_in_comments") final List<? extends MediaInCommentType> allowedMediaInComments, final Boolean isTitleSafe, final boolean isMyReddit, final boolean isMuted) {
        e.f((Object)id, "id");
        e.f((Object)kindWithId, "kindWithId");
        e.f((Object)displayName, "displayName");
        e.f((Object)displayNamePrefixed, "displayNamePrefixed");
        e.f((Object)publicDescription, "publicDescription");
        e.f((Object)subredditType, "subredditType");
        e.f((Object)url, "url");
        e.f((Object)rules, "rules");
        this.id = id;
        this.kindWithId = kindWithId;
        this.displayName = displayName;
        this.displayNamePrefixed = displayNamePrefixed;
        this.iconImg = iconImg;
        this.keyColor = keyColor;
        this.bannerImg = bannerImg;
        this.title = title;
        this.description = description;
        this.descriptionRtJson = descriptionRtJson;
        this.publicDescription = publicDescription;
        this.subscribers = subscribers;
        this.accountsActive = accountsActive;
        this.createdUtc = createdUtc;
        this.subredditType = subredditType;
        this.url = url;
        this.over18 = over18;
        this.wikiEnabled = wikiEnabled;
        this.whitelistStatus = whitelistStatus;
        this.newModMailEnabled = newModMailEnabled;
        this.restrictPosting = restrictPosting;
        this.quarantined = quarantined;
        this.quarantineMessage = quarantineMessage;
        this.quarantineMessageRtJson = quarantineMessageRtJson;
        this.interstitialWarningMessage = interstitialWarningMessage;
        this.interstitialWarningMessageRtJson = interstitialWarningMessageRtJson;
        this.hasBeenVisited = hasBeenVisited;
        this.submitType = submitType;
        this.allowImages = allowImages;
        this.allowVideos = allowVideos;
        this.allowGifs = allowGifs;
        this.allowChatPostCreation = allowChatPostCreation;
        this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
        this.spoilersEnabled = spoilersEnabled;
        this.allowPolls = allowPolls;
        this.allowPredictions = allowPredictions;
        this.userIsBanned = userIsBanned;
        this.userIsContributor = userIsContributor;
        this.userIsModerator = userIsModerator;
        this.userIsSubscriber = userIsSubscriber;
        this.userHasFavorited = userHasFavorited;
        this.notificationLevel = notificationLevel;
        this.primaryColorKey = primaryColorKey;
        this.communityIconUrl = communityIconUrl;
        this.bannerBackgroundImageUrl = bannerBackgroundImageUrl;
        this.mobileBannerImageUrl = mobileBannerImageUrl;
        this.userFlairEnabled = userFlairEnabled;
        this.canAssignUserFlair = canAssignUserFlair;
        this.userSubredditFlairEnabled = userSubredditFlairEnabled;
        this.userFlairTemplateId = userFlairTemplateId;
        this.userFlairBackgroundColor = userFlairBackgroundColor;
        this.userFlairTextColor = userFlairTextColor;
        this.userFlairText = userFlairText;
        this.user_flair_richtext = user_flair_richtext;
        this.postFlairEnabled = postFlairEnabled;
        this.canAssignLinkFlair = canAssignLinkFlair;
        this.contentCategory = contentCategory;
        this.predictionLeaderboardEntryType = predictionLeaderboardEntryType;
        this.allowPredictionsTournament = allowPredictionsTournament;
        this.isUserBanned = isUserBanned;
        this.rules = rules;
        this.countrySiteCountry = countrySiteCountry;
        this.countrySiteLanguage = countrySiteLanguage;
        this.subredditCountrySiteSettings = subredditCountrySiteSettings;
        this.shouldShowMediaInCommentsSetting = shouldShowMediaInCommentsSetting;
        this.allowedMediaInComments = allowedMediaInComments;
        this.isTitleSafe = isTitleSafe;
        this.isMyReddit = isMyReddit;
        this.isMuted = isMuted;
    }
    
    public Subreddit(String s, String s2, String s3, String s4, final String s5, String s6, String s7, String s8, String s9, String s10, String s11, Long value, Long value2, long currentTimeMillis, String s12, String s13, Boolean false, Boolean false2, String s14, Boolean false3, Boolean false4, Boolean false5, String s15, String s16, String s17, String s18, boolean b, String s19, Boolean false6, Boolean false7, Boolean false8, Boolean false9, Boolean false10, Boolean false11, Boolean false12, Boolean false13, Boolean false14, Boolean false15, Boolean false16, Boolean false17, Boolean false18, NotificationLevel access$getDEFAULT$cp, String s20, String s21, String s22, String s23, Boolean false19, Boolean false20, Boolean false21, String s24, String s25, String s26, String s27, List list, Boolean false22, Boolean false23, String s28, String s29, Boolean b2, Boolean b3, List instance, String s30, String s31, SubredditCountrySiteSettings subredditCountrySiteSettings, Boolean false24, List instance2, Boolean b4, boolean b5, boolean b6, final int n, final int n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n & 0x4) != 0x0) {
            s3 = "";
        }
        if ((n & 0x8) != 0x0) {
            s4 = "";
        }
        if ((n & 0x20) != 0x0) {
            s6 = "";
        }
        if ((n & 0x40) != 0x0) {
            s7 = null;
        }
        if ((n & 0x80) != 0x0) {
            s8 = null;
        }
        if ((n & 0x100) != 0x0) {
            s9 = null;
        }
        if ((n & 0x200) != 0x0) {
            s10 = null;
        }
        if ((n & 0x400) != 0x0) {
            s11 = "";
        }
        if ((n & 0x800) != 0x0) {
            value = 0L;
        }
        if ((n & 0x1000) != 0x0) {
            value2 = 0L;
        }
        if ((n & 0x2000) != 0x0) {
            currentTimeMillis = System.currentTimeMillis();
        }
        if ((n & 0x4000) != 0x0) {
            s12 = "";
        }
        if ((n & 0x8000) != 0x0) {
            s13 = "";
        }
        if ((n & 0x10000) != 0x0) {
            false = Boolean.FALSE;
        }
        if ((n & 0x20000) != 0x0) {
            false2 = Boolean.FALSE;
        }
        if ((n & 0x40000) != 0x0) {
            s14 = null;
        }
        if ((n & 0x80000) != 0x0) {
            false3 = Boolean.FALSE;
        }
        if ((n & 0x100000) != 0x0) {
            false4 = Boolean.FALSE;
        }
        if ((n & 0x200000) != 0x0) {
            false5 = Boolean.FALSE;
        }
        if ((n & 0x400000) != 0x0) {
            s15 = null;
        }
        if ((n & 0x800000) != 0x0) {
            s16 = null;
        }
        if ((n & 0x1000000) != 0x0) {
            s17 = null;
        }
        if ((n & 0x2000000) != 0x0) {
            s18 = null;
        }
        if ((n & 0x4000000) != 0x0) {
            b = false;
        }
        if ((n & 0x8000000) != 0x0) {
            s19 = null;
        }
        if ((n & 0x10000000) != 0x0) {
            false6 = Boolean.FALSE;
        }
        if ((n & 0x20000000) != 0x0) {
            false7 = Boolean.FALSE;
        }
        if ((n & 0x40000000) != 0x0) {
            false8 = Boolean.FALSE;
        }
        if ((n & Integer.MIN_VALUE) != 0x0) {
            false9 = Boolean.FALSE;
        }
        if ((n2 & 0x1) != 0x0) {
            false10 = Boolean.FALSE;
        }
        if ((n2 & 0x2) != 0x0) {
            false11 = Boolean.FALSE;
        }
        if ((n2 & 0x4) != 0x0) {
            false12 = Boolean.FALSE;
        }
        if ((n2 & 0x8) != 0x0) {
            false13 = Boolean.FALSE;
        }
        if ((n2 & 0x10) != 0x0) {
            false14 = Boolean.FALSE;
        }
        if ((n2 & 0x20) != 0x0) {
            false15 = Boolean.FALSE;
        }
        if ((n2 & 0x40) != 0x0) {
            false16 = Boolean.FALSE;
        }
        if ((n2 & 0x80) != 0x0) {
            false17 = Boolean.FALSE;
        }
        if ((n2 & 0x100) != 0x0) {
            false18 = Boolean.FALSE;
        }
        if ((n2 & 0x200) != 0x0) {
            NotificationLevel.Companion.getClass();
            access$getDEFAULT$cp = NotificationLevel.access$getDEFAULT$cp();
        }
        if ((n2 & 0x400) != 0x0) {
            s20 = null;
        }
        if ((n2 & 0x800) != 0x0) {
            s21 = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            s22 = null;
        }
        if ((n2 & 0x2000) != 0x0) {
            s23 = null;
        }
        if ((n2 & 0x4000) != 0x0) {
            false19 = Boolean.FALSE;
        }
        if ((n2 & 0x8000) != 0x0) {
            false20 = Boolean.FALSE;
        }
        if ((0x10000 & n2) != 0x0) {
            false21 = Boolean.FALSE;
        }
        if ((n2 & 0x20000) != 0x0) {
            s24 = null;
        }
        if ((n2 & 0x40000) != 0x0) {
            s25 = null;
        }
        if ((0x80000 & n2) != 0x0) {
            s26 = null;
        }
        if ((0x100000 & n2) != 0x0) {
            s27 = null;
        }
        if ((0x200000 & n2) != 0x0) {
            list = null;
        }
        if ((0x400000 & n2) != 0x0) {
            false22 = Boolean.FALSE;
        }
        if ((0x800000 & n2) != 0x0) {
            false23 = Boolean.FALSE;
        }
        if ((0x1000000 & n2) != 0x0) {
            s28 = null;
        }
        if ((0x2000000 & n2) != 0x0) {
            s29 = null;
        }
        if ((0x4000000 & n2) != 0x0) {
            b2 = null;
        }
        if ((0x8000000 & n2) != 0x0) {
            b3 = null;
        }
        if ((0x10000000 & n2) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((0x20000000 & n2) != 0x0) {
            s30 = null;
        }
        if ((0x40000000 & n2) != 0x0) {
            s31 = null;
        }
        if ((n2 & Integer.MIN_VALUE) != 0x0) {
            subredditCountrySiteSettings = null;
        }
        if ((n3 & 0x1) != 0x0) {
            false24 = Boolean.FALSE;
        }
        if ((n3 & 0x2) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        if ((n3 & 0x4) != 0x0) {
            b4 = null;
        }
        if ((n3 & 0x8) != 0x0) {
            b5 = false;
        }
        if ((n3 & 0x10) != 0x0) {
            b6 = false;
        }
        this(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, value, value2, currentTimeMillis, s12, s13, false, false2, s14, false3, false4, false5, s15, s16, s17, s18, b, s19, false6, false7, false8, false9, false10, false11, false12, false13, false14, false15, false16, false17, false18, access$getDEFAULT$cp, s20, s21, s22, s23, false19, false20, false21, s24, s25, s26, s27, list, false22, false23, s28, s29, b2, b3, (List<Rule>)instance, s30, s31, subredditCountrySiteSettings, false24, (List<? extends MediaInCommentType>)instance2, b4, b5, b6);
    }
    
    public static Subreddit copy$default(final Subreddit subreddit, String id, String kindWithId, String displayName, String displayNamePrefixed, String iconImg, String keyColor, String bannerImg, String title, String description, String descriptionRtJson, String publicDescription, Long subscribers, Long accountsActive, long createdUtc, String subredditType, String url, Boolean over18, Boolean wikiEnabled, String whitelistStatus, Boolean newModMailEnabled, Boolean restrictPosting, Boolean quarantined, String quarantineMessage, String quarantineMessageRtJson, String interstitialWarningMessage, String interstitialWarningMessageRtJson, boolean hasBeenVisited, String submitType, Boolean allowImages, Boolean allowVideos, Boolean allowGifs, Boolean allowChatPostCreation, Boolean isChatPostFeatureEnabled, Boolean spoilersEnabled, Boolean allowPolls, Boolean allowPredictions, Boolean userIsBanned, Boolean userIsContributor, Boolean userIsModerator, Boolean userIsSubscriber, Boolean userHasFavorited, NotificationLevel notificationLevel, String primaryColorKey, String communityIconUrl, String bannerBackgroundImageUrl, String mobileBannerImageUrl, Boolean userFlairEnabled, Boolean canAssignUserFlair, Boolean userSubredditFlairEnabled, String userFlairTemplateId, String userFlairBackgroundColor, String userFlairTextColor, String userFlairText, List user_flair_richtext, Boolean postFlairEnabled, Boolean canAssignLinkFlair, String contentCategory, String predictionLeaderboardEntryType, Boolean allowPredictionsTournament, Boolean isUserBanned, List rules, String countrySiteCountry, String countrySiteLanguage, SubredditCountrySiteSettings subredditCountrySiteSettings, Boolean shouldShowMediaInCommentsSetting, List allowedMediaInComments, Boolean isTitleSafe, boolean isMyReddit, boolean isMuted, final int n, final int n2, final int n3, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = subreddit.id;
        }
        if ((n & 0x2) != 0x0) {
            kindWithId = subreddit.getKindWithId();
        }
        if ((n & 0x4) != 0x0) {
            displayName = subreddit.displayName;
        }
        if ((n & 0x8) != 0x0) {
            displayNamePrefixed = subreddit.displayNamePrefixed;
        }
        if ((n & 0x10) != 0x0) {
            iconImg = subreddit.iconImg;
        }
        if ((n & 0x20) != 0x0) {
            keyColor = subreddit.keyColor;
        }
        if ((n & 0x40) != 0x0) {
            bannerImg = subreddit.bannerImg;
        }
        if ((n & 0x80) != 0x0) {
            title = subreddit.title;
        }
        if ((n & 0x100) != 0x0) {
            description = subreddit.description;
        }
        if ((n & 0x200) != 0x0) {
            descriptionRtJson = subreddit.descriptionRtJson;
        }
        if ((n & 0x400) != 0x0) {
            publicDescription = subreddit.publicDescription;
        }
        if ((n & 0x800) != 0x0) {
            subscribers = subreddit.subscribers;
        }
        if ((n & 0x1000) != 0x0) {
            accountsActive = subreddit.accountsActive;
        }
        if ((n & 0x2000) != 0x0) {
            createdUtc = subreddit.createdUtc;
        }
        if ((n & 0x4000) != 0x0) {
            subredditType = subreddit.subredditType;
        }
        if ((n & 0x8000) != 0x0) {
            url = subreddit.url;
        }
        if ((n & 0x10000) != 0x0) {
            over18 = subreddit.over18;
        }
        if ((n & 0x20000) != 0x0) {
            wikiEnabled = subreddit.wikiEnabled;
        }
        if ((n & 0x40000) != 0x0) {
            whitelistStatus = subreddit.whitelistStatus;
        }
        if ((n & 0x80000) != 0x0) {
            newModMailEnabled = subreddit.newModMailEnabled;
        }
        if ((n & 0x100000) != 0x0) {
            restrictPosting = subreddit.restrictPosting;
        }
        if ((n & 0x200000) != 0x0) {
            quarantined = subreddit.quarantined;
        }
        if ((n & 0x400000) != 0x0) {
            quarantineMessage = subreddit.quarantineMessage;
        }
        if ((n & 0x800000) != 0x0) {
            quarantineMessageRtJson = subreddit.quarantineMessageRtJson;
        }
        if ((n & 0x1000000) != 0x0) {
            interstitialWarningMessage = subreddit.interstitialWarningMessage;
        }
        if ((n & 0x2000000) != 0x0) {
            interstitialWarningMessageRtJson = subreddit.interstitialWarningMessageRtJson;
        }
        if ((n & 0x4000000) != 0x0) {
            hasBeenVisited = subreddit.hasBeenVisited;
        }
        if ((n & 0x8000000) != 0x0) {
            submitType = subreddit.submitType;
        }
        if ((n & 0x10000000) != 0x0) {
            allowImages = subreddit.allowImages;
        }
        if ((n & 0x20000000) != 0x0) {
            allowVideos = subreddit.allowVideos;
        }
        if ((n & 0x40000000) != 0x0) {
            allowGifs = subreddit.allowGifs;
        }
        if ((n & Integer.MIN_VALUE) != 0x0) {
            allowChatPostCreation = subreddit.allowChatPostCreation;
        }
        if ((n2 & 0x1) != 0x0) {
            isChatPostFeatureEnabled = subreddit.isChatPostFeatureEnabled;
        }
        if ((n2 & 0x2) != 0x0) {
            spoilersEnabled = subreddit.spoilersEnabled;
        }
        if ((n2 & 0x4) != 0x0) {
            allowPolls = subreddit.allowPolls;
        }
        if ((n2 & 0x8) != 0x0) {
            allowPredictions = subreddit.allowPredictions;
        }
        if ((n2 & 0x10) != 0x0) {
            userIsBanned = subreddit.userIsBanned;
        }
        if ((n2 & 0x20) != 0x0) {
            userIsContributor = subreddit.userIsContributor;
        }
        if ((n2 & 0x40) != 0x0) {
            userIsModerator = subreddit.userIsModerator;
        }
        if ((n2 & 0x80) != 0x0) {
            userIsSubscriber = subreddit.userIsSubscriber;
        }
        if ((n2 & 0x100) != 0x0) {
            userHasFavorited = subreddit.userHasFavorited;
        }
        if ((n2 & 0x200) != 0x0) {
            notificationLevel = subreddit.notificationLevel;
        }
        if ((n2 & 0x400) != 0x0) {
            primaryColorKey = subreddit.primaryColorKey;
        }
        if ((n2 & 0x800) != 0x0) {
            communityIconUrl = subreddit.communityIconUrl;
        }
        if ((n2 & 0x1000) != 0x0) {
            bannerBackgroundImageUrl = subreddit.bannerBackgroundImageUrl;
        }
        if ((n2 & 0x2000) != 0x0) {
            mobileBannerImageUrl = subreddit.mobileBannerImageUrl;
        }
        if ((n2 & 0x4000) != 0x0) {
            userFlairEnabled = subreddit.userFlairEnabled;
        }
        if ((n2 & 0x8000) != 0x0) {
            canAssignUserFlair = subreddit.canAssignUserFlair;
        }
        if ((n2 & 0x10000) != 0x0) {
            userSubredditFlairEnabled = subreddit.userSubredditFlairEnabled;
        }
        if ((n2 & 0x20000) != 0x0) {
            userFlairTemplateId = subreddit.userFlairTemplateId;
        }
        if ((n2 & 0x40000) != 0x0) {
            userFlairBackgroundColor = subreddit.userFlairBackgroundColor;
        }
        if ((n2 & 0x80000) != 0x0) {
            userFlairTextColor = subreddit.userFlairTextColor;
        }
        if ((n2 & 0x100000) != 0x0) {
            userFlairText = subreddit.userFlairText;
        }
        if ((n2 & 0x200000) != 0x0) {
            user_flair_richtext = subreddit.user_flair_richtext;
        }
        if ((n2 & 0x400000) != 0x0) {
            postFlairEnabled = subreddit.postFlairEnabled;
        }
        if ((n2 & 0x800000) != 0x0) {
            canAssignLinkFlair = subreddit.canAssignLinkFlair;
        }
        if ((n2 & 0x1000000) != 0x0) {
            contentCategory = subreddit.contentCategory;
        }
        if ((n2 & 0x2000000) != 0x0) {
            predictionLeaderboardEntryType = subreddit.predictionLeaderboardEntryType;
        }
        if ((n2 & 0x4000000) != 0x0) {
            allowPredictionsTournament = subreddit.allowPredictionsTournament;
        }
        if ((n2 & 0x8000000) != 0x0) {
            isUserBanned = subreddit.isUserBanned;
        }
        if ((n2 & 0x10000000) != 0x0) {
            rules = subreddit.rules;
        }
        if ((n2 & 0x20000000) != 0x0) {
            countrySiteCountry = subreddit.countrySiteCountry;
        }
        if ((n2 & 0x40000000) != 0x0) {
            countrySiteLanguage = subreddit.countrySiteLanguage;
        }
        if ((n2 & Integer.MIN_VALUE) != 0x0) {
            subredditCountrySiteSettings = subreddit.subredditCountrySiteSettings;
        }
        if ((n3 & 0x1) != 0x0) {
            shouldShowMediaInCommentsSetting = subreddit.shouldShowMediaInCommentsSetting;
        }
        if ((n3 & 0x2) != 0x0) {
            allowedMediaInComments = subreddit.allowedMediaInComments;
        }
        if ((n3 & 0x4) != 0x0) {
            isTitleSafe = subreddit.isTitleSafe;
        }
        if ((n3 & 0x8) != 0x0) {
            isMyReddit = subreddit.isMyReddit;
        }
        if ((n3 & 0x10) != 0x0) {
            isMuted = subreddit.isMuted;
        }
        return subreddit.copy(id, kindWithId, displayName, displayNamePrefixed, iconImg, keyColor, bannerImg, title, description, descriptionRtJson, publicDescription, subscribers, accountsActive, createdUtc, subredditType, url, over18, wikiEnabled, whitelistStatus, newModMailEnabled, restrictPosting, quarantined, quarantineMessage, quarantineMessageRtJson, interstitialWarningMessage, interstitialWarningMessageRtJson, hasBeenVisited, submitType, allowImages, allowVideos, allowGifs, allowChatPostCreation, isChatPostFeatureEnabled, spoilersEnabled, allowPolls, allowPredictions, userIsBanned, userIsContributor, userIsModerator, userIsSubscriber, userHasFavorited, notificationLevel, primaryColorKey, communityIconUrl, bannerBackgroundImageUrl, mobileBannerImageUrl, userFlairEnabled, canAssignUserFlair, userSubredditFlairEnabled, userFlairTemplateId, userFlairBackgroundColor, userFlairTextColor, userFlairText, user_flair_richtext, postFlairEnabled, canAssignLinkFlair, contentCategory, predictionLeaderboardEntryType, allowPredictionsTournament, isUserBanned, rules, countrySiteCountry, countrySiteLanguage, subredditCountrySiteSettings, shouldShowMediaInCommentsSetting, allowedMediaInComments, isTitleSafe, isMyReddit, isMuted);
    }
    
    public static void getNewModMailEnabled$annotations() {
    }
    
    private final PostPermission getPostVideoPermission(final boolean b, final l l) {
        if (b && e.a((Object)this.allowVideos, (Object)Boolean.TRUE)) {
            return PostPermission.ENABLED;
        }
        if (l != null && (l.k.contains(PowerupsBenefit.HD_VIDEO) || l.k.contains(PowerupsBenefit.SD_VIDEO)) && !l.j.contains(PowerupsBenefit.SD_VIDEO)) {
            return PostPermission.LOCKED;
        }
        return PostPermission.DISABLED;
    }
    
    public static void getStructuredStyle$annotations() {
    }
    
    public final boolean canUserPost(final m m) {
        final boolean public1 = this.isPublic();
        final boolean b = true;
        boolean b2;
        if (public1) {
            b2 = b;
        }
        else {
            if (!this.isArchived()) {
                if (this.isPrivate()) {
                    final Boolean userIsModerator = this.userIsModerator;
                    final boolean b3 = userIsModerator != null && userIsModerator;
                    b2 = b;
                    if (b3) {
                        return b2;
                    }
                    final Boolean userIsContributor = this.userIsContributor;
                    if (userIsContributor != null && userIsContributor) {
                        b2 = b;
                        return b2;
                    }
                }
                else if (this.isEmployeeOnly()) {
                    final Boolean userIsModerator2 = this.userIsModerator;
                    final boolean b4 = userIsModerator2 != null && userIsModerator2;
                    b2 = b;
                    if (b4) {
                        return b2;
                    }
                    final Boolean userIsContributor2 = this.userIsContributor;
                    final boolean b5 = userIsContributor2 != null && userIsContributor2;
                    b2 = b;
                    if (b5) {
                        return b2;
                    }
                    if (m != null && m.isEmployee()) {
                        b2 = b;
                        return b2;
                    }
                }
                else if (this.isRestricted()) {
                    final Boolean userIsModerator3 = this.userIsModerator;
                    final boolean b6 = userIsModerator3 != null && userIsModerator3;
                    b2 = b;
                    if (b6) {
                        return b2;
                    }
                    final Boolean userIsContributor3 = this.userIsContributor;
                    final boolean b7 = userIsContributor3 != null && userIsContributor3;
                    b2 = b;
                    if (b7) {
                        return b2;
                    }
                    final Boolean restrictPosting = this.restrictPosting;
                    if (restrictPosting != null && !restrictPosting) {
                        b2 = b;
                        return b2;
                    }
                }
                else if (!this.isPremium() && !this.isGoldRestricted()) {
                    if (this.isUser()) {
                        final String id = this.id;
                        String id2;
                        if (m != null) {
                            id2 = ((jw1.b)m).getId();
                        }
                        else {
                            id2 = null;
                        }
                        b2 = e.a((Object)id, (Object)id2);
                        return b2;
                    }
                }
                else if (m != null) {
                    b2 = m.getHasPremium();
                    return b2;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component10() {
        return this.descriptionRtJson;
    }
    
    public final String component11() {
        return this.publicDescription;
    }
    
    public final Long component12() {
        return this.subscribers;
    }
    
    public final Long component13() {
        return this.accountsActive;
    }
    
    public final long component14() {
        return this.createdUtc;
    }
    
    public final String component15() {
        return this.subredditType;
    }
    
    public final String component16() {
        return this.url;
    }
    
    public final Boolean component17() {
        return this.over18;
    }
    
    public final Boolean component18() {
        return this.wikiEnabled;
    }
    
    public final String component19() {
        return this.whitelistStatus;
    }
    
    public final String component2() {
        return this.getKindWithId();
    }
    
    public final Boolean component20() {
        return this.newModMailEnabled;
    }
    
    public final Boolean component21() {
        return this.restrictPosting;
    }
    
    public final Boolean component22() {
        return this.quarantined;
    }
    
    public final String component23() {
        return this.quarantineMessage;
    }
    
    public final String component24() {
        return this.quarantineMessageRtJson;
    }
    
    public final String component25() {
        return this.interstitialWarningMessage;
    }
    
    public final String component26() {
        return this.interstitialWarningMessageRtJson;
    }
    
    public final boolean component27() {
        return this.hasBeenVisited;
    }
    
    public final String component28() {
        return this.submitType;
    }
    
    public final Boolean component29() {
        return this.allowImages;
    }
    
    public final String component3() {
        return this.displayName;
    }
    
    public final Boolean component30() {
        return this.allowVideos;
    }
    
    public final Boolean component31() {
        return this.allowGifs;
    }
    
    public final Boolean component32() {
        return this.allowChatPostCreation;
    }
    
    public final Boolean component33() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final Boolean component34() {
        return this.spoilersEnabled;
    }
    
    public final Boolean component35() {
        return this.allowPolls;
    }
    
    public final Boolean component36() {
        return this.allowPredictions;
    }
    
    public final Boolean component37() {
        return this.userIsBanned;
    }
    
    public final Boolean component38() {
        return this.userIsContributor;
    }
    
    public final Boolean component39() {
        return this.userIsModerator;
    }
    
    public final String component4() {
        return this.displayNamePrefixed;
    }
    
    public final Boolean component40() {
        return this.userIsSubscriber;
    }
    
    public final Boolean component41() {
        return this.userHasFavorited;
    }
    
    public final NotificationLevel component42() {
        return this.notificationLevel;
    }
    
    public final String component43() {
        return this.primaryColorKey;
    }
    
    public final String component44() {
        return this.communityIconUrl;
    }
    
    public final String component45() {
        return this.bannerBackgroundImageUrl;
    }
    
    public final String component46() {
        return this.mobileBannerImageUrl;
    }
    
    public final Boolean component47() {
        return this.userFlairEnabled;
    }
    
    public final Boolean component48() {
        return this.canAssignUserFlair;
    }
    
    public final Boolean component49() {
        return this.userSubredditFlairEnabled;
    }
    
    public final String component5() {
        return this.iconImg;
    }
    
    public final String component50() {
        return this.userFlairTemplateId;
    }
    
    public final String component51() {
        return this.userFlairBackgroundColor;
    }
    
    public final String component52() {
        return this.userFlairTextColor;
    }
    
    public final String component53() {
        return this.userFlairText;
    }
    
    public final List<FlairRichTextItem> component54() {
        return this.user_flair_richtext;
    }
    
    public final Boolean component55() {
        return this.postFlairEnabled;
    }
    
    public final Boolean component56() {
        return this.canAssignLinkFlair;
    }
    
    public final String component57() {
        return this.contentCategory;
    }
    
    public final String component58() {
        return this.predictionLeaderboardEntryType;
    }
    
    public final Boolean component59() {
        return this.allowPredictionsTournament;
    }
    
    public final String component6() {
        return this.keyColor;
    }
    
    public final Boolean component60() {
        return this.isUserBanned;
    }
    
    public final List<Rule> component61() {
        return this.rules;
    }
    
    public final String component62() {
        return this.countrySiteCountry;
    }
    
    public final String component63() {
        return this.countrySiteLanguage;
    }
    
    public final SubredditCountrySiteSettings component64() {
        return this.subredditCountrySiteSettings;
    }
    
    public final Boolean component65() {
        return this.shouldShowMediaInCommentsSetting;
    }
    
    public final List<MediaInCommentType> component66() {
        return (List<MediaInCommentType>)this.allowedMediaInComments;
    }
    
    public final Boolean component67() {
        return this.isTitleSafe;
    }
    
    public final boolean component68() {
        return this.isMyReddit;
    }
    
    public final boolean component69() {
        return this.isMuted;
    }
    
    public final String component7() {
        return this.bannerImg;
    }
    
    public final String component8() {
        return this.title;
    }
    
    public final String component9() {
        return this.description;
    }
    
    public final Subreddit copy(@n(name = "id") final String s, @n(name = "name") final String s2, @n(name = "display_name") final String s3, @n(name = "display_name_prefixed") final String s4, @n(name = "icon_img") final String s5, @n(name = "key_color") final String s6, @n(name = "banner_img") final String s7, final String s8, final String s9, final String s10, @n(name = "public_description") final String s11, final Long n, @n(name = "accounts_active") final Long n2, @n(name = "created_utc") final long n3, @n(name = "subreddit_type") final String s12, final String s13, final Boolean b, @n(name = "wiki_enabled") final Boolean b2, @n(name = "whitelist_status") final String s14, @n(name = "is_enrolled_in_new_modmail") final Boolean b3, @n(name = "restrict_posting") final Boolean b4, @n(name = "quarantine") final Boolean b5, @n(name = "quarantine_message") final String s15, final String s16, @n(name = "interstitial_warning_message_html") final String s17, final String s18, final boolean b6, @n(name = "submission_type") final String s19, @n(name = "allow_images") final Boolean b7, @n(name = "allow_videos") final Boolean b8, @n(name = "allow_videogifs") final Boolean b9, @n(name = "allow_chat_post_creation") final Boolean b10, @n(name = "is_chat_post_feature_enabled") final Boolean b11, @n(name = "spoilers_enabled") final Boolean b12, @n(name = "allow_polls") final Boolean b13, @n(name = "allow_predictions") final Boolean b14, @n(name = "user_is_banned") final Boolean b15, @n(name = "user_is_contributor") final Boolean b16, @n(name = "user_is_moderator") final Boolean b17, @n(name = "user_is_subscriber") final Boolean b18, @n(name = "user_has_favorited") final Boolean b19, @n(name = "notification_level") final NotificationLevel notificationLevel, @n(name = "primary_color") final String s20, @n(name = "community_icon") final String s21, @n(name = "banner_background_image") final String s22, @n(name = "mobile_banner_image") final String s23, @n(name = "user_flair_enabled_in_sr") final Boolean b20, @n(name = "can_assign_user_flair") final Boolean b21, @n(name = "user_sr_flair_enabled") final Boolean b22, @n(name = "user_flair_template_id") final String s24, @n(name = "user_flair_background_color") final String s25, @n(name = "user_flair_text_color") final String s26, @n(name = "user_flair_text") final String s27, @n(name = "user_flair_richtext") final List<FlairRichTextItem> list, @n(name = "link_flair_enabled") final Boolean b23, @n(name = "can_assign_link_flair") final Boolean b24, @n(name = "content_category") final String s28, @n(name = "prediction_leaderboard_entry_type") final String s29, @n(name = "allow_predictions_tournament") final Boolean b25, @n(name = "is_user_banned") final Boolean b26, @n(name = "rules") final List<Rule> list2, @n(name = "country_site_country") final String s30, @n(name = "country_site_language") final String s31, @n(name = "subreddit_country_site_settings") final SubredditCountrySiteSettings subredditCountrySiteSettings, @n(name = "should_show_media_in_comments_setting") final Boolean b27, @n(name = "allowed_media_in_comments") final List<? extends MediaInCommentType> list3, final Boolean b28, final boolean b29, final boolean b30) {
        e.f((Object)s, "id");
        e.f((Object)s2, "kindWithId");
        e.f((Object)s3, "displayName");
        e.f((Object)s4, "displayNamePrefixed");
        e.f((Object)s11, "publicDescription");
        e.f((Object)s12, "subredditType");
        e.f((Object)s13, "url");
        e.f((Object)list2, "rules");
        return new Subreddit(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, n, n2, n3, s12, s13, b, b2, s14, b3, b4, b5, s15, s16, s17, s18, b6, s19, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, notificationLevel, s20, s21, s22, s23, b20, b21, b22, s24, s25, s26, s27, list, b23, b24, s28, s29, b25, b26, list2, s30, s31, subredditCountrySiteSettings, b27, list3, b28, b29, b30);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Subreddit)) {
            return false;
        }
        final Subreddit subreddit = (Subreddit)o;
        return e.a((Object)this.id, (Object)subreddit.id) && e.a((Object)this.getKindWithId(), (Object)subreddit.getKindWithId()) && e.a((Object)this.displayName, (Object)subreddit.displayName) && e.a((Object)this.displayNamePrefixed, (Object)subreddit.displayNamePrefixed) && e.a((Object)this.iconImg, (Object)subreddit.iconImg) && e.a((Object)this.keyColor, (Object)subreddit.keyColor) && e.a((Object)this.bannerImg, (Object)subreddit.bannerImg) && e.a((Object)this.title, (Object)subreddit.title) && e.a((Object)this.description, (Object)subreddit.description) && e.a((Object)this.descriptionRtJson, (Object)subreddit.descriptionRtJson) && e.a((Object)this.publicDescription, (Object)subreddit.publicDescription) && e.a((Object)this.subscribers, (Object)subreddit.subscribers) && e.a((Object)this.accountsActive, (Object)subreddit.accountsActive) && this.createdUtc == subreddit.createdUtc && e.a((Object)this.subredditType, (Object)subreddit.subredditType) && e.a((Object)this.url, (Object)subreddit.url) && e.a((Object)this.over18, (Object)subreddit.over18) && e.a((Object)this.wikiEnabled, (Object)subreddit.wikiEnabled) && e.a((Object)this.whitelistStatus, (Object)subreddit.whitelistStatus) && e.a((Object)this.newModMailEnabled, (Object)subreddit.newModMailEnabled) && e.a((Object)this.restrictPosting, (Object)subreddit.restrictPosting) && e.a((Object)this.quarantined, (Object)subreddit.quarantined) && e.a((Object)this.quarantineMessage, (Object)subreddit.quarantineMessage) && e.a((Object)this.quarantineMessageRtJson, (Object)subreddit.quarantineMessageRtJson) && e.a((Object)this.interstitialWarningMessage, (Object)subreddit.interstitialWarningMessage) && e.a((Object)this.interstitialWarningMessageRtJson, (Object)subreddit.interstitialWarningMessageRtJson) && this.hasBeenVisited == subreddit.hasBeenVisited && e.a((Object)this.submitType, (Object)subreddit.submitType) && e.a((Object)this.allowImages, (Object)subreddit.allowImages) && e.a((Object)this.allowVideos, (Object)subreddit.allowVideos) && e.a((Object)this.allowGifs, (Object)subreddit.allowGifs) && e.a((Object)this.allowChatPostCreation, (Object)subreddit.allowChatPostCreation) && e.a((Object)this.isChatPostFeatureEnabled, (Object)subreddit.isChatPostFeatureEnabled) && e.a((Object)this.spoilersEnabled, (Object)subreddit.spoilersEnabled) && e.a((Object)this.allowPolls, (Object)subreddit.allowPolls) && e.a((Object)this.allowPredictions, (Object)subreddit.allowPredictions) && e.a((Object)this.userIsBanned, (Object)subreddit.userIsBanned) && e.a((Object)this.userIsContributor, (Object)subreddit.userIsContributor) && e.a((Object)this.userIsModerator, (Object)subreddit.userIsModerator) && e.a((Object)this.userIsSubscriber, (Object)subreddit.userIsSubscriber) && e.a((Object)this.userHasFavorited, (Object)subreddit.userHasFavorited) && this.notificationLevel == subreddit.notificationLevel && e.a((Object)this.primaryColorKey, (Object)subreddit.primaryColorKey) && e.a((Object)this.communityIconUrl, (Object)subreddit.communityIconUrl) && e.a((Object)this.bannerBackgroundImageUrl, (Object)subreddit.bannerBackgroundImageUrl) && e.a((Object)this.mobileBannerImageUrl, (Object)subreddit.mobileBannerImageUrl) && e.a((Object)this.userFlairEnabled, (Object)subreddit.userFlairEnabled) && e.a((Object)this.canAssignUserFlair, (Object)subreddit.canAssignUserFlair) && e.a((Object)this.userSubredditFlairEnabled, (Object)subreddit.userSubredditFlairEnabled) && e.a((Object)this.userFlairTemplateId, (Object)subreddit.userFlairTemplateId) && e.a((Object)this.userFlairBackgroundColor, (Object)subreddit.userFlairBackgroundColor) && e.a((Object)this.userFlairTextColor, (Object)subreddit.userFlairTextColor) && e.a((Object)this.userFlairText, (Object)subreddit.userFlairText) && e.a((Object)this.user_flair_richtext, (Object)subreddit.user_flair_richtext) && e.a((Object)this.postFlairEnabled, (Object)subreddit.postFlairEnabled) && e.a((Object)this.canAssignLinkFlair, (Object)subreddit.canAssignLinkFlair) && e.a((Object)this.contentCategory, (Object)subreddit.contentCategory) && e.a((Object)this.predictionLeaderboardEntryType, (Object)subreddit.predictionLeaderboardEntryType) && e.a((Object)this.allowPredictionsTournament, (Object)subreddit.allowPredictionsTournament) && e.a((Object)this.isUserBanned, (Object)subreddit.isUserBanned) && e.a((Object)this.rules, (Object)subreddit.rules) && e.a((Object)this.countrySiteCountry, (Object)subreddit.countrySiteCountry) && e.a((Object)this.countrySiteLanguage, (Object)subreddit.countrySiteLanguage) && e.a((Object)this.subredditCountrySiteSettings, (Object)subreddit.subredditCountrySiteSettings) && e.a((Object)this.shouldShowMediaInCommentsSetting, (Object)subreddit.shouldShowMediaInCommentsSetting) && e.a((Object)this.allowedMediaInComments, (Object)subreddit.allowedMediaInComments) && e.a((Object)this.isTitleSafe, (Object)subreddit.isTitleSafe) && this.isMyReddit == subreddit.isMyReddit && this.isMuted == subreddit.isMuted;
    }
    
    public final Long getAccountsActive() {
        return this.accountsActive;
    }
    
    public final Boolean getAllowChatPostCreation() {
        return this.allowChatPostCreation;
    }
    
    public final Boolean getAllowGifs() {
        return this.allowGifs;
    }
    
    public final Boolean getAllowImages() {
        return this.allowImages;
    }
    
    public final Boolean getAllowPolls() {
        return this.allowPolls;
    }
    
    public final Boolean getAllowPredictions() {
        return this.allowPredictions;
    }
    
    public final Boolean getAllowPredictionsTournament() {
        return this.allowPredictionsTournament;
    }
    
    public final Boolean getAllowVideos() {
        return this.allowVideos;
    }
    
    public final List<MediaInCommentType> getAllowedMediaInComments() {
        return (List<MediaInCommentType>)this.allowedMediaInComments;
    }
    
    public final String getBannerBackgroundColor() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        if (structuredStyle != null) {
            final Style style = structuredStyle.getStyle();
            final String s;
            if (style != null && (s = style.getBannerBackgroundKeyColor()) != null) {
                return s;
            }
        }
        return this.getPrimaryColor();
    }
    
    public final String getBannerBackgroundImage() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        final String s = null;
        String mobileBannerImage = null;
        Label_0033: {
            if (structuredStyle != null) {
                final Style style = structuredStyle.getStyle();
                if (style != null) {
                    mobileBannerImage = style.getMobileBannerImage();
                    break Label_0033;
                }
            }
            mobileBannerImage = null;
        }
        final int n = 0;
        if (mobileBannerImage == null || mobileBannerImage.length() == 0 || e.a((Object)mobileBannerImage, (Object)"https://www.redditstatic.com/image-processing.png")) {
            mobileBannerImage = null;
        }
        String bannerImg = mobileBannerImage;
        if (mobileBannerImage == null) {
            String mobileBannerImageUrl = this.mobileBannerImageUrl;
            if (mobileBannerImageUrl == null || mobileBannerImageUrl.length() == 0 || e.a((Object)mobileBannerImageUrl, (Object)"https://www.redditstatic.com/image-processing.png")) {
                mobileBannerImageUrl = null;
            }
            bannerImg = mobileBannerImageUrl;
            if (mobileBannerImageUrl == null) {
                final StructuredStyle structuredStyle2 = this.structuredStyle;
                String bannerBackgroundImage = null;
                Label_0201: {
                    if (structuredStyle2 != null) {
                        final Style style2 = structuredStyle2.getStyle();
                        if (style2 != null) {
                            bannerBackgroundImage = style2.getBannerBackgroundImage();
                            break Label_0201;
                        }
                    }
                    bannerBackgroundImage = null;
                }
                if (bannerBackgroundImage == null || bannerBackgroundImage.length() == 0 || e.a((Object)bannerBackgroundImage, (Object)"https://www.redditstatic.com/image-processing.png")) {
                    bannerBackgroundImage = null;
                }
                bannerImg = bannerBackgroundImage;
                if (bannerBackgroundImage == null) {
                    final String bannerBackgroundImageUrl = this.bannerBackgroundImageUrl;
                    int n2 = 0;
                    Label_0291: {
                        if (bannerBackgroundImageUrl != null) {
                            n2 = n;
                            if (bannerBackgroundImageUrl.length() != 0) {
                                break Label_0291;
                            }
                        }
                        n2 = 1;
                    }
                    bannerImg = s;
                    if ((n2 ^ 0x1) != 0x0) {
                        bannerImg = bannerBackgroundImageUrl;
                    }
                    if (bannerImg == null) {
                        bannerImg = this.bannerImg;
                    }
                }
            }
        }
        return bannerImg;
    }
    
    public final String getBannerBackgroundImageUrl() {
        return this.bannerBackgroundImageUrl;
    }
    
    public final String getBannerImg() {
        return this.bannerImg;
    }
    
    public final Boolean getCanAssignLinkFlair() {
        return this.canAssignLinkFlair;
    }
    
    public final Boolean getCanAssignUserFlair() {
        return this.canAssignUserFlair;
    }
    
    public final String getCommunityIcon() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        final String s = null;
        String communityIcon = null;
        Label_0031: {
            if (structuredStyle != null) {
                final Style style = structuredStyle.getStyle();
                if (style != null) {
                    communityIcon = style.getCommunityIcon();
                    break Label_0031;
                }
            }
            communityIcon = null;
        }
        final int n = 0;
        if (communityIcon == null || communityIcon.length() == 0 || e.a((Object)communityIcon, (Object)"https://www.redditstatic.com/image-processing.png")) {
            communityIcon = null;
        }
        String iconImg = communityIcon;
        if (communityIcon == null) {
            final String communityIconUrl = this.communityIconUrl;
            int n2 = 0;
            Label_0118: {
                if (communityIconUrl != null) {
                    n2 = n;
                    if (communityIconUrl.length() != 0) {
                        break Label_0118;
                    }
                }
                n2 = 1;
            }
            String s2 = s;
            if ((n2 ^ 0x1) != 0x0) {
                s2 = communityIconUrl;
            }
            if (s2 == null) {
                iconImg = this.iconImg;
            }
            else {
                iconImg = s2;
            }
        }
        return iconImg;
    }
    
    public final String getCommunityIconUrl() {
        return this.communityIconUrl;
    }
    
    public final String getContentCategory() {
        return this.contentCategory;
    }
    
    public final String getCountrySiteCountry() {
        return this.countrySiteCountry;
    }
    
    public final String getCountrySiteLanguage() {
        return this.countrySiteLanguage;
    }
    
    public final long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getDescriptionRtJson() {
        return this.descriptionRtJson;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getDisplayNamePrefixed() {
        return this.displayNamePrefixed;
    }
    
    public final boolean getHasBeenVisited() {
        return this.hasBeenVisited;
    }
    
    public final boolean getHasRules() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        if (structuredStyle != null) {
            final Map widgets = structuredStyle.getWidgets();
            if (widgets != null) {
                final Set entrySet = widgets.entrySet();
                if (entrySet != null) {
                    final ArrayList list = new ArrayList(dg2.m.u4((Iterable)entrySet, 10));
                    final Iterator iterator = entrySet.iterator();
                    while (iterator.hasNext()) {
                        list.add((Object)((Map.Entry<K, BaseWidget>)iterator.next()).getValue());
                    }
                    final ArrayList list2 = new ArrayList();
                    for (final Object next : list) {
                        if (next instanceof RuleWidget) {
                            list2.add(next);
                        }
                    }
                    final RuleWidget ruleWidget = (RuleWidget)CollectionsKt___CollectionsKt.U4((List)list2);
                    if (ruleWidget != null) {
                        final List data = ruleWidget.getData();
                        if (data != null) {
                            return data.isEmpty() ^ true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final String getIconImg() {
        return this.iconImg;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getInterstitialWarningMessage() {
        return this.interstitialWarningMessage;
    }
    
    public final String getInterstitialWarningMessageRtJson() {
        return this.interstitialWarningMessageRtJson;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    @Override
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public final String getMobileBannerImageUrl() {
        return this.mobileBannerImageUrl;
    }
    
    public final Boolean getNewModMailEnabled() {
        return this.newModMailEnabled;
    }
    
    public final NotificationLevel getNotificationLevel() {
        return this.notificationLevel;
    }
    
    public final Boolean getOver18() {
        return this.over18;
    }
    
    public final Boolean getPostFlairEnabled() {
        return this.postFlairEnabled;
    }
    
    public final PostPermissions getPostPermissions(final l l) {
        final boolean b = e.a((Object)this.submitType, (Object)"link") || e.a((Object)this.submitType, (Object)"any");
        final Boolean allowImages = this.allowImages;
        final Boolean true = Boolean.TRUE;
        final boolean a = e.a((Object)allowImages, (Object)true);
        return new PostPermissions(b, b && a, this.getPostVideoPermission(b, l), e.a((Object)this.submitType, (Object)"self") || e.a((Object)this.submitType, (Object)"any"), e.a((Object)this.spoilersEnabled, (Object)true), e.a((Object)this.allowPolls, (Object)true), e.a((Object)this.allowPredictions, (Object)true));
    }
    
    public final String getPredictionLeaderboardEntryType() {
        return this.predictionLeaderboardEntryType;
    }
    
    public final String getPrimaryColor() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        final String s = null;
        String primaryKeyColor = null;
        Label_0033: {
            if (structuredStyle != null) {
                final Style style = structuredStyle.getStyle();
                if (style != null) {
                    primaryKeyColor = style.getPrimaryKeyColor();
                    break Label_0033;
                }
            }
            primaryKeyColor = null;
        }
        final int n = 0;
        if (!((primaryKeyColor == null || primaryKeyColor.length() == 0) ^ true)) {
            primaryKeyColor = null;
        }
        String keyColor = primaryKeyColor;
        if (primaryKeyColor == null) {
            String primaryColorKey = this.primaryColorKey;
            if (!((primaryColorKey == null || primaryColorKey.length() == 0) ^ true)) {
                primaryColorKey = null;
            }
            keyColor = primaryColorKey;
            if (primaryColorKey == null) {
                keyColor = this.keyColor;
            }
        }
        int n2 = 0;
        Label_0151: {
            if (keyColor != null) {
                n2 = n;
                if (!j.B0((CharSequence)keyColor)) {
                    break Label_0151;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            keyColor = s;
        }
        return keyColor;
    }
    
    public final String getPrimaryColorKey() {
        return this.primaryColorKey;
    }
    
    public final String getPublicDescription() {
        return this.publicDescription;
    }
    
    public final String getQuarantineMessage() {
        return this.quarantineMessage;
    }
    
    public final String getQuarantineMessageRtJson() {
        return this.quarantineMessageRtJson;
    }
    
    public final Boolean getQuarantined() {
        return this.quarantined;
    }
    
    public final Boolean getRestrictPosting() {
        return this.restrictPosting;
    }
    
    public final List<Rule> getRules() {
        return this.rules;
    }
    
    public final String getSecondaryColor() {
        final StructuredStyle structuredStyle = this.structuredStyle;
        String s = null;
        String secondaryKeyColor = null;
        Label_0030: {
            if (structuredStyle != null) {
                final Style style = structuredStyle.getStyle();
                if (style != null) {
                    secondaryKeyColor = style.getSecondaryKeyColor();
                    break Label_0030;
                }
            }
            secondaryKeyColor = null;
        }
        if (true ^ (secondaryKeyColor == null || secondaryKeyColor.length() == 0)) {
            s = secondaryKeyColor;
        }
        String primaryColor;
        if ((primaryColor = s) == null) {
            primaryColor = this.getPrimaryColor();
        }
        return primaryColor;
    }
    
    public final Boolean getShouldShowMediaInCommentsSetting() {
        return this.shouldShowMediaInCommentsSetting;
    }
    
    public final Boolean getSpoilersEnabled() {
        return this.spoilersEnabled;
    }
    
    public final StructuredStyle getStructuredStyle() {
        return this.structuredStyle;
    }
    
    public final String getSubmitType() {
        return this.submitType;
    }
    
    public final SubredditCountrySiteSettings getSubredditCountrySiteSettings() {
        return this.subredditCountrySiteSettings;
    }
    
    public final String getSubredditType() {
        return this.subredditType;
    }
    
    public final Long getSubscribers() {
        return this.subscribers;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final String getUserFlairBackgroundColor() {
        return this.userFlairBackgroundColor;
    }
    
    public final Boolean getUserFlairEnabled() {
        return this.userFlairEnabled;
    }
    
    public final String getUserFlairTemplateId() {
        return this.userFlairTemplateId;
    }
    
    public final String getUserFlairText() {
        return this.userFlairText;
    }
    
    public final String getUserFlairTextColor() {
        return this.userFlairTextColor;
    }
    
    public final Boolean getUserHasFavorited() {
        return this.userHasFavorited;
    }
    
    public final Boolean getUserIsBanned() {
        return this.userIsBanned;
    }
    
    public final Boolean getUserIsContributor() {
        return this.userIsContributor;
    }
    
    public final Boolean getUserIsModerator() {
        return this.userIsModerator;
    }
    
    public final Boolean getUserIsSubscriber() {
        return this.userIsSubscriber;
    }
    
    public final Boolean getUserSubredditFlairEnabled() {
        return this.userSubredditFlairEnabled;
    }
    
    public final List<FlairRichTextItem> getUser_flair_richtext() {
        return this.user_flair_richtext;
    }
    
    public final String getWhitelistStatus() {
        return this.whitelistStatus;
    }
    
    public final Boolean getWikiEnabled() {
        return this.wikiEnabled;
    }
    
    public final boolean hasDescriptionInfo() {
        final String descriptionRtJson = this.descriptionRtJson;
        boolean b = false;
        if (descriptionRtJson == null || descriptionRtJson.length() == 0) {
            final String description = this.description;
            if (description == null || description.length() == 0) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final boolean hasPredictionsLeaderboardEntryInFeedUnit() {
        return e.a((Object)this.predictionLeaderboardEntryType, (Object)"IN_FEED");
    }
    
    public final boolean hasPredictionsLeaderboardEntryInSubredditHeader() {
        return e.a((Object)this.predictionLeaderboardEntryType, (Object)"SUBREDDIT_HEADER");
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.displayNamePrefixed, a.e(this.displayName, (this.getKindWithId().hashCode() + this.id.hashCode() * 31) * 31, 31), 31);
        final String iconImg = this.iconImg;
        final int n = 0;
        int hashCode;
        if (iconImg == null) {
            hashCode = 0;
        }
        else {
            hashCode = iconImg.hashCode();
        }
        final String keyColor = this.keyColor;
        int hashCode2;
        if (keyColor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = keyColor.hashCode();
        }
        final String bannerImg = this.bannerImg;
        int hashCode3;
        if (bannerImg == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = bannerImg.hashCode();
        }
        final String title = this.title;
        int hashCode4;
        if (title == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = title.hashCode();
        }
        final String description = this.description;
        int hashCode5;
        if (description == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = description.hashCode();
        }
        final String descriptionRtJson = this.descriptionRtJson;
        int hashCode6;
        if (descriptionRtJson == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = descriptionRtJson.hashCode();
        }
        final int e2 = a.e(this.publicDescription, ((((((e + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31, 31);
        final Long subscribers = this.subscribers;
        int hashCode7;
        if (subscribers == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subscribers.hashCode();
        }
        final Long accountsActive = this.accountsActive;
        int hashCode8;
        if (accountsActive == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = accountsActive.hashCode();
        }
        final int e3 = a.e(this.url, a.e(this.subredditType, b.b(this.createdUtc, ((e2 + hashCode7) * 31 + hashCode8) * 31, 31), 31), 31);
        final Boolean over18 = this.over18;
        int hashCode9;
        if (over18 == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = over18.hashCode();
        }
        final Boolean wikiEnabled = this.wikiEnabled;
        int hashCode10;
        if (wikiEnabled == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = wikiEnabled.hashCode();
        }
        final String whitelistStatus = this.whitelistStatus;
        int hashCode11;
        if (whitelistStatus == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = whitelistStatus.hashCode();
        }
        final Boolean newModMailEnabled = this.newModMailEnabled;
        int hashCode12;
        if (newModMailEnabled == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = newModMailEnabled.hashCode();
        }
        final Boolean restrictPosting = this.restrictPosting;
        int hashCode13;
        if (restrictPosting == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = restrictPosting.hashCode();
        }
        final Boolean quarantined = this.quarantined;
        int hashCode14;
        if (quarantined == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = quarantined.hashCode();
        }
        final String quarantineMessage = this.quarantineMessage;
        int hashCode15;
        if (quarantineMessage == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = quarantineMessage.hashCode();
        }
        final String quarantineMessageRtJson = this.quarantineMessageRtJson;
        int hashCode16;
        if (quarantineMessageRtJson == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = quarantineMessageRtJson.hashCode();
        }
        final String interstitialWarningMessage = this.interstitialWarningMessage;
        int hashCode17;
        if (interstitialWarningMessage == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = interstitialWarningMessage.hashCode();
        }
        final String interstitialWarningMessageRtJson = this.interstitialWarningMessageRtJson;
        int hashCode18;
        if (interstitialWarningMessageRtJson == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = interstitialWarningMessageRtJson.hashCode();
        }
        final int hasBeenVisited = this.hasBeenVisited ? 1 : 0;
        final int n2 = 1;
        int n3 = hasBeenVisited;
        if (hasBeenVisited != 0) {
            n3 = 1;
        }
        final String submitType = this.submitType;
        int hashCode19;
        if (submitType == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = submitType.hashCode();
        }
        final Boolean allowImages = this.allowImages;
        int hashCode20;
        if (allowImages == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = allowImages.hashCode();
        }
        final Boolean allowVideos = this.allowVideos;
        int hashCode21;
        if (allowVideos == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = allowVideos.hashCode();
        }
        final Boolean allowGifs = this.allowGifs;
        int hashCode22;
        if (allowGifs == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = allowGifs.hashCode();
        }
        final Boolean allowChatPostCreation = this.allowChatPostCreation;
        int hashCode23;
        if (allowChatPostCreation == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = allowChatPostCreation.hashCode();
        }
        final Boolean isChatPostFeatureEnabled = this.isChatPostFeatureEnabled;
        int hashCode24;
        if (isChatPostFeatureEnabled == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = isChatPostFeatureEnabled.hashCode();
        }
        final Boolean spoilersEnabled = this.spoilersEnabled;
        int hashCode25;
        if (spoilersEnabled == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = spoilersEnabled.hashCode();
        }
        final Boolean allowPolls = this.allowPolls;
        int hashCode26;
        if (allowPolls == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = allowPolls.hashCode();
        }
        final Boolean allowPredictions = this.allowPredictions;
        int hashCode27;
        if (allowPredictions == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = allowPredictions.hashCode();
        }
        final Boolean userIsBanned = this.userIsBanned;
        int hashCode28;
        if (userIsBanned == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = userIsBanned.hashCode();
        }
        final Boolean userIsContributor = this.userIsContributor;
        int hashCode29;
        if (userIsContributor == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = userIsContributor.hashCode();
        }
        final Boolean userIsModerator = this.userIsModerator;
        int hashCode30;
        if (userIsModerator == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = userIsModerator.hashCode();
        }
        final Boolean userIsSubscriber = this.userIsSubscriber;
        int hashCode31;
        if (userIsSubscriber == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = userIsSubscriber.hashCode();
        }
        final Boolean userHasFavorited = this.userHasFavorited;
        int hashCode32;
        if (userHasFavorited == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = userHasFavorited.hashCode();
        }
        final NotificationLevel notificationLevel = this.notificationLevel;
        int hashCode33;
        if (notificationLevel == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = notificationLevel.hashCode();
        }
        final String primaryColorKey = this.primaryColorKey;
        int hashCode34;
        if (primaryColorKey == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = primaryColorKey.hashCode();
        }
        final String communityIconUrl = this.communityIconUrl;
        int hashCode35;
        if (communityIconUrl == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = communityIconUrl.hashCode();
        }
        final String bannerBackgroundImageUrl = this.bannerBackgroundImageUrl;
        int hashCode36;
        if (bannerBackgroundImageUrl == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = bannerBackgroundImageUrl.hashCode();
        }
        final String mobileBannerImageUrl = this.mobileBannerImageUrl;
        int hashCode37;
        if (mobileBannerImageUrl == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = mobileBannerImageUrl.hashCode();
        }
        final Boolean userFlairEnabled = this.userFlairEnabled;
        int hashCode38;
        if (userFlairEnabled == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = userFlairEnabled.hashCode();
        }
        final Boolean canAssignUserFlair = this.canAssignUserFlair;
        int hashCode39;
        if (canAssignUserFlair == null) {
            hashCode39 = 0;
        }
        else {
            hashCode39 = canAssignUserFlair.hashCode();
        }
        final Boolean userSubredditFlairEnabled = this.userSubredditFlairEnabled;
        int hashCode40;
        if (userSubredditFlairEnabled == null) {
            hashCode40 = 0;
        }
        else {
            hashCode40 = userSubredditFlairEnabled.hashCode();
        }
        final String userFlairTemplateId = this.userFlairTemplateId;
        int hashCode41;
        if (userFlairTemplateId == null) {
            hashCode41 = 0;
        }
        else {
            hashCode41 = userFlairTemplateId.hashCode();
        }
        final String userFlairBackgroundColor = this.userFlairBackgroundColor;
        int hashCode42;
        if (userFlairBackgroundColor == null) {
            hashCode42 = 0;
        }
        else {
            hashCode42 = userFlairBackgroundColor.hashCode();
        }
        final String userFlairTextColor = this.userFlairTextColor;
        int hashCode43;
        if (userFlairTextColor == null) {
            hashCode43 = 0;
        }
        else {
            hashCode43 = userFlairTextColor.hashCode();
        }
        final String userFlairText = this.userFlairText;
        int hashCode44;
        if (userFlairText == null) {
            hashCode44 = 0;
        }
        else {
            hashCode44 = userFlairText.hashCode();
        }
        final List<FlairRichTextItem> user_flair_richtext = this.user_flair_richtext;
        int hashCode45;
        if (user_flair_richtext == null) {
            hashCode45 = 0;
        }
        else {
            hashCode45 = user_flair_richtext.hashCode();
        }
        final Boolean postFlairEnabled = this.postFlairEnabled;
        int hashCode46;
        if (postFlairEnabled == null) {
            hashCode46 = 0;
        }
        else {
            hashCode46 = postFlairEnabled.hashCode();
        }
        final Boolean canAssignLinkFlair = this.canAssignLinkFlair;
        int hashCode47;
        if (canAssignLinkFlair == null) {
            hashCode47 = 0;
        }
        else {
            hashCode47 = canAssignLinkFlair.hashCode();
        }
        final String contentCategory = this.contentCategory;
        int hashCode48;
        if (contentCategory == null) {
            hashCode48 = 0;
        }
        else {
            hashCode48 = contentCategory.hashCode();
        }
        final String predictionLeaderboardEntryType = this.predictionLeaderboardEntryType;
        int hashCode49;
        if (predictionLeaderboardEntryType == null) {
            hashCode49 = 0;
        }
        else {
            hashCode49 = predictionLeaderboardEntryType.hashCode();
        }
        final Boolean allowPredictionsTournament = this.allowPredictionsTournament;
        int hashCode50;
        if (allowPredictionsTournament == null) {
            hashCode50 = 0;
        }
        else {
            hashCode50 = allowPredictionsTournament.hashCode();
        }
        final Boolean isUserBanned = this.isUserBanned;
        int hashCode51;
        if (isUserBanned == null) {
            hashCode51 = 0;
        }
        else {
            hashCode51 = isUserBanned.hashCode();
        }
        final int b = ph0.a.b((List)this.rules, ((((((((((((((((((((((((((((((((((((((((((((e3 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + n3) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + hashCode30) * 31 + hashCode31) * 31 + hashCode32) * 31 + hashCode33) * 31 + hashCode34) * 31 + hashCode35) * 31 + hashCode36) * 31 + hashCode37) * 31 + hashCode38) * 31 + hashCode39) * 31 + hashCode40) * 31 + hashCode41) * 31 + hashCode42) * 31 + hashCode43) * 31 + hashCode44) * 31 + hashCode45) * 31 + hashCode46) * 31 + hashCode47) * 31 + hashCode48) * 31 + hashCode49) * 31 + hashCode50) * 31 + hashCode51) * 31, 31);
        final String countrySiteCountry = this.countrySiteCountry;
        int hashCode52;
        if (countrySiteCountry == null) {
            hashCode52 = 0;
        }
        else {
            hashCode52 = countrySiteCountry.hashCode();
        }
        final String countrySiteLanguage = this.countrySiteLanguage;
        int hashCode53;
        if (countrySiteLanguage == null) {
            hashCode53 = 0;
        }
        else {
            hashCode53 = countrySiteLanguage.hashCode();
        }
        final SubredditCountrySiteSettings subredditCountrySiteSettings = this.subredditCountrySiteSettings;
        int hashCode54;
        if (subredditCountrySiteSettings == null) {
            hashCode54 = 0;
        }
        else {
            hashCode54 = subredditCountrySiteSettings.hashCode();
        }
        final Boolean shouldShowMediaInCommentsSetting = this.shouldShowMediaInCommentsSetting;
        int hashCode55;
        if (shouldShowMediaInCommentsSetting == null) {
            hashCode55 = 0;
        }
        else {
            hashCode55 = shouldShowMediaInCommentsSetting.hashCode();
        }
        final List<? extends MediaInCommentType> allowedMediaInComments = this.allowedMediaInComments;
        int hashCode56;
        if (allowedMediaInComments == null) {
            hashCode56 = 0;
        }
        else {
            hashCode56 = allowedMediaInComments.hashCode();
        }
        final Boolean isTitleSafe = this.isTitleSafe;
        int hashCode57;
        if (isTitleSafe == null) {
            hashCode57 = n;
        }
        else {
            hashCode57 = isTitleSafe.hashCode();
        }
        int isMyReddit;
        if ((isMyReddit = (this.isMyReddit ? 1 : 0)) != 0) {
            isMyReddit = 1;
        }
        int isMuted = this.isMuted ? 1 : 0;
        if (isMuted != 0) {
            isMuted = n2;
        }
        return (((((((b + hashCode52) * 31 + hashCode53) * 31 + hashCode54) * 31 + hashCode55) * 31 + hashCode56) * 31 + hashCode57) * 31 + isMyReddit) * 31 + isMuted;
    }
    
    public final boolean isArchived() {
        return e.a((Object)this.subredditType, (Object)"archived");
    }
    
    public final Boolean isChatPostFeatureEnabled() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final boolean isEmployeeOnly() {
        return e.a((Object)this.subredditType, (Object)"employees_only");
    }
    
    public final boolean isGoldRestricted() {
        return e.a((Object)this.subredditType, (Object)"gold_restricted");
    }
    
    public final boolean isMuted() {
        return this.isMuted;
    }
    
    public final boolean isMyReddit() {
        return this.isMyReddit;
    }
    
    public final boolean isPremium() {
        return e.a((Object)this.subredditType, (Object)"gold_only");
    }
    
    public final boolean isPrivate() {
        return e.a((Object)this.subredditType, (Object)"private");
    }
    
    public final boolean isPublic() {
        return e.a((Object)this.subredditType, (Object)"public");
    }
    
    public final boolean isRestricted() {
        return e.a((Object)this.subredditType, (Object)"restricted");
    }
    
    public final Boolean isTitleSafe() {
        return this.isTitleSafe;
    }
    
    public final boolean isUser() {
        return e.a((Object)this.subredditType, (Object)"user");
    }
    
    public final Boolean isUserBanned() {
        return this.isUserBanned;
    }
    
    public final void setAllowedMediaInComments(final List<? extends MediaInCommentType> allowedMediaInComments) {
        this.allowedMediaInComments = allowedMediaInComments;
    }
    
    public final void setStructuredStyle(final StructuredStyle structuredStyle) {
        this.structuredStyle = structuredStyle;
    }
    
    public final void setUserHasFavorited(final Boolean userHasFavorited) {
        this.userHasFavorited = userHasFavorited;
    }
    
    public final void setUserIsBanned(final Boolean userIsBanned) {
        this.userIsBanned = userIsBanned;
    }
    
    public final void setUserIsContributor(final Boolean userIsContributor) {
        this.userIsContributor = userIsContributor;
    }
    
    public final void setUserIsModerator(final Boolean userIsModerator) {
        this.userIsModerator = userIsModerator;
    }
    
    public final void setUserIsSubscriber(final Boolean userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }
    
    public final void setUser_flair_richtext(final List<FlairRichTextItem> user_flair_richtext) {
        this.user_flair_richtext = user_flair_richtext;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Subreddit(id=");
        t.append(this.id);
        t.append(", kindWithId=");
        t.append(this.getKindWithId());
        t.append(", displayName=");
        t.append(this.displayName);
        t.append(", displayNamePrefixed=");
        t.append(this.displayNamePrefixed);
        t.append(", iconImg=");
        t.append(this.iconImg);
        t.append(", keyColor=");
        t.append(this.keyColor);
        t.append(", bannerImg=");
        t.append(this.bannerImg);
        t.append(", title=");
        t.append(this.title);
        t.append(", description=");
        t.append(this.description);
        t.append(", descriptionRtJson=");
        t.append(this.descriptionRtJson);
        t.append(", publicDescription=");
        t.append(this.publicDescription);
        t.append(", subscribers=");
        t.append(this.subscribers);
        t.append(", accountsActive=");
        t.append(this.accountsActive);
        t.append(", createdUtc=");
        t.append(this.createdUtc);
        t.append(", subredditType=");
        t.append(this.subredditType);
        t.append(", url=");
        t.append(this.url);
        t.append(", over18=");
        t.append(this.over18);
        t.append(", wikiEnabled=");
        t.append(this.wikiEnabled);
        t.append(", whitelistStatus=");
        t.append(this.whitelistStatus);
        t.append(", newModMailEnabled=");
        t.append(this.newModMailEnabled);
        t.append(", restrictPosting=");
        t.append(this.restrictPosting);
        t.append(", quarantined=");
        t.append(this.quarantined);
        t.append(", quarantineMessage=");
        t.append(this.quarantineMessage);
        t.append(", quarantineMessageRtJson=");
        t.append(this.quarantineMessageRtJson);
        t.append(", interstitialWarningMessage=");
        t.append(this.interstitialWarningMessage);
        t.append(", interstitialWarningMessageRtJson=");
        t.append(this.interstitialWarningMessageRtJson);
        t.append(", hasBeenVisited=");
        t.append(this.hasBeenVisited);
        t.append(", submitType=");
        t.append(this.submitType);
        t.append(", allowImages=");
        t.append(this.allowImages);
        t.append(", allowVideos=");
        t.append(this.allowVideos);
        t.append(", allowGifs=");
        t.append(this.allowGifs);
        t.append(", allowChatPostCreation=");
        t.append(this.allowChatPostCreation);
        t.append(", isChatPostFeatureEnabled=");
        t.append(this.isChatPostFeatureEnabled);
        t.append(", spoilersEnabled=");
        t.append(this.spoilersEnabled);
        t.append(", allowPolls=");
        t.append(this.allowPolls);
        t.append(", allowPredictions=");
        t.append(this.allowPredictions);
        t.append(", userIsBanned=");
        t.append(this.userIsBanned);
        t.append(", userIsContributor=");
        t.append(this.userIsContributor);
        t.append(", userIsModerator=");
        t.append(this.userIsModerator);
        t.append(", userIsSubscriber=");
        t.append(this.userIsSubscriber);
        t.append(", userHasFavorited=");
        t.append(this.userHasFavorited);
        t.append(", notificationLevel=");
        t.append(this.notificationLevel);
        t.append(", primaryColorKey=");
        t.append(this.primaryColorKey);
        t.append(", communityIconUrl=");
        t.append(this.communityIconUrl);
        t.append(", bannerBackgroundImageUrl=");
        t.append(this.bannerBackgroundImageUrl);
        t.append(", mobileBannerImageUrl=");
        t.append(this.mobileBannerImageUrl);
        t.append(", userFlairEnabled=");
        t.append(this.userFlairEnabled);
        t.append(", canAssignUserFlair=");
        t.append(this.canAssignUserFlair);
        t.append(", userSubredditFlairEnabled=");
        t.append(this.userSubredditFlairEnabled);
        t.append(", userFlairTemplateId=");
        t.append(this.userFlairTemplateId);
        t.append(", userFlairBackgroundColor=");
        t.append(this.userFlairBackgroundColor);
        t.append(", userFlairTextColor=");
        t.append(this.userFlairTextColor);
        t.append(", userFlairText=");
        t.append(this.userFlairText);
        t.append(", user_flair_richtext=");
        t.append(this.user_flair_richtext);
        t.append(", postFlairEnabled=");
        t.append(this.postFlairEnabled);
        t.append(", canAssignLinkFlair=");
        t.append(this.canAssignLinkFlair);
        t.append(", contentCategory=");
        t.append(this.contentCategory);
        t.append(", predictionLeaderboardEntryType=");
        t.append(this.predictionLeaderboardEntryType);
        t.append(", allowPredictionsTournament=");
        t.append(this.allowPredictionsTournament);
        t.append(", isUserBanned=");
        t.append(this.isUserBanned);
        t.append(", rules=");
        t.append(this.rules);
        t.append(", countrySiteCountry=");
        t.append(this.countrySiteCountry);
        t.append(", countrySiteLanguage=");
        t.append(this.countrySiteLanguage);
        t.append(", subredditCountrySiteSettings=");
        t.append(this.subredditCountrySiteSettings);
        t.append(", shouldShowMediaInCommentsSetting=");
        t.append(this.shouldShowMediaInCommentsSetting);
        t.append(", allowedMediaInComments=");
        t.append(this.allowedMediaInComments);
        t.append(", isTitleSafe=");
        t.append(this.isTitleSafe);
        t.append(", isMyReddit=");
        t.append(this.isMyReddit);
        t.append(", isMuted=");
        return d.n(t, this.isMuted, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayNamePrefixed);
        parcel.writeString(this.iconImg);
        parcel.writeString(this.keyColor);
        parcel.writeString(this.bannerImg);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.descriptionRtJson);
        parcel.writeString(this.publicDescription);
        final Long subscribers = this.subscribers;
        if (subscribers == null) {
            parcel.writeInt(0);
        }
        else {
            b.t(parcel, 1, subscribers);
        }
        final Long accountsActive = this.accountsActive;
        if (accountsActive == null) {
            parcel.writeInt(0);
        }
        else {
            b.t(parcel, 1, accountsActive);
        }
        parcel.writeLong(this.createdUtc);
        parcel.writeString(this.subredditType);
        parcel.writeString(this.url);
        final Boolean over18 = this.over18;
        if (over18 == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, over18);
        }
        final Boolean wikiEnabled = this.wikiEnabled;
        if (wikiEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, wikiEnabled);
        }
        parcel.writeString(this.whitelistStatus);
        final Boolean newModMailEnabled = this.newModMailEnabled;
        if (newModMailEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, newModMailEnabled);
        }
        final Boolean restrictPosting = this.restrictPosting;
        if (restrictPosting == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, restrictPosting);
        }
        final Boolean quarantined = this.quarantined;
        if (quarantined == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, quarantined);
        }
        parcel.writeString(this.quarantineMessage);
        parcel.writeString(this.quarantineMessageRtJson);
        parcel.writeString(this.interstitialWarningMessage);
        parcel.writeString(this.interstitialWarningMessageRtJson);
        parcel.writeInt((int)(this.hasBeenVisited ? 1 : 0));
        parcel.writeString(this.submitType);
        final Boolean allowImages = this.allowImages;
        if (allowImages == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowImages);
        }
        final Boolean allowVideos = this.allowVideos;
        if (allowVideos == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowVideos);
        }
        final Boolean allowGifs = this.allowGifs;
        if (allowGifs == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowGifs);
        }
        final Boolean allowChatPostCreation = this.allowChatPostCreation;
        if (allowChatPostCreation == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowChatPostCreation);
        }
        final Boolean isChatPostFeatureEnabled = this.isChatPostFeatureEnabled;
        if (isChatPostFeatureEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isChatPostFeatureEnabled);
        }
        final Boolean spoilersEnabled = this.spoilersEnabled;
        if (spoilersEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, spoilersEnabled);
        }
        final Boolean allowPolls = this.allowPolls;
        if (allowPolls == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowPolls);
        }
        final Boolean allowPredictions = this.allowPredictions;
        if (allowPredictions == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowPredictions);
        }
        final Boolean userIsBanned = this.userIsBanned;
        if (userIsBanned == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsBanned);
        }
        final Boolean userIsContributor = this.userIsContributor;
        if (userIsContributor == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsContributor);
        }
        final Boolean userIsModerator = this.userIsModerator;
        if (userIsModerator == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsModerator);
        }
        final Boolean userIsSubscriber = this.userIsSubscriber;
        if (userIsSubscriber == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsSubscriber);
        }
        final Boolean userHasFavorited = this.userHasFavorited;
        if (userHasFavorited == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userHasFavorited);
        }
        final NotificationLevel notificationLevel = this.notificationLevel;
        if (notificationLevel == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(((Enum)notificationLevel).name());
        }
        parcel.writeString(this.primaryColorKey);
        parcel.writeString(this.communityIconUrl);
        parcel.writeString(this.bannerBackgroundImageUrl);
        parcel.writeString(this.mobileBannerImageUrl);
        final Boolean userFlairEnabled = this.userFlairEnabled;
        if (userFlairEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userFlairEnabled);
        }
        final Boolean canAssignUserFlair = this.canAssignUserFlair;
        if (canAssignUserFlair == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, canAssignUserFlair);
        }
        final Boolean userSubredditFlairEnabled = this.userSubredditFlairEnabled;
        if (userSubredditFlairEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userSubredditFlairEnabled);
        }
        parcel.writeString(this.userFlairTemplateId);
        parcel.writeString(this.userFlairBackgroundColor);
        parcel.writeString(this.userFlairTextColor);
        parcel.writeString(this.userFlairText);
        final List<FlairRichTextItem> user_flair_richtext = this.user_flair_richtext;
        if (user_flair_richtext == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator j = u10.o.j(parcel, 1, (List)user_flair_richtext);
            while (j.hasNext()) {
                ((FlairRichTextItem)j.next()).writeToParcel(parcel, n);
            }
        }
        final Boolean postFlairEnabled = this.postFlairEnabled;
        if (postFlairEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, postFlairEnabled);
        }
        final Boolean canAssignLinkFlair = this.canAssignLinkFlair;
        if (canAssignLinkFlair == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, canAssignLinkFlair);
        }
        parcel.writeString(this.contentCategory);
        parcel.writeString(this.predictionLeaderboardEntryType);
        final Boolean allowPredictionsTournament = this.allowPredictionsTournament;
        if (allowPredictionsTournament == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, allowPredictionsTournament);
        }
        final Boolean isUserBanned = this.isUserBanned;
        if (isUserBanned == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isUserBanned);
        }
        final Iterator r = android.support.v4.media.a.r((List)this.rules, parcel);
        while (r.hasNext()) {
            ((Rule)r.next()).writeToParcel(parcel, n);
        }
        parcel.writeString(this.countrySiteCountry);
        parcel.writeString(this.countrySiteLanguage);
        final SubredditCountrySiteSettings subredditCountrySiteSettings = this.subredditCountrySiteSettings;
        if (subredditCountrySiteSettings == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            subredditCountrySiteSettings.writeToParcel(parcel, n);
        }
        final Boolean shouldShowMediaInCommentsSetting = this.shouldShowMediaInCommentsSetting;
        if (shouldShowMediaInCommentsSetting == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, shouldShowMediaInCommentsSetting);
        }
        final List<? extends MediaInCommentType> allowedMediaInComments = this.allowedMediaInComments;
        if (allowedMediaInComments == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator i = u10.o.j(parcel, 1, (List)allowedMediaInComments);
            while (i.hasNext()) {
                parcel.writeString(((Enum)i.next()).name());
            }
        }
        final Boolean isTitleSafe = this.isTitleSafe;
        if (isTitleSafe == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isTitleSafe);
        }
        parcel.writeInt((int)(this.isMyReddit ? 1 : 0));
        parcel.writeInt((int)(this.isMuted ? 1 : 0));
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/model/Subreddit$Companion;", "", "()V", "PREDICTION_LEADERBOARD_ENTRY_TYPE_IN_FEED", "", "PREDICTION_LEADERBOARD_ENTRY_TYPE_SUBREDDIT_HEADER", "SUBREDDIT_TYPE_ARCHIVED", "SUBREDDIT_TYPE_EMPLOYEES_ONLY", "SUBREDDIT_TYPE_GOLD_RESTRICTED", "SUBREDDIT_TYPE_PREMIUM", "SUBREDDIT_TYPE_PRIVATE", "SUBREDDIT_TYPE_PUBLIC", "SUBREDDIT_TYPE_RESTRICTED", "SUBREDDIT_TYPE_USER", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Subreddit>
    {
        public final Subreddit createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            final String string8 = parcel.readString();
            final String string9 = parcel.readString();
            final String string10 = parcel.readString();
            final String string11 = parcel.readString();
            Long value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readLong();
            }
            Long value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readLong();
            }
            final long long1 = parcel.readLong();
            final String string12 = parcel.readString();
            final String string13 = parcel.readString();
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = (parcel.readInt() != 0);
            }
            Boolean value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = (parcel.readInt() != 0);
            }
            final String string14 = parcel.readString();
            Boolean value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = (parcel.readInt() != 0);
            }
            Boolean value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                value6 = (parcel.readInt() != 0);
            }
            Boolean value7;
            if (parcel.readInt() == 0) {
                value7 = null;
            }
            else {
                value7 = (parcel.readInt() != 0);
            }
            final String string15 = parcel.readString();
            final String string16 = parcel.readString();
            final String string17 = parcel.readString();
            final String string18 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            final String string19 = parcel.readString();
            Boolean value8;
            if (parcel.readInt() == 0) {
                value8 = null;
            }
            else {
                value8 = (parcel.readInt() != 0);
            }
            Boolean value9;
            if (parcel.readInt() == 0) {
                value9 = null;
            }
            else {
                value9 = (parcel.readInt() != 0);
            }
            Boolean value10;
            if (parcel.readInt() == 0) {
                value10 = null;
            }
            else {
                value10 = (parcel.readInt() != 0);
            }
            Boolean value11;
            if (parcel.readInt() == 0) {
                value11 = null;
            }
            else {
                value11 = (parcel.readInt() != 0);
            }
            Boolean value12;
            if (parcel.readInt() == 0) {
                value12 = null;
            }
            else {
                value12 = (parcel.readInt() != 0);
            }
            Boolean value13;
            if (parcel.readInt() == 0) {
                value13 = null;
            }
            else {
                value13 = (parcel.readInt() != 0);
            }
            Boolean value14;
            if (parcel.readInt() == 0) {
                value14 = null;
            }
            else {
                value14 = (parcel.readInt() != 0);
            }
            Boolean value15;
            if (parcel.readInt() == 0) {
                value15 = null;
            }
            else {
                value15 = (parcel.readInt() != 0);
            }
            Boolean value16;
            if (parcel.readInt() == 0) {
                value16 = null;
            }
            else {
                value16 = (parcel.readInt() != 0);
            }
            Boolean value17;
            if (parcel.readInt() == 0) {
                value17 = null;
            }
            else {
                value17 = (parcel.readInt() != 0);
            }
            Boolean value18;
            if (parcel.readInt() == 0) {
                value18 = null;
            }
            else {
                value18 = (parcel.readInt() != 0);
            }
            Boolean value19;
            if (parcel.readInt() == 0) {
                value19 = null;
            }
            else {
                value19 = (parcel.readInt() != 0);
            }
            Boolean value20;
            if (parcel.readInt() == 0) {
                value20 = null;
            }
            else {
                value20 = (parcel.readInt() != 0);
            }
            NotificationLevel value21;
            if (parcel.readInt() == 0) {
                value21 = null;
            }
            else {
                value21 = NotificationLevel.valueOf(parcel.readString());
            }
            final String string20 = parcel.readString();
            final String string21 = parcel.readString();
            final String string22 = parcel.readString();
            final String string23 = parcel.readString();
            Boolean value22;
            if (parcel.readInt() == 0) {
                value22 = null;
            }
            else {
                value22 = (parcel.readInt() != 0);
            }
            Boolean value23;
            if (parcel.readInt() == 0) {
                value23 = null;
            }
            else {
                value23 = (parcel.readInt() != 0);
            }
            Boolean value24;
            if (parcel.readInt() == 0) {
                value24 = null;
            }
            else {
                value24 = (parcel.readInt() != 0);
            }
            final String string24 = parcel.readString();
            final String string25 = parcel.readString();
            final String string26 = parcel.readString();
            final String string27 = parcel.readString();
            Long n;
            List<FlairRichTextItem> list;
            if (parcel.readInt() == 0) {
                n = value;
                list = null;
            }
            else {
                final int int1 = parcel.readInt();
                final ArrayList list2 = new ArrayList(int1);
                for (int i = 0; i != int1; i = u10.o.c(FlairRichTextItem.CREATOR, parcel, list2, i, 1)) {}
                n = value;
                list = (List<FlairRichTextItem>)list2;
            }
            Boolean value25;
            if (parcel.readInt() == 0) {
                value25 = null;
            }
            else {
                value25 = (parcel.readInt() != 0);
            }
            Boolean value26;
            if (parcel.readInt() == 0) {
                value26 = null;
            }
            else {
                value26 = (parcel.readInt() != 0);
            }
            final String string28 = parcel.readString();
            final String string29 = parcel.readString();
            Boolean value27;
            if (parcel.readInt() == 0) {
                value27 = null;
            }
            else {
                value27 = (parcel.readInt() != 0);
            }
            Boolean value28;
            if (parcel.readInt() == 0) {
                value28 = null;
            }
            else {
                value28 = (parcel.readInt() != 0);
            }
            final int int2 = parcel.readInt();
            final ArrayList list3 = new ArrayList(int2);
            for (int j = 0; j != int2; j = u10.o.c((Parcelable$Creator)Rule.CREATOR, parcel, list3, j, 1)) {}
            final String string30 = parcel.readString();
            final String string31 = parcel.readString();
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = SubredditCountrySiteSettings.CREATOR.createFromParcel(parcel);
            }
            final SubredditCountrySiteSettings subredditCountrySiteSettings = (SubredditCountrySiteSettings)fromParcel;
            Boolean value29;
            if (parcel.readInt() == 0) {
                value29 = null;
            }
            else {
                value29 = (parcel.readInt() != 0);
            }
            ArrayList<MediaInCommentType> list4;
            if (parcel.readInt() == 0) {
                list4 = null;
            }
            else {
                final int int3 = parcel.readInt();
                list4 = new ArrayList<MediaInCommentType>(int3);
                for (int k = 0; k != int3; ++k) {
                    list4.add(MediaInCommentType.valueOf(parcel.readString()));
                }
            }
            Boolean value30;
            if (parcel.readInt() == 0) {
                value30 = null;
            }
            else {
                value30 = (parcel.readInt() != 0);
            }
            return new Subreddit(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, n, value2, long1, string12, string13, value3, value4, string14, value5, value6, value7, string15, string16, string17, string18, b, string19, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, string20, string21, string22, string23, value22, value23, value24, string24, string25, string26, string27, list, value25, value26, string28, string29, value27, value28, (List<Rule>)list3, string30, string31, subredditCountrySiteSettings, value29, list4, value30, parcel.readInt() != 0, parcel.readInt() != 0);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final Subreddit[] newArray(final int n) {
            return new Subreddit[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
