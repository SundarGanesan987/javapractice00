
output "hello" {
  description = "We want to cordinally greet all newcomers to terraform"
  value       = "world"
}

output "tags_module" {
  description = "Tags Module in it's entirety"
  value       = module.tags
}
