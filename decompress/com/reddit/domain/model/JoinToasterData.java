// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import pg2.j;
import zg2.l;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u008a\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\tR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b)\u0010(R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b*\u0010(¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/JoinToasterData;", "", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "Lkotlin/Function1;", "Lpg2/j;", "component6", "component7", "component8", "subredditId", "subredditName", "subredditIconImageUrl", "subredditKeyColor", "cancelButtonTextId", "onCloseClick", "onConfirmClick", "onCancelClick", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lzg2/l;Lzg2/l;Lzg2/l;)Lcom/reddit/domain/model/JoinToasterData;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSubredditId", "()Ljava/lang/String;", "getSubredditName", "getSubredditIconImageUrl", "getSubredditKeyColor", "Ljava/lang/Integer;", "getCancelButtonTextId", "Lzg2/l;", "getOnCloseClick", "()Lzg2/l;", "getOnConfirmClick", "getOnCancelClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lzg2/l;Lzg2/l;Lzg2/l;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class JoinToasterData
{
    private final Integer cancelButtonTextId;
    private final l<JoinToasterData, j> onCancelClick;
    private final l<JoinToasterData, j> onCloseClick;
    private final l<JoinToasterData, j> onConfirmClick;
    private final String subredditIconImageUrl;
    private final String subredditId;
    private final String subredditKeyColor;
    private final String subredditName;
    
    public JoinToasterData(final String subredditId, final String subredditName, final String subredditIconImageUrl, final String subredditKeyColor, final Integer cancelButtonTextId, final l<? super JoinToasterData, j> onCloseClick, final l<? super JoinToasterData, j> onConfirmClick, final l<? super JoinToasterData, j> onCancelClick) {
        f.f((Object)subredditId, "subredditId");
        f.f((Object)subredditName, "subredditName");
        f.f((Object)onCloseClick, "onCloseClick");
        f.f((Object)onConfirmClick, "onConfirmClick");
        f.f((Object)onCancelClick, "onCancelClick");
        this.subredditId = subredditId;
        this.subredditName = subredditName;
        this.subredditIconImageUrl = subredditIconImageUrl;
        this.subredditKeyColor = subredditKeyColor;
        this.cancelButtonTextId = cancelButtonTextId;
        this.onCloseClick = (l<JoinToasterData, j>)onCloseClick;
        this.onConfirmClick = (l<JoinToasterData, j>)onConfirmClick;
        this.onCancelClick = (l<JoinToasterData, j>)onCancelClick;
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final String component3() {
        return this.subredditIconImageUrl;
    }
    
    public final String component4() {
        return this.subredditKeyColor;
    }
    
    public final Integer component5() {
        return this.cancelButtonTextId;
    }
    
    public final l<JoinToasterData, j> component6() {
        return this.onCloseClick;
    }
    
    public final l<JoinToasterData, j> component7() {
        return this.onConfirmClick;
    }
    
    public final l<JoinToasterData, j> component8() {
        return this.onCancelClick;
    }
    
    public final JoinToasterData copy(final String s, final String s2, final String s3, final String s4, final Integer n, final l<? super JoinToasterData, j> l, final l<? super JoinToasterData, j> i, final l<? super JoinToasterData, j> j) {
        f.f((Object)s, "subredditId");
        f.f((Object)s2, "subredditName");
        f.f((Object)l, "onCloseClick");
        f.f((Object)i, "onConfirmClick");
        f.f((Object)j, "onCancelClick");
        return new JoinToasterData(s, s2, s3, s4, n, l, i, j);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JoinToasterData)) {
            return false;
        }
        final JoinToasterData joinToasterData = (JoinToasterData)o;
        return f.a((Object)this.subredditId, (Object)joinToasterData.subredditId) && f.a((Object)this.subredditName, (Object)joinToasterData.subredditName) && f.a((Object)this.subredditIconImageUrl, (Object)joinToasterData.subredditIconImageUrl) && f.a((Object)this.subredditKeyColor, (Object)joinToasterData.subredditKeyColor) && f.a((Object)this.cancelButtonTextId, (Object)joinToasterData.cancelButtonTextId) && f.a((Object)this.onCloseClick, (Object)joinToasterData.onCloseClick) && f.a((Object)this.onConfirmClick, (Object)joinToasterData.onConfirmClick) && f.a((Object)this.onCancelClick, (Object)joinToasterData.onCancelClick);
    }
    
    public final Integer getCancelButtonTextId() {
        return this.cancelButtonTextId;
    }
    
    public final l<JoinToasterData, j> getOnCancelClick() {
        return this.onCancelClick;
    }
    
    public final l<JoinToasterData, j> getOnCloseClick() {
        return this.onCloseClick;
    }
    
    public final l<JoinToasterData, j> getOnConfirmClick() {
        return this.onConfirmClick;
    }
    
    public final String getSubredditIconImageUrl() {
        return this.subredditIconImageUrl;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditKeyColor() {
        return this.subredditKeyColor;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.subredditName, this.subredditId.hashCode() * 31, 31);
        final String subredditIconImageUrl = this.subredditIconImageUrl;
        int hashCode = 0;
        int hashCode2;
        if (subredditIconImageUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subredditIconImageUrl.hashCode();
        }
        final String subredditKeyColor = this.subredditKeyColor;
        int hashCode3;
        if (subredditKeyColor == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subredditKeyColor.hashCode();
        }
        final Integer cancelButtonTextId = this.cancelButtonTextId;
        if (cancelButtonTextId != null) {
            hashCode = cancelButtonTextId.hashCode();
        }
        return this.onCancelClick.hashCode() + (this.onConfirmClick.hashCode() + (this.onCloseClick.hashCode() + (((f + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("JoinToasterData(subredditId=");
        k.append(this.subredditId);
        k.append(", subredditName=");
        k.append(this.subredditName);
        k.append(", subredditIconImageUrl=");
        k.append(this.subredditIconImageUrl);
        k.append(", subredditKeyColor=");
        k.append(this.subredditKeyColor);
        k.append(", cancelButtonTextId=");
        k.append(this.cancelButtonTextId);
        k.append(", onCloseClick=");
        k.append(this.onCloseClick);
        k.append(", onConfirmClick=");
        k.append(this.onConfirmClick);
        k.append(", onCancelClick=");
        return d.n(k, (l)this.onCancelClick, ')');
    }
}
