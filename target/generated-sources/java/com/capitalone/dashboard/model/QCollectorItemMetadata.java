package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCollectorItemMetadata is a Querydsl query type for CollectorItemMetadata
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCollectorItemMetadata extends EntityPathBase<CollectorItemMetadata> {

    private static final long serialVersionUID = -1982427667L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollectorItemMetadata collectorItemMetadata = new QCollectorItemMetadata("collectorItemMetadata");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorId;

    public final org.bson.types.QObjectId collectorItemId;

    public final EnumPath<CollectorType> collectorType = createEnum("collectorType", CollectorType.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final DateTimePath<java.util.Date> lastUpdatedTime = createDateTime("lastUpdatedTime", java.util.Date.class);

    public final MapPath<String, Object, SimplePath<Object>> metadata = this.<String, Object, SimplePath<Object>>createMap("metadata", String.class, Object.class, SimplePath.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QCollectorItemMetadata(String variable) {
        this(CollectorItemMetadata.class, forVariable(variable), INITS);
    }

    public QCollectorItemMetadata(Path<? extends CollectorItemMetadata> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCollectorItemMetadata(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCollectorItemMetadata(PathMetadata metadata, PathInits inits) {
        this(CollectorItemMetadata.class, metadata, inits);
    }

    public QCollectorItemMetadata(Class<? extends CollectorItemMetadata> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

