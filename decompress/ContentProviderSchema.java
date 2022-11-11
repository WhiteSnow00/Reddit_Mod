// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import android.net.Uri;

public class ContentProviderSchema
{
    private final String[] mProjection;
    private final String mTableName;
    private final Uri mUri;
    
    private ContentProviderSchema(final Builder builder) {
        this.mTableName = Table.access$100(Builder.access$000(builder));
        this.mUri = Table.access$200(Builder.access$000(builder));
        this.mProjection = Table.access$300(Builder.access$000(builder));
    }
    
    public String[] getProjection() {
        return this.mProjection;
    }
    
    public String getTableName() {
        return this.mTableName;
    }
    
    public Uri getUri() {
        return this.mUri;
    }
    
    public static class Builder
    {
        private Table mTable;
        
        public static /* synthetic */ Table access$000(final Builder builder) {
            return builder.mTable;
        }
        
        public ContentProviderSchema build() {
            return new ContentProviderSchema(this, null);
        }
        
        public Builder table(final Table mTable) {
            this.mTable = mTable;
            return this;
        }
    }
    
    public static class Table
    {
        private String[] mProjection;
        private String mTableName;
        private Uri mUri;
        
        private Table(final Builder builder) {
            this.mUri = Builder.access$500(builder);
            this.mProjection = Builder.access$600(builder);
            final String access$700 = Builder.access$700(builder);
            this.mTableName = access$700;
            if (access$700 == null) {
                this.mTableName = this.mUri.getLastPathSegment();
            }
        }
        
        public static /* synthetic */ String access$100(final Table table) {
            return table.mTableName;
        }
        
        public static /* synthetic */ Uri access$200(final Table table) {
            return table.mUri;
        }
        
        public static /* synthetic */ String[] access$300(final Table table) {
            return table.mProjection;
        }
        
        public static class Builder
        {
            private String[] mProjection;
            private String mTableName;
            private Uri mUri;
            
            public static /* synthetic */ Uri access$500(final Builder builder) {
                return builder.mUri;
            }
            
            public static /* synthetic */ String[] access$600(final Builder builder) {
                return builder.mProjection;
            }
            
            public static /* synthetic */ String access$700(final Builder builder) {
                return builder.mTableName;
            }
            
            public Table build() {
                return new Table(this, null);
            }
            
            public Builder name(final String mTableName) {
                this.mTableName = mTableName;
                return this;
            }
            
            public Builder projection(final String[] mProjection) {
                this.mProjection = mProjection;
                return this;
            }
            
            public Builder uri(final Uri mUri) {
                this.mUri = mUri;
                return this;
            }
        }
    }
}
