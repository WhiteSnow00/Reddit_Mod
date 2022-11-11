// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/listing/RemovalReason;", "", "item_ids", "", "", "reason_id", "mod_note", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getItem_ids", "()Ljava/util/List;", "getMod_note", "()Ljava/lang/String;", "getReason_id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RemovalReason
{
    private final List<String> item_ids;
    private final String mod_note;
    private final String reason_id;
    
    public RemovalReason(final List<String> item_ids, final String reason_id, final String mod_note) {
        f.f((Object)item_ids, "item_ids");
        f.f((Object)reason_id, "reason_id");
        f.f((Object)mod_note, "mod_note");
        this.item_ids = item_ids;
        this.reason_id = reason_id;
        this.mod_note = mod_note;
    }
    
    public final List<String> component1() {
        return this.item_ids;
    }
    
    public final String component2() {
        return this.reason_id;
    }
    
    public final String component3() {
        return this.mod_note;
    }
    
    public final RemovalReason copy(final List<String> list, final String s, final String s2) {
        f.f((Object)list, "item_ids");
        f.f((Object)s, "reason_id");
        f.f((Object)s2, "mod_note");
        return new RemovalReason(list, s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemovalReason)) {
            return false;
        }
        final RemovalReason removalReason = (RemovalReason)o;
        return f.a((Object)this.item_ids, (Object)removalReason.item_ids) && f.a((Object)this.reason_id, (Object)removalReason.reason_id) && f.a((Object)this.mod_note, (Object)removalReason.mod_note);
    }
    
    public final List<String> getItem_ids() {
        return this.item_ids;
    }
    
    public final String getMod_note() {
        return this.mod_note;
    }
    
    public final String getReason_id() {
        return this.reason_id;
    }
    
    @Override
    public int hashCode() {
        return this.mod_note.hashCode() + a.f(this.reason_id, this.item_ids.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RemovalReason(item_ids=");
        k.append(this.item_ids);
        k.append(", reason_id=");
        k.append(this.reason_id);
        k.append(", mod_note=");
        return b.k(k, this.mod_note, ')');
    }
}
