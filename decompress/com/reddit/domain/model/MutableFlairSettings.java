// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/MutableFlairSettings;", "", "modOnly", "", "allowUserEdits", "allowableContent", "Lcom/reddit/domain/model/AllowableContent;", "maxEmojis", "", "(ZZLcom/reddit/domain/model/AllowableContent;I)V", "getAllowUserEdits", "()Z", "setAllowUserEdits", "(Z)V", "getAllowableContent", "()Lcom/reddit/domain/model/AllowableContent;", "setAllowableContent", "(Lcom/reddit/domain/model/AllowableContent;)V", "getMaxEmojis", "()I", "setMaxEmojis", "(I)V", "getModOnly", "setModOnly", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MutableFlairSettings
{
    private boolean allowUserEdits;
    private AllowableContent allowableContent;
    private int maxEmojis;
    private boolean modOnly;
    
    public MutableFlairSettings(final boolean modOnly, final boolean allowUserEdits, final AllowableContent allowableContent, final int maxEmojis) {
        f.f((Object)allowableContent, "allowableContent");
        this.modOnly = modOnly;
        this.allowUserEdits = allowUserEdits;
        this.allowableContent = allowableContent;
        this.maxEmojis = maxEmojis;
    }
    
    public final boolean component1() {
        return this.modOnly;
    }
    
    public final boolean component2() {
        return this.allowUserEdits;
    }
    
    public final AllowableContent component3() {
        return this.allowableContent;
    }
    
    public final int component4() {
        return this.maxEmojis;
    }
    
    public final MutableFlairSettings copy(final boolean b, final boolean b2, final AllowableContent allowableContent, final int n) {
        f.f((Object)allowableContent, "allowableContent");
        return new MutableFlairSettings(b, b2, allowableContent, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MutableFlairSettings)) {
            return false;
        }
        final MutableFlairSettings mutableFlairSettings = (MutableFlairSettings)o;
        return this.modOnly == mutableFlairSettings.modOnly && this.allowUserEdits == mutableFlairSettings.allowUserEdits && this.allowableContent == mutableFlairSettings.allowableContent && this.maxEmojis == mutableFlairSettings.maxEmojis;
    }
    
    public final boolean getAllowUserEdits() {
        return this.allowUserEdits;
    }
    
    public final AllowableContent getAllowableContent() {
        return this.allowableContent;
    }
    
    public final int getMaxEmojis() {
        return this.maxEmojis;
    }
    
    public final boolean getModOnly() {
        return this.modOnly;
    }
    
    @Override
    public int hashCode() {
        final int modOnly = this.modOnly ? 1 : 0;
        int n = 1;
        int n2 = modOnly;
        if (modOnly != 0) {
            n2 = 1;
        }
        final int allowUserEdits = this.allowUserEdits ? 1 : 0;
        if (allowUserEdits == 0) {
            n = allowUserEdits;
        }
        return Integer.hashCode(this.maxEmojis) + (this.allowableContent.hashCode() + (n2 * 31 + n) * 31) * 31;
    }
    
    public final void setAllowUserEdits(final boolean allowUserEdits) {
        this.allowUserEdits = allowUserEdits;
    }
    
    public final void setAllowableContent(final AllowableContent allowableContent) {
        f.f((Object)allowableContent, "<set-?>");
        this.allowableContent = allowableContent;
    }
    
    public final void setMaxEmojis(final int maxEmojis) {
        this.maxEmojis = maxEmojis;
    }
    
    public final void setModOnly(final boolean modOnly) {
        this.modOnly = modOnly;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MutableFlairSettings(modOnly=");
        k.append(this.modOnly);
        k.append(", allowUserEdits=");
        k.append(this.allowUserEdits);
        k.append(", allowableContent=");
        k.append(this.allowableContent);
        k.append(", maxEmojis=");
        return d.k(k, this.maxEmojis, ')');
    }
}
