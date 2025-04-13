variable "aws_region" {}
variable "cluster_name" {}
variable "docker_image" {}
variable "cpu" { default = "256" }
variable "memory" { default = "512" }
variable "log_group" {}
variable "subnets" {
  type = list(string)
}
