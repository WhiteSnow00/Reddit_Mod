// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/model/Row;", "Landroid/os/Parcelable;", "()V", "id", "", "getId", "()Ljava/lang/String;", "title", "getTitle", "Group", "Range", "Toggle", "Lcom/reddit/domain/modtools/pnsettings/model/Row$Group;", "Lcom/reddit/domain/modtools/pnsettings/model/Row$Range;", "Lcom/reddit/domain/modtools/pnsettings/model/Row$Toggle;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class Row implements Parcelable
{
    private Row() {
    }
    
    public abstract String getId();
    
    public abstract String getTitle();
}
