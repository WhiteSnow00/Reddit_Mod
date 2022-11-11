// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ak0.m;
import ah2.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/FileUploadLease;", "", "action", "", "fields", "", "Lcom/reddit/domain/model/FileUploadLease$Field;", "(Ljava/lang/String;Ljava/util/List;)V", "getAction", "()Ljava/lang/String;", "getFields", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Field", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FileUploadLease
{
    private final String action;
    private final List<Field> fields;
    
    public FileUploadLease(final String action, final List<Field> fields) {
        f.f((Object)action, "action");
        f.f((Object)fields, "fields");
        this.action = action;
        this.fields = fields;
    }
    
    public final String component1() {
        return this.action;
    }
    
    public final List<Field> component2() {
        return this.fields;
    }
    
    public final FileUploadLease copy(final String s, final List<Field> list) {
        f.f((Object)s, "action");
        f.f((Object)list, "fields");
        return new FileUploadLease(s, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileUploadLease)) {
            return false;
        }
        final FileUploadLease fileUploadLease = (FileUploadLease)o;
        return f.a((Object)this.action, (Object)fileUploadLease.action) && f.a((Object)this.fields, (Object)fileUploadLease.fields);
    }
    
    public final String getAction() {
        return this.action;
    }
    
    public final List<Field> getFields() {
        return this.fields;
    }
    
    @Override
    public int hashCode() {
        return this.fields.hashCode() + this.action.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FileUploadLease(action=");
        k.append(this.action);
        k.append(", fields=");
        return m.n(k, (List)this.fields, ')');
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/FileUploadLease$Field;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Field
    {
        public final String name;
        public final String value;
        
        public Field(final String name, final String value) {
            f.f((Object)name, "name");
            this.name = name;
            this.value = value;
        }
        
        public final String component1() {
            return this.name;
        }
        
        public final String component2() {
            return this.value;
        }
        
        public final Field copy(final String s, final String s2) {
            f.f((Object)s, "name");
            return new Field(s, s2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Field)) {
                return false;
            }
            final Field field = (Field)o;
            return f.a((Object)this.name, (Object)field.name) && f.a((Object)this.value, (Object)field.value);
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.name.hashCode();
            final String value = this.value;
            int hashCode2;
            if (value == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = value.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Field(name=");
            k.append(this.name);
            k.append(", value=");
            return b.k(k, this.value, ')');
        }
    }
}
