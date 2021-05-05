package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeployScoreSettings is a Querydsl query type for DeployScoreSettings
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QDeployScoreSettings extends BeanPath<DeployScoreSettings> {

    private static final long serialVersionUID = -1486466591L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeployScoreSettings deployScoreSettings = new QDeployScoreSettings("deployScoreSettings");

    public final QScoreComponentSettings _super = new QScoreComponentSettings(this);

    //inherited
    public final SimplePath<ScoreCriteria> criteria = _super.criteria;

    public final QScoreComponentSettings deploySuccess;

    //inherited
    public final BooleanPath disabled = _super.disabled;

    public final QScoreComponentSettings intancesOnline;

    //inherited
    public final NumberPath<Integer> weight = _super.weight;

    public QDeployScoreSettings(String variable) {
        this(DeployScoreSettings.class, forVariable(variable), INITS);
    }

    public QDeployScoreSettings(Path<? extends DeployScoreSettings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeployScoreSettings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeployScoreSettings(PathMetadata metadata, PathInits inits) {
        this(DeployScoreSettings.class, metadata, inits);
    }

    public QDeployScoreSettings(Class<? extends DeployScoreSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deploySuccess = inits.isInitialized("deploySuccess") ? new QScoreComponentSettings(forProperty("deploySuccess")) : null;
        this.intancesOnline = inits.isInitialized("intancesOnline") ? new QScoreComponentSettings(forProperty("intancesOnline")) : null;
    }

}

