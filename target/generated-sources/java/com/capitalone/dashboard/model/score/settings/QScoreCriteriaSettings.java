package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScoreCriteriaSettings is a Querydsl query type for ScoreCriteriaSettings
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScoreCriteriaSettings extends EntityPathBase<ScoreCriteriaSettings> {

    private static final long serialVersionUID = -1427806905L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScoreCriteriaSettings scoreCriteriaSettings = new QScoreCriteriaSettings("scoreCriteriaSettings");

    public final com.capitalone.dashboard.model.QBaseModel _super;

    public final QBuildScoreSettings build;

    //inherited
    public final StringPath clientReference;

    public final QComponentAlert componentAlert;

    public final QDeployScoreSettings deploy;

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Integer> maxScore = createNumber("maxScore", Integer.class);

    public final QQualityScoreSettings quality;

    public final QScmScoreSettings scm;

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final EnumPath<com.capitalone.dashboard.model.score.ScoreValueType> type = createEnum("type", com.capitalone.dashboard.model.score.ScoreValueType.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QScoreCriteriaSettings(String variable) {
        this(ScoreCriteriaSettings.class, forVariable(variable), INITS);
    }

    public QScoreCriteriaSettings(Path<? extends ScoreCriteriaSettings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScoreCriteriaSettings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScoreCriteriaSettings(PathMetadata metadata, PathInits inits) {
        this(ScoreCriteriaSettings.class, metadata, inits);
    }

    public QScoreCriteriaSettings(Class<? extends ScoreCriteriaSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QBaseModel(type, metadata, inits);
        this.build = inits.isInitialized("build") ? new QBuildScoreSettings(forProperty("build"), inits.get("build")) : null;
        this.clientReference = _super.clientReference;
        this.componentAlert = inits.isInitialized("componentAlert") ? new QComponentAlert(forProperty("componentAlert")) : null;
        this.deploy = inits.isInitialized("deploy") ? new QDeployScoreSettings(forProperty("deploy"), inits.get("deploy")) : null;
        this.id = _super.id;
        this.quality = inits.isInitialized("quality") ? new QQualityScoreSettings(forProperty("quality"), inits.get("quality")) : null;
        this.scm = inits.isInitialized("scm") ? new QScmScoreSettings(forProperty("scm"), inits.get("scm")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

