// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.inbox;

import ak0.m;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/inbox/NotificationSettingsSection;", "", "id", "", "title", "rows", "", "Lcom/reddit/domain/model/inbox/NotificationSettingsRow;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getRows", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NotificationSettingsSection
{
    private final String id;
    private final List<NotificationSettingsRow> rows;
    private final String title;
    
    public NotificationSettingsSection(final String id, final String title, final List<NotificationSettingsRow> rows) {
        f.f((Object)id, "id");
        f.f((Object)rows, "rows");
        this.id = id;
        this.title = title;
        this.rows = rows;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final List<NotificationSettingsRow> component3() {
        return this.rows;
    }
    
    public final NotificationSettingsSection copy(final String s, final String s2, final List<NotificationSettingsRow> list) {
        f.f((Object)s, "id");
        f.f((Object)list, "rows");
        return new NotificationSettingsSection(s, s2, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSettingsSection)) {
            return false;
        }
        final NotificationSettingsSection notificationSettingsSection = (NotificationSettingsSection)o;
        return f.a((Object)this.id, (Object)notificationSettingsSection.id) && f.a((Object)this.title, (Object)notificationSettingsSection.title) && f.a((Object)this.rows, (Object)notificationSettingsSection.rows);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final List<NotificationSettingsRow> getRows() {
        return this.rows;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        return this.rows.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NotificationSettingsSection(id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", rows=");
        return m.n(k, (List)this.rows, ')');
    }
}
