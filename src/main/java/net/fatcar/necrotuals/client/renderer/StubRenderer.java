
package net.fatcar.necrotuals.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.fatcar.necrotuals.entity.StubEntity;
import net.fatcar.necrotuals.client.model.animations.stubAnimation;
import net.fatcar.necrotuals.client.model.Modelstub;

public class StubRenderer extends MobRenderer<StubEntity, Modelstub<StubEntity>> {
	public StubRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelstub.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StubEntity entity) {
		return new ResourceLocation("necrotuals:textures/entities/stub.png");
	}

	private static final class AnimatedModel extends Modelstub<StubEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<StubEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(StubEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, stubAnimation.Idle, ageInTicks, 1f);
				this.animateWalk(stubAnimation.Walking, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(StubEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
