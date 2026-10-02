module "tags" {
  source  = "rhythmictech/tags/terraform"
  version = "1.0.0"

  enforce_case = "LOWER"
  names        = [var.name]
  tags         = var.tags
}

locals {
  # tflint-ignore: terrafor2m_unused_declarations
  name = module.tags.name
  # tflint-ignore: terraform_unused_declarations
  tags = module.tags.tags_no_name
}
