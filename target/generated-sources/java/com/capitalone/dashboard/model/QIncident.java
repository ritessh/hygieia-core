package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIncident is a Querydsl query type for Incident
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIncident extends EntityPathBase<Incident> {

    private static final long serialVersionUID = 1719542452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIncident incident = new QIncident("incident");

    public final QBaseModel _super;

    public final StringPath affectedBusinessServiceItem = createString("affectedBusinessServiceItem");

    public final StringPath affectedBusinessServiceItemSysId = createString("affectedBusinessServiceItemSysId");

    public final StringPath affectedBusinessServiceItemType = createString("affectedBusinessServiceItemType");

    public final StringPath affectedItem = createString("affectedItem");

    public final StringPath affectedItemSysId = createString("affectedItemSysId");

    public final StringPath affectedItemType = createString("affectedItemType");

    public final BooleanPath attachedToBusinessServiceOrEnvironmentOnly = createBoolean("attachedToBusinessServiceOrEnvironmentOnly");

    public final StringPath category = createString("category");

    //inherited
    public final StringPath clientReference;

    public final StringPath closedBy = createString("closedBy");

    public final NumberPath<Long> closedTime = createNumber("closedTime", Long.class);

    public final StringPath closureCode = createString("closureCode");

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath incidentDescription = createString("incidentDescription");

    public final StringPath incidentID = createString("incidentID");

    public final StringPath incidentItem = createString("incidentItem");

    public final StringPath incidentSysID = createString("incidentSysID");

    public final StringPath openedBy = createString("openedBy");

    public final NumberPath<Long> openTime = createNumber("openTime", Long.class);

    public final StringPath primaryAssignmentGroup = createString("primaryAssignmentGroup");

    public final StringPath severity = createString("severity");

    public final StringPath status = createString("status");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final NumberPath<Long> updatedTime = createNumber("updatedTime", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QIncident(String variable) {
        this(Incident.class, forVariable(variable), INITS);
    }

    public QIncident(Path<? extends Incident> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIncident(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIncident(PathMetadata metadata, PathInits inits) {
        this(Incident.class, metadata, inits);
    }

    public QIncident(Class<? extends Incident> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

