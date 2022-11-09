// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/modtools/ModUsersAdapterAction;", "", "Lcom/reddit/domain/modtools/ModToolsListItemModel;", "listItem", "Lpg2/j;", "onRowClicked", "onOptionsClicked", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface ModUsersAdapterAction
{
    void onOptionsClicked(final ModToolsListItemModel p0);
    
    void onRowClicked(final ModToolsListItemModel p0);
}
