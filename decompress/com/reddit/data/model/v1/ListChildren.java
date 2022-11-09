// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import java.util.List;

public class ListChildren<T>
{
    private String after;
    private String before;
    private List<T> children;
    private String modhash;
    private Pagination pagination;
    
    public String getAfter() {
        return this.after;
    }
    
    public List<T> getChildren() {
        return this.children;
    }
    
    public Pagination getPagination() {
        return this.pagination;
    }
    
    public static class Pagination
    {
        private PaginationData after;
        private PaginationData before;
        
        public PaginationData getAfter() {
            return this.after;
        }
        
        public PaginationData getBefore() {
            return this.before;
        }
    }
    
    public static class PaginationData
    {
        private String inbox;
        private String trending;
        
        public String getInbox() {
            return this.inbox;
        }
        
        public String getTrending() {
            return this.trending;
        }
    }
}
