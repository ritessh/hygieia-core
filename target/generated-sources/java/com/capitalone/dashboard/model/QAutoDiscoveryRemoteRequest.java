package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAutoDiscoveryRemoteRequest is a Querydsl query type for AutoDiscoveryRemoteRequest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAutoDiscoveryRemoteRequest extends EntityPathBase<AutoDiscoveryRemoteRequest> {

    private static final long serialVersionUID = 1147254154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAutoDiscoveryRemoteRequest autoDiscoveryRemoteRequest = new QAutoDiscoveryRemoteRequest("autoDiscoveryRemoteRequest");

    public final QAutoDiscovery _super;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> allEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> artifactEntries;

    public final StringPath autoDiscoveryId = createString("autoDiscoveryId");

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> buildEntries;

    //inherited
    public final StringPath clientReference;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> codeRepoEntries;

    public final NumberPath<Long> createdTimeStamp = createNumber("createdTimeStamp", Long.class);

    //inherited
    public final NumberPath<Long> createdTimestamp;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> deploymentEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> featureEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> functionalTestEntries;

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> infraStructureScanEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> libraryScanEntries;

    // inherited
    public final QAutoDiscoveryMetaData metaData;

    public final NumberPath<Long> modifiedTimeStamp = createNumber("modifiedTimeStamp", Long.class);

    //inherited
    public final NumberPath<Long> modifiedTimestamp;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> performanceTestEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> securityScanEntries;

    //inherited
    public final ListPath<AutoDiscoveredEntry, QAutoDiscoveredEntry> staticCodeEntries;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QAutoDiscoveryRemoteRequest(String variable) {
        this(AutoDiscoveryRemoteRequest.class, forVariable(variable), INITS);
    }

    public QAutoDiscoveryRemoteRequest(Path<? extends AutoDiscoveryRemoteRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAutoDiscoveryRemoteRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAutoDiscoveryRemoteRequest(PathMetadata metadata, PathInits inits) {
        this(AutoDiscoveryRemoteRequest.class, metadata, inits);
    }

    public QAutoDiscoveryRemoteRequest(Class<? extends AutoDiscoveryRemoteRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QAutoDiscovery(type, metadata, inits);
        this.allEntries = _super.allEntries;
        this.artifactEntries = _super.artifactEntries;
        this.buildEntries = _super.buildEntries;
        this.clientReference = _super.clientReference;
        this.codeRepoEntries = _super.codeRepoEntries;
        this.createdTimestamp = _super.createdTimestamp;
        this.deploymentEntries = _super.deploymentEntries;
        this.featureEntries = _super.featureEntries;
        this.functionalTestEntries = _super.functionalTestEntries;
        this.id = _super.id;
        this.infraStructureScanEntries = _super.infraStructureScanEntries;
        this.libraryScanEntries = _super.libraryScanEntries;
        this.metaData = _super.metaData;
        this.modifiedTimestamp = _super.modifiedTimestamp;
        this.performanceTestEntries = _super.performanceTestEntries;
        this.securityScanEntries = _super.securityScanEntries;
        this.staticCodeEntries = _super.staticCodeEntries;
        this.upsertTime = _super.upsertTime;
    }

}

