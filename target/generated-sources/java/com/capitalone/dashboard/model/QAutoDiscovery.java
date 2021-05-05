package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAutoDiscovery is a Querydsl query type for AutoDiscovery
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAutoDiscovery extends EntityPathBase<AutoDiscovery> {

    private static final long serialVersionUID = -1750975457L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAutoDiscovery autoDiscovery = new QAutoDiscovery("autoDiscovery");

    public final QBaseModel _super;

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> allEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("allEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> artifactEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("artifactEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> buildEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("buildEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    //inherited
    public final StringPath clientReference;

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> codeRepoEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("codeRepoEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final NumberPath<Long> createdTimestamp = createNumber("createdTimestamp", Long.class);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> deploymentEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("deploymentEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> featureEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("featureEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> functionalTestEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("functionalTestEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> infraStructureScanEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("infraStructureScanEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> libraryScanEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("libraryScanEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final QAutoDiscoveryMetaData metaData;

    public final NumberPath<Long> modifiedTimestamp = createNumber("modifiedTimestamp", Long.class);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> performanceTestEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("performanceTestEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> securityScanEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("securityScanEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> staticCodeEntries = this.<AutoDiscoveredEntry, QAutoDiscoveredEntry>createList("staticCodeEntries", AutoDiscoveredEntry.class, QAutoDiscoveredEntry.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QAutoDiscovery(String variable) {
        this(AutoDiscovery.class, forVariable(variable), INITS);
    }

    public QAutoDiscovery(Path<? extends AutoDiscovery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAutoDiscovery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAutoDiscovery(PathMetadata metadata, PathInits inits) {
        this(AutoDiscovery.class, metadata, inits);
    }

    public QAutoDiscovery(Class<? extends AutoDiscovery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.metaData = inits.isInitialized("metaData") ? new QAutoDiscoveryMetaData(forProperty("metaData"), inits.get("metaData")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

