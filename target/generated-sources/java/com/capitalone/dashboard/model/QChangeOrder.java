package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChangeOrder is a Querydsl query type for ChangeOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChangeOrder extends EntityPathBase<ChangeOrder> {

    private static final long serialVersionUID = 1968115804L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChangeOrder changeOrder = new QChangeOrder("changeOrder");

    public final QBaseModel _super;

    public final StringPath approvalStatus = createString("approvalStatus");

    public final StringPath assignedTo = createString("assignedTo");

    public final StringPath assignmentGroup = createString("assignmentGroup");

    public final StringPath backoutDuration = createString("backoutDuration");

    public final StringPath category = createString("category");

    public final StringPath changeCoordinator = createString("changeCoordinator");

    public final StringPath changeID = createString("changeID");

    public final StringPath changeModel = createString("changeModel");

    public final StringPath changeOrderItem = createString("changeOrderItem");

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Long> closeTime = createNumber("closeTime", Long.class);

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath company = createString("company");

    public final StringPath coordinatorPhone = createString("coordinatorPhone");

    public final NumberPath<Long> dateEntered = createNumber("dateEntered", Long.class);

    public final StringPath extProjectRef = createString("extProjectRef");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath initiatedBy = createString("initiatedBy");

    public final BooleanPath open = createBoolean("open");

    public final StringPath phase = createString("phase");

    public final NumberPath<Long> plannedEnd = createNumber("plannedEnd", Long.class);

    public final NumberPath<Long> plannedStart = createNumber("plannedStart", Long.class);

    public final StringPath priority = createString("priority");

    public final StringPath reason = createString("reason");

    public final StringPath rFCType2 = createString("rFCType2");

    public final StringPath riskAssessment = createString("riskAssessment");

    public final StringPath service = createString("service");

    public final StringPath sLAAgreementID = createString("sLAAgreementID");

    public final StringPath status = createString("status");

    public final StringPath subcategory = createString("subcategory");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QChangeOrder(String variable) {
        this(ChangeOrder.class, forVariable(variable), INITS);
    }

    public QChangeOrder(Path<? extends ChangeOrder> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChangeOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChangeOrder(PathMetadata metadata, PathInits inits) {
        this(ChangeOrder.class, metadata, inits);
    }

    public QChangeOrder(Class<? extends ChangeOrder> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

