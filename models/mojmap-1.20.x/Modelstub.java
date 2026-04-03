// Made with Blockbench 5.1.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelstub<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stub"), "main");
	private final ModelPart All_Body;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public Modelstub(ModelPart root) {
		this.All_Body = root.getChild("All_Body");
		this.head = this.All_Body.getChild("head");
		this.body = this.All_Body.getChild("body");
		this.left_arm = this.All_Body.getChild("left_arm");
		this.right_arm = this.All_Body.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition All_Body = partdefinition.addOrReplaceChild("All_Body", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 22.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = All_Body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -1.2654F, 0.0F, 0.0F));

		PartDefinition body = All_Body.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F,
				0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_arm = All_Body.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, -0.0873F, 0.0F, -2.7925F));

		PartDefinition right_arm = All_Body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, -0.0873F, 0.0F, 2.7925F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		All_Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_arm.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}